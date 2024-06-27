## Commands to create a django web application:
- Create a Virtual Environment:
  ```
  python -m venv env_name
  ```

- Activate venv:
  - for Ubuntu/Linux/MacOS:
    ```
    source env_name/bin/activate
    ```
  - for Windows:
    ```
    env_name\Scripts\activate.bat
    ```

- Install Django:
  ```
  pip install django
  ```

- Create a new django project:
  ```
  django-admin startproject project_name
  ```

- Go to project directory:
  ```
  cd project_name
  ```

- Create a django app within the project:
  ```
  python manage.py startapp app_name
  ```

- Run the server to open default django page:
  ```
  python manage.py runserver
  ```


**NOTE:** Create your own virtual environment and activate it using the commands mentioned in this file. The env file in this directory is just for demo purposes.

<br />

## Questions for each program:
- **prg3:** Develop a Django app that displays current date and time in server.
- **prg4:** Develop a Django app that displays date and time four hours ahead and four hours before as an offset of current date and time in server.
- **prg5:** Develop a simple Django app that displays an unordered list of fruits and ordered list of selected students for an event.
- **prg6:** Develop a layout.html with a suitable header (containing navigation menu) and footer with copyright and developer information. Inherit this layout.html and create 3 additional pages: contact us, About Us and Home page of any website.
- **prg7:** Develop a Django app that performs student registration to a course. It should also display list of students registered for any selected course. Create students and course as models with enrolment as ManyToMany field.
- **prg8:** For student and course models created in Lab experiment for Module2, register admin interfaces, perform migrations and illustrate data entry through admin forms.
- **prg9:** Develop a Model form for student that contains his topic chosen for project, languages used and duration with a model called project.
- **prg10:** For students enrolment developed in Module 2, create a generic class view which displays list of students and detailview that displays student details for any selected student in the list.
- **prg11:** Develop example Django app that performs CSV and PDF generation for any models created in previous laboratory component.
- **prg12:** Develop a registration page for student enrolment as done in Module 2 but without page refresh using AJAX.
- **prg13:** Develop a search application in Django using AJAX that displays courses enrolled by a student being searched.
