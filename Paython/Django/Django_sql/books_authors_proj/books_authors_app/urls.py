from django.urls import path
from . import views

urlpatterns = [
    path('', views.book),
    path('add_book',views.add_book),
    path('book/<int:id>',views.view_book),
    path('book/<int:id>/add_author_to_book',views.add_author_to_book),
    path('author', views.author),
    path('add_author',views.add_author),
    path('author/<int:id>',views.view_author),
    path('author/<int:id>/add_book_to_author',views.add_book_to_author),
]
