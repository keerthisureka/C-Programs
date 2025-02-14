"""
URL configuration for prg6 project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/5.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path

from app6.views import show_aboutus_page, show_contactus_page, show_home_page

urlpatterns = [
    path('admin/', admin.site.urls),
    path('home/', show_home_page),
    path('aboutus/', show_aboutus_page),
    path('contactus/', show_contactus_page),
]
