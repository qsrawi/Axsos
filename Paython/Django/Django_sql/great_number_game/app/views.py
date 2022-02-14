import random
from django.shortcuts import render,redirect
def index(request):
    request.session['rand_num']=random.randint(1, 100)
    print("random"+"  " +str(request.session['rand_num']))
    return render(request,"index.html")


def compare(request):
    request.session['guss']=int(request.POST['guss'])
    if request.session['guss']>request.session['rand_num']:
        request.session['width']='290px'
        request.session['bg_color']='rgb(163, 33, 33)'
        request.session['padding']='100px 64px'
        request.session['name']='too high !'
        request.session['border']='3px solid black'

    elif request.session['guss']<request.session['rand_num']:
        request.session['width']='290px'
        request.session['bg_color']='rgb(163, 33, 33)'
        request.session['padding']='100px 64px'
        request.session['name']='too low !'
        request.session['border']='3px solid black'

    elif request.session['guss']==request.session['rand_num']:
        request.session['width']='350px'
        request.session['bg_color']='green'
        request.session['padding']='100px 64px'
        request.session['name']='thats correct !'
        request.session['border']='3px solid black'


    return redirect ('/')
# Create your views here.
