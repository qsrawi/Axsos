from django.shortcuts import render,HttpResponse

def index(request):
    return render(request,'index.html')


def result(request):
    name = request.POST['username']
    location = request.POST['location']
    language=request.POST['language']
    comment=request.POST['comment']
    context = {
        "name" : name,
        "location" : location,
        "language":language,
        "comment":comment,
    }
    return render(request,'result.html',context)

# Create your views here.
