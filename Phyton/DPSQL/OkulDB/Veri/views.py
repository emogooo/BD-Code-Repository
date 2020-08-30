from django.shortcuts import render, redirect
from django.http import HttpResponse, HttpRequest
from .models import Ogrenci

def ogrencileriListele(request):
    context ={'ogrenciListesi' : Ogrenci.objects.all()}
    return render(request,'Veri/veri_list.html', context)

def ogrenciEkle(request:HttpRequest):
    ogrenci = Ogrenci(context = request.POST['context'])
    ogrenci.save()
    return redirect ('/Veri/listele/')

def ogrenciSil(request, ogrenci_id):
    silinecekOgrenci = Ogrenci.objects.get(id = ogrenci_id)
    silinecekOgrenci.delete()
    return redirect('/Veri/listele/')