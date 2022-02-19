from django.urls import path
from . import views

urlpatterns = [
    path('shows/',views.Index ),
    path('shows/new',views.New),
    path('shows/new/create',views.Create),
    path('shows/<int:id>' ,views.Show),
    path('shows/<int:id>/edit',views.view_update),
    path('shows/<int:id>/edit/edit',views.update),
    path('shows/<int:id>/delete',views.view_destroy),
    path('shows/<int:id>/delete/destroy',views.destroy),
]