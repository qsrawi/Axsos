from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('process',views.process),
    path('wall',views.wall),
    path('logout',views.logout),
    path('wall/new',views.add_message),
    path('wall/comment',views.add_comment)
]
