from django.contrib import admin

from app13.models import Course, Student

# Register your models here.
admin.site.register(Student)
admin.site.register(Course)