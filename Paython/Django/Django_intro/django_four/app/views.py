from django.shortcuts import render


def index(request):
    if not 'count' in request.session:
        request.session['count']=0 
    else:
        request.session['count']+=1
    return render(request,"index.html")
# Create your views here.
