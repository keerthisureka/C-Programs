from django.http import HttpResponse
from django.shortcuts import render

from app7.models import Course, Student

# Create your views here.
def register(request):
    if request.method == "POST":
        sid = request.POST.get('sname')
        cid = request.POST.get('cname')
        student = Student.objects.get(id=sid)
        course = Course.objects.get(id=cid)
        res = student.enrolment.filter(id=cid)

        if res:
            return HttpResponse("<h2 style='color: red'>Student already enrolled!</h2>")
        
        student.enrolment.add(course)
        return HttpResponse("<h2 style='color: green'>Student enrolled successfully!</h2>")
    else:
        students = Student.objects.all()
        courses = Course.objects.all()

        return render(request, "enroll.html", {"students": students, "courses": courses})
    
def course_search(request):
    if request.method == "POST":
        cid = request.POST.get('cname')
        s = Student.objects.all()

        student_list = list()
        
        for stud in s:
            if stud.enrolment.filter(id=cid):
                student_list.append(stud)

        if len(student_list) == 0:
            return HttpResponse("<h2 style='color: red'>No students enrolled in this course!</h2>")
        
        return render(request, "selected_students.html", {"student_list": student_list})
    else:
        courses = Course.objects.all()

        return render(request, "course_search.html", {"courses": courses})