from django.urls import path,include
from . import views

urlpatterns = [
    path('',views.add),
    path('process',views.process)
]