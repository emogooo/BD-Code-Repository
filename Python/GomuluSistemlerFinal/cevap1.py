def sayiAl():
    while True:
        sayi = input("Çokgenin kenar sayısını girin: ")
        try:
            return int(sayi)
        except ValueError:
            print("Lütfen tam sayı giriniz.")


kenarSayisi = sayiAl()
if (kenarSayisi < 3):
    print("Geçersiz sayı.")
else:
    icAciToplami = (kenarSayisi - 2) * 180
    birAci = icAciToplami / kenarSayisi
    print("Kenar sayısı " + str(kenarSayisi) + " olan çokgenin iç açıları toplamı: " + str(
        icAciToplami) + " derecedir.\nBir açısı ise: " + str(birAci) + " derecedir.")