def sayiAl():
    while True:
        sayi = input("Sayı girin ")
        try:
            return float(sayi)
        except ValueError:
            pass
while True:
    sayi1 = sayiAl()
    islem = input("Yapılacak işlemi girin ")
    sayi2 = sayiAl()
    if islem == "+":
        sonuc = sayi1 + sayi2
    elif islem == "-":
        sonuc = sayi1 - sayi2
    elif islem == "*":
        sonuc = sayi1 * sayi2
    elif islem == "/":
        sonuc = sayi1 / sayi2
    else:
        print("Böyle bir işlem yoktur.")
        continue
    print(str(sayi1) + islem + str(sayi2) + " = " + str(sonuc))