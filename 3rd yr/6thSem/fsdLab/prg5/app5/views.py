from django.shortcuts import render

# Create your views here.
def show_fruits_and_students(request):
    context = {
        "fruits": ["Apple", "Banana", "Orange", "Strawberry", "Mango"],
        "students": ["Akash", "Sumit", "Priya", "Prisha", "Diya"]
    }
    return render(request, "mytemplate.html", context)