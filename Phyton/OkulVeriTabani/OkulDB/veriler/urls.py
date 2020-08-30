from django.urls import path
from . import views

urlpatterns =[
    path('ogrenciSayfasi/', views.ogrenciListele),
    path('ogrenciEkle/', views.ogrenciEkle, name='ogrenciEkle'),
    path('ogrenciSil/<int:ogrenci_id>/', views.ogrenciSil, name='ogrenciSil'),
    path('ogretmenSayfasi/', views.ogretmenListele),
    path('ogretmenEkle/', views.ogretmenEkle, name='ogretmenEkle'),
    path('ogretmenSil/<int:ogretmen_id>/', views.ogretmenSil, name='ogretmenSil')
]