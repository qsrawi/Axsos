from django.shortcuts import render,redirect

from app.models import *
def add(request):
    context={
        'all_dojo':Dojo.objects.all(),
        'all_ninga':Ninga.objects.all()
    }
    return render(request,'index.html',context)


def process(request):
    if request.POST['which']=='dojo':
        Dojo.objects.create(name=request.POST['name'],city=request.POST['city'],state=request.POST['state'])
    elif request.POST['which']=='ninga':
        Ninga.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],
        dojo=Dojo.objects.get(id=request.POST['dojo']))
    return redirect('/')
# Create your views here.
