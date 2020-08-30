from random import *

mayin = 1
bosAlan = 0
satir = 0
sutun = 0

def tarlaCiz(mayinDizisi):
    for i in range(satir):
        for j in range(sutun):
            if(mayinDizisi[i][j] == -1):
                print('0', end=' ')
            else:
                print('*', end=' ')
        print()


def tarlaCizSon(mayinDizisi):
    for i in range(satir):
        for j in range(sutun):
            if(mayinDizisi[i][j] == -1):
                print('0', end=' ')
            else:
                print(mayinDizisi[i][j], end=' ')
        print()

def tarlaOlustur():
    mayinDizisi = [[0 for i in range(sutun)] for j in range(satir)]
    return mayinDizisi

def tarlayiEk(mayinDizisi,zorluk):
    for i in range(satir):
        for j in range(sutun):
            mayinSayisi = randint(0,220) + zorluk
            if(mayinSayisi<200):
                mayinSayisi=0
            else:
                mayinSayisi=1

            mayinDizisi[i][j] = mayinSayisi
    return mayinDizisi

def init():
    global satir
    global sutun
    satir = int(input("Lütfen oyunun satır sayısını giriniz."))
    sutun = int(input("Lütfen oyunun sütun sayısını giriniz."))
    mayinDizisi = tarlaOlustur()
    zorluk = int(input("Lütfen 20 ile 80 arasında olacak şekilde oyunun zorluk derecesini giriniz"))
    mayinDizisi = tarlayiEk(mayinDizisi,zorluk)
    tarlaCiz(mayinDizisi)
    return mayinDizisi

def oyna(mayinDizisi):
    skor = 0

    while True:
        satirK = int(input("Satırı girin"))
        sutunK = int(input("Sütunu girin"))

        if (mayinDizisi[satirK][sutunK] == bosAlan):
            skor += 4
            mayinDizisi[satirK][sutunK] = -1
            tarlaCiz(mayinDizisi)

        elif (mayinDizisi[satirK][sutunK] == mayin):
            print("Oyunu kaybettiniz. Skorunuz: {}".format(skor))
            tarlaCizSon(mayinDizisi)
            break

        elif (mayinDizisi[satirK][sutunK] == -1):
            print("Bu alanı zaten seçmiştiniz.")


def main():
    mayinDizisi = init()
    oyna(mayinDizisi)

main()