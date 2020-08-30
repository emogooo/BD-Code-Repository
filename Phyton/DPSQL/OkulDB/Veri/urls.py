from django.urls import path
from . import views

urlpatterns =[
    path('listele/', views.ogrencileriListele),
    path('ogrenciEkle', views.ogrenciEkle, name='ogrenciEkle'),
    path('ogrenciSil/<int:ogrenci_id>/', views.ogrenciSil, name='ogrenciSil')
]