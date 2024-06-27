import datetime
from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
def show_current_datetime(request):
    now = datetime.datetime.now()
    resp = "<h2>Current date and time is %s</h2>" % (now)
    return HttpResponse(resp)