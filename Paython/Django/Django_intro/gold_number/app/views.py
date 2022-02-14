from django.shortcuts import render,redirect
import random
from time import gmtime, strftime

def index(request):
    return render(request,"index.html")


def process(request):
    request.session['color']='green'
    request.session['time']=strftime("%Y-%m-%d %H:%M %p", gmtime())

    if not 'txt' in request.session:
        request.session['txt']=[]

    if not 'sum' in request.session:
        request.session['sum']=0

    if request.POST['which_form']=='farm':
        request.session['place']='farm'
        request.session['gold']=random.randint(10,20)
        print(str(request.session['gold']))
        request.session['sum'] +=request.session['gold']
        request.session['txt'].append(f"Earned   {request.session['gold']}   golds from the {request.session['place']}  in  {request.session['time']}")

    elif request.POST['which_form']=='cave':
        request.session['place']='cave'
        request.session['gold']=random.randint(5,10)
        print(str(request.session['gold']))
        request.session['sum'] +=request.session['gold']
        request.session['txt'].append(f"Earned   {request.session['gold']}   golds from the {request.session['place']}  in  {request.session['time']}")

    elif request.POST['which_form']=='house':
        request.session['place']='house'
        request.session['gold']=random.randint(2,5)
        print(str(request.session['gold']))
        request.session['sum'] +=request.session['gold']
        request.session['txt'].append(f"Earned   {request.session['gold']}   golds from the {request.session['place']}  in  {request.session['time']}")

    elif request.POST['which_form']=='casino':
        request.session['place']='casino'
        request.session['gold']=random.randint(-50,50)
        print(str(request.session['gold']))
        request.session['sum'] +=request.session['gold']
        if request.session['gold']>=0:
            request.session['txt'].append(f"Earned   {request.session['gold']}   golds from the {request.session['place']}  in  {request.session['time']}")
        else:
            request.session['txt'].append(f"Enterd a casino and lost  {request.session['gold']}  golds..... Ouch...  {request.session['time']}")
            request.session['color']='red'
    return redirect('/')
def destroy(request):
    del request.session['sum']
    del request.session['gold']
    del request.session['txt']
    return redirect('/')

# Create your views here.
