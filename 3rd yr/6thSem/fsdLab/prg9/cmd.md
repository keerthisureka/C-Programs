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
<br/>

Adding Student data in the backend:
```
>>> from app9.models import Student
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

To display the inserted values:
```
Student.objects.all().values()
```

To quit the prompt, type the command:
```
quit()
```
