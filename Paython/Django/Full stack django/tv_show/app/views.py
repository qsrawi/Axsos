from msilib.schema import MoveFile
from multiprocessing import context
from platform import release
from django.shortcuts import render,redirect
from app.models import *
from django.contrib import messages

def Index(request):
    context={
        'shows':Movie.objects.all()
    }
    return render(request,'shows.html',context)

def New(request):
    return render(request,'add_show.html')


def Create(request):
    errors=Movie.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request ,value)
        return redirect('/shows/new')
# IF THERE IS NO ERRORS
    Movie.objects.create(title=request.POST['title'],
    network=request.POST['network'],
    release_date=request.POST['release'],
    description=request.POST['desc'])
    return redirect("/shows")


def Show(request,id):
    context={
        'show': Movie.objects.get(id=id)
    }
    return render (request,'show_show.html',context)

def view_update(request,id):
    context={
        'show':Movie.objects.get(id=id)
    }
    return render (request,'edit_show.html',context)

def update(request,id):
    errors=Movie.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request ,value)
        return redirect('/shows/new')
# IF THERE IS NO ERRORS
    show=Movie.objects.get(id=id)
    id=show.id
    show.title=request.POST['title']
    show.network=request.POST['network']
    show.release_date=request.POST['release']
    show.description=request.POST['desc']
    show.save()
    return redirect (f'/shows/{id}')


def view_destroy(request,id):
    context={
        'show':Movie.objects.get(id=id)
    }
    return render (request,'delete.html',context)


def destroy(request,id):
    show=Movie.objects.get(id=id)
    id=show.id
    show.delete()
    return redirect ('/shows')
# Create your views here.
