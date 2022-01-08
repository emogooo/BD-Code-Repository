import os.path
dosyaAdi = "ogrenciVeriTabani.txt"

class Ogrenci:
    def __init__(self,no,isim,bolum):
        self.no = no
        self.isim=isim
        self.bolum=bolum

def satirSayisiniOgren():
    dosya = open(dosyaAdi, "r")
    sayac = 0
    for i in dosya:
        sayac += 1
    dosya.close()
    return sayac

def ogrenciEkle2(ogrenci):
    if os.path.isfile(dosyaAdi) and os.access(dosyaAdi, os.R_OK):
        try:
            dosya = open(dosyaAdi, "r")
            sayi = 0
            satir = 1
            satirSayisi = satirSayisiniOgren()
            while ogrenci.no > sayi:
                sayi = int(dosya.readline())
                for i in range(3):
                    dosya.readline()
                satir+=4
                if satirSayisi == (satir - 1):
                    dosya.close()
                    dosya = open(dosyaAdi,"a")
                    dosya.write(str(ogrenci.no) + "\n" + ogrenci.isim + "\n" + ogrenci.bolum + "\n\n")
                    dosya.close()
                    return
            dosya.seek(0)
            oncekiBilgiler = ""
            sonrakiBilgiler = ""
            for i in range(satir-5):
                oncekiBilgiler += dosya.readline()
            for i in range(satirSayisi - (satir - 5)):
                sonrakiBilgiler += dosya.readline()
            dosya.close()
            dosya = open(dosyaAdi, "w")
            dosya.write(oncekiBilgiler)
            dosya.write(str(ogrenci.no) + "\n" + ogrenci.isim + "\n" + ogrenci.bolum + "\n\n")
            dosya.write(sonrakiBilgiler)
            dosya.close()
        except Exception:
            print("Hata")
        finally:
            dosya.close()
    else:
        dosya = open(dosyaAdi, "w")
        dosya.write(str(ogrenci.no) + "\n" + ogrenci.isim + "\n" + ogrenci.bolum + "\n\n")
        dosya.close()

def ogrenciEkle(ogrenci):
    if os.path.isfile(dosyaAdi) and os.access(dosyaAdi, os.R_OK):
        try:
            ogrenciSayisi = int(satirSayisiniOgren() / 4)
            if ogrenciSayisi%2 == 0:
                eleman = int(ogrenciSayisi / 2)
            else:
                eleman = int((ogrenciSayisi / 2) + 1)
            elemanSatiri = int((eleman * 4) - 3)
            oncekiEleman = 0
            buyukDeger = ogrenciSayisi
            kucukDeger = 0
            ksk = False
            dosya = open(dosyaAdi, "r")

            while not eleman == oncekiEleman:
                dosya.seek(0)
                for i in range(elemanSatiri-1):
                    dosya.readline()
                sayi = int(dosya.readline())
                oncekiEleman = eleman
                if ogrenci.no < sayi:
                    buyukDeger = eleman
                    if (eleman + kucukDeger) % 2 == 0:
                        eleman = int((eleman + kucukDeger) / 2)
                    else:
                        eleman = int(((eleman + kucukDeger) / 2) + 1)
                    ksk = True
                else:
                    kucukDeger = eleman
                    if (eleman + buyukDeger) % 2 == 0:
                        eleman = int((eleman + buyukDeger) / 2)
                    else:
                        eleman = int(((eleman + buyukDeger) / 2) + 1)
                    ksk = False
                elemanSatiri = (eleman * 4) - 3

            oncekiBilgiler = ""
            sonrakiBilgiler = ""
            dosya.seek(0)
            if ksk:
                for i in range(elemanSatiri - 1):
                    oncekiBilgiler += dosya.readline()
                for i in range(satirSayisiniOgren() - (elemanSatiri - 1)):
                    sonrakiBilgiler += dosya.readline()
            else:
                if elemanSatiri + 3 == satirSayisiniOgren():
                    dosya = open(dosyaAdi, "a")
                    dosya.write(str(ogrenci.no) + "\n" + ogrenci.isim + "\n" + ogrenci.bolum + "\n\n")
                    dosya.close()
                    return

                for i in range(elemanSatiri + 3):
                    oncekiBilgiler += dosya.readline()
                for i in range(satirSayisiniOgren() - (elemanSatiri + 3)):
                    sonrakiBilgiler += dosya.readline()
            dosya.close()
            dosya = open(dosyaAdi, "w")
            dosya.write(oncekiBilgiler)
            dosya.write(str(ogrenci.no)+"\n"+ogrenci.isim+"\n"+ogrenci.bolum+"\n\n")
            dosya.write(sonrakiBilgiler)
            dosya.close()
        except Exception:
            print("Hata")
        finally:
            dosya.close()
    else:
        dosya = open(dosyaAdi, "w")
        dosya.write(str(ogrenci.no) + "\n" + ogrenci.isim + "\n" + ogrenci.bolum + "\n\n")
        dosya.close()

def ogrenciAra(no):
    if os.path.isfile(dosyaAdi) and os.access(dosyaAdi, os.R_OK):
        try:
            dosya = open(dosyaAdi, "r")
            sayi = int(dosya.readline())
            if sayi == no:
                print("Öğrenci adı:", dosya.readline(),end='')
                print("Öğrenci bölümü", dosya.readline())
                dosya.close()
                return

            satirSayaci = 0
            kontrol = True
            while no > sayi:
                satirSayaci += 4
                if satirSayaci == satirSayisiniOgren():
                    print("Aradığınız öğrenci bulunamadı.")
                    dosya.close()
                    return
                for i in range(3):
                    dosya.readline()
                sayi = int(dosya.readline())
                if sayi == no:
                    print("Öğrenci adı:", dosya.readline(), end='')
                    print("Öğrenci bölümü", dosya.readline())
                    kontrol = False
                    break

            if kontrol:
                print("Aradığınız öğrenci bulunamadı.")
            dosya.close()

        except Exception:
            print("Hata")
        finally:
            dosya.close()
    else:
        print("Veritabanı dosyası bulunamadı.")

def bolumAra(bolum):
    if os.path.isfile(dosyaAdi) and os.access(dosyaAdi, os.R_OK):
        try:
            dosya = open(dosyaAdi, "r")
            for i in range(4):
                no = dosya.readline()
                isim = dosya.readline()
                bolumke = dosya.readline()
                dosya.readline()
                if bolum == bolumke:
                    print(no + " - " + isim)
            dosya.close()
        except Exception:
            print("Hata")
        finally:
            dosya.close()
    else:
        print("Veritabanı dosyası bulunamadı.")

def main():
    while True:
        sayi = int(input("Yapmak istediğiniz işlemin numarasını giriniz.\n1 - Kayıt ekleme\n2 - Öğrenci arama\n3 - Bölüm arama\n0 - Çıkmak için"))
        if sayi == 1:
            ogrenciEkle2(Ogrenci(int(input("Öğrenci no giriniz")), input("Öğrenci adını giriniz"), input("Öğrenci bölümünü giriniz")))
        elif sayi == 2:
            ogrenciAra(int(input("Aramak istediğiniz öğrencinin numarasını giriniz.")))
        elif sayi == 3:
            bolumAra(input("Aramak istediğiniz öğrencilerin bölüm adını giriniz."))
        elif sayi == 0:
            break

main()