from django.shortcuts import render, redirect
from django.http import HttpResponse, HttpRequest
from .models import Ogrenci, Ogretmen

def ogrenciListele(request):
    ogrenciler = {'ogrenciListesi': Ogrenci.objects.all()}
    return render(request, 'veriler/ogrenci_sayfasi.html', ogrenciler)

def ogrenciEkle(request:HttpRequest):
    ogrenci = Ogrenci(isim = request.POST['isim'], soyisim = request.POST['soyisim'], bolum = request.POST['bolum'])
    ogrenci.save()
    return redirect('/anasayfa/ogrenciSayfasi/')

def ogrenciSil(request, ogrenci_id):
    silinecekOgrenci = Ogrenci.objects.get(id = ogrenci_id)
    silinecekOgrenci.delete()
    return redirect('/anasayfa/ogrenciSayfasi/')

def ogretmenListele(request):
    ogretmenler = {'ogretmenListesi': Ogretmen.objects.all()}
    return render(request, 'veriler/ogretmen_sayfasi.html', ogretmenler)

def ogretmenEkle(request:HttpRequest):
    ogretmen = Ogretmen(isim = request.POST['isim'], soyisim = request.POST['soyisim'], maas = request.POST['maas'])
    ogretmen.save()
    return redirect('/anasayfa/ogretmenSayfasi/')

def ogretmenSil(request, ogretmen_id):
    silinecekOgretmen = Ogretmen.objects.get(id = ogretmen_id)
    silinecekOgretmen.delete()
    return redirect('/anasayfa/ogretmenSayfasi/')



