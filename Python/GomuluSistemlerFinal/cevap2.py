from datetime import datetime
def sayiAl(metin):
    while True:
        sayi = input(metin)
        try:
            return int(sayi)
        except ValueError:
            print("Lütfen tam sayı giriniz.")

def main():
    gun = sayiAl("Günü girin.")
    ay = sayiAl("Ayı girin.")
    yil = sayiAl("Yılı girin.")

    try:
        tarih = datetime(yil, ay, gun)
    except Exception:
        print("Lütfen geçerli bir tarih giriniz.")
        return

    if(tarih.weekday() == 0):
        print("Pazartesi")
    elif(tarih.weekday() == 1):
        print("Salı")
    elif(tarih.weekday() == 2):
        print("Çarşamba")
    elif(tarih.weekday() == 3):
        print("Perşembe")
    elif(tarih.weekday() == 4):
        print("Cuma")
    elif(tarih.weekday() == 5):
        print("Cumartesi")
    elif(tarih.weekday() == 6):
        print("Pazar")

main()