### Commands to input data into db.sqlite3:
Firstly, write the codes in all required files.
<br />
Then type the following commands in the terminal:
```
python manage.py makemigrations
python manage.py migrate
```
To write the commands in the terminal, execute the following command:
```
python manage.py shell
```

Now you'll get the terminal prompt as >>>
<br/><br />
Adding Course data in the backend:
```
>>> from app7.models import Course
>>> Course.objects.all()
>>> Course.objects.all().values()

>>> course1 = Course(course_code='21CS61', course_name='S/W Engg', course_credits=3)
>>> course2 = Course(course_code='21CS62', course_name='Full Stack Web Development', course_credits=4)
>>> course3 = Course(course_code='21CS63', course_name='Computer Graphics', course_credits=3)
>>> course4 = Course(course_code='21CS644', course_name="Data Science and Visualization", course_credits=3)
>>> course5 = Course(course_code="21CS65", course_name='OE', course_credits=3)
>>> courseList = [course1, course2, course3, course4, course5]
>>> for c in courseList:
  ...  c.save()
```
Adding Student data in the backend:
```
>>> from app7.models import Student
>>> Student.objects.all()
>>> Student.objects.all().values()

>>> stud1 = Student(student_usn='1PE21CS001', student_name='Pankaj', student_sem=6)
>>> stud2 = Student(student_usn='1PE21CS002', student_name="Bhaskar", student_sem=6)
>>> stud3 = Student(student_usn='1PE21CS003', student_name='Supriya', student_sem=6)
>>> stud4 = Student(student_usn='1PE21CS004', student_name="Bhavya", student_sem=6)
>>> studList = [stud1, stud2, stud3, stud4]
>>> for s in studList:
  ...  s.save()
```
