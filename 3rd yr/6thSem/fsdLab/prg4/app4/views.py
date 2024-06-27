import datetime
from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
def show_offset_datetime(request):
    now = datetime.datetime.now()
    ahead = now + datetime.timedelta(hours=4)
    behind = now - datetime.timedelta(hours=4)
    resp = "<h2>Current date and time is %s</h2>" % (now)
    resp += "<h2>Four hours ahead date and time is %s</h2>" % (ahead)
    resp += "<h2>Four hours behind date and time is %s</h2>" % (behind)
    return HttpResponse(resp)