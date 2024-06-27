## Commands to create a django web application:
- Create a Virtual Environment:
  > python -m venv env_name

- Activate venv:
  - for Ubuntu/Linux/MacOS:
    > source env_name/bin/activate
  - for Windows:
    > env_name\Scripts\activate.bat

- Install Django:
  > pip install django

- Create a new django project:
  > django-admin startproject project_name

- Go to project directory:
  > cd project_name

- Create a django app within the project:
  > python manage.py startapp app_name

- Run the server to open default django page:
  > python manage.py runserver


**NOTE:** Create your own virtual environment and activate it using the commands mentioned in this file. The env file in this directory is just for demo purposes.
