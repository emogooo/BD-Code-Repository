print("Alfabenizi virgün ile ayırarak giriniz.")
alfabe = input()
harfListesi = list()
for i in range(int(len(alfabe) / 2) + 1):
    harfListesi.append(alfabe[i*2])
print("Düzenli ifadenizi giriniz.")
ifade = input()
print("L dilinin kaç kelimesini görmek istiyorsunuz?")
yazilacakKelimeSayisi = int(input())

