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


'''
# This is for accepting the offset value from the user in the url and pass it to the function (The name given here for offset value is os).

def show_offset_datetime(request, os):
    try:
        os = int(os)
    except ValueError:
        return HttpResponse("Invalid offset value", status=400)
    now = datetime.datetime.now()
    ahead = now + datetime.timedelta(hours=os)
    behind = now - datetime.timedelta(hours=os)
    resp = "<h2>Current date and time is %s</h2>" % (now)
    resp += "<h2>%s hours ahead date and time is %s</h2>" % (os, ahead)
    resp += "<h2>%s hours behind date and time is %s</h2>" % (os, behind)
    return HttpResponse(resp)
'''
