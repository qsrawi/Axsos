from django.shortcuts import render,redirect
from books_authors_app.models import *
def book(request):
    context={
        'books':Book.objects.all(),
    }
    return render(request,'books.html',context)


def add_book(request):
    Book.objects.create(title=request.POST['title'],description=request.POST['desc'])
    return redirect('/')


def view_book(request,id):
    context={
        'book':Book.objects.get(id=id),
        'authors':Publisher.objects.all()
    }
    return render(request,'books_view.html',context)

def add_author_to_book(request,id):
    book=Book.objects.get(id=id)
    book.publishers.add(Publisher.objects.get(id=request.POST['author']))
    return redirect(f'/book/{id}')
    

def author(request):
    context={
        'authors':Publisher.objects.all(),
    }
    return render(request,'publishers.html',context)


def add_author(request):
    Publisher.objects.create(first_name=request.POST['first_name'],last_name=request.POST['last_name'],
    notes=request.POST['notes'])
    return redirect('/author')

def view_author(request,id):
    context={
        'author':Publisher.objects.get(id=id),
        'books':Book.objects.all()
    }
    return render(request,'publishers_view.html',context)

def add_book_to_author(request,id):
    author=Publisher.objects.get(id=id)
    author.books.add(Book.objects.get(id=request.POST['book']))
    return redirect(f'/author/{id}')
    
# Create your views here.
