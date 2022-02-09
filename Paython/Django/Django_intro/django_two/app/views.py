from time import gmtime, strftime
from django.shortcuts import render,HttpResponse

def index(request):
    context = {
        "time1": strftime("%b %d,  %Y" , gmtime()),
        "time2": strftime("%H:%M %p", gmtime())
    }
    return render(request,'index.html', context)
# Create your views here.
