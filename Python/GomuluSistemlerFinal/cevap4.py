metin = input("Metin girin.")
metin = metin + " " # Son kelimeyi alması için bir en sona boşluk bırakıyorum.
kelimeBaslangici = 0
dizi = []
for i in range(len(metin)):
    if(metin[i] == " "):
        dizi.append(metin[kelimeBaslangici:i])
        kelimeBaslangici = i + 1

for i in dizi:
    if (i != '' and i!= '.' and i!=','):
        print(i)