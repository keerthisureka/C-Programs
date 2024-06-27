from django.template import loader
from django.shortcuts import render

# Create your views here.
def show_fruits_and_students(request):
    teemplate = loader.get_template("mytemplate.html")
    context = {
        "fruits": ["Apple", "Banana", "Orange", "Strawberry", "Mango"],
        "students": ["Akash", "Sumit", "Priya", "Prisha", "Diya"]
    }
    return render(request, "mytemplate.html", context)
