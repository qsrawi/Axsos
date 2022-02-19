from contextlib import redirect_stderr
from app.models import *
from django.shortcuts import render,redirect
from django.contrib import messages
def index(request):
    return render(request,'index.html')

def sucess(request):
    return render(request,'success.html')


def process(request):
#Register
    if request.POST['which']=='reg':
#Register Validation
        errors=User.objects.register_valedator(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request,value)
            return redirect('/')
#Register Process
        User.objects.create(first_name=request.POST['first_name'],
        last_name=request.POST['last_name'],
        email=request.POST['email'],
        password=request.POST['password'])
        request.session['user']=User.objects.get(email=request.POST['email']).first_name
        return redirect('/sucess')
#Login
    if request.POST['which']=='login':
#Login validation
        errors=User.objects.login_valedator(request.POST)
        if len(errors)>0:
            for key, value in errors.items():
                messages.error(request,value)
            return redirect('/')
        if  (not User.objects.filter(email=request.POST['email'])) :
            messages.error(request,'your email is not regestired')
            return redirect('/')
        if (not User.objects.filter(password=request.POST['password'])):
            messages.error(request,'incorrect password')
            return redirect('/')
        email = User.objects.get(email=request.POST['email'])
        pas = User.objects.get(password=request.POST['password'])
        if email.id !=pas.id:
            messages.error(request,'incorrect password or email')
            return redirect('/')
        # if request.POST['email'] != request.POST['password']
        #     return redirect('/')
#login Process
        request.session['user']=User.objects.get(email=request.POST['email']).first_name
        return redirect('/sucess')



# Create your views here.
