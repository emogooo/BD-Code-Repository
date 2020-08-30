from django.db import models

class Ogrenci(models.Model):
    isim = models.TextField()
    soyisim = models.TextField()
    bolum = models.TextField()

class Ogretmen(models.Model):
    isim = models.TextField()
    soyisim = models.TextField()
    maas = models.TextField()
