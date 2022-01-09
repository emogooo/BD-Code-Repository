dosya = open("deneme.txt", mode = 'r')
metin = dosya.readline()
while not 'G' in metin or not 'Z' in metin or not '.' in metin:
    metin = dosya.readline()
z = float(metin[5:])
print(z)
while not 'G' in metin or not 'X' in metin:
    metin = dosya.readline()

uzunluk = int(metin.__len__() - 1)
ib=0
ise=0
for i in range(uzunluk):
    if metin[i] == 'X':
        ib = i + 1
        for j in range(i,uzunluk):
            if metin[j] == 'Y':
                ise = j
                break


    elif metin[i] == 'Y':
        print(metin)

x = float(metin[ib:ise])
y = float(metin[ise+1:])

for i in range(10):
    print(dosya.readline())

print(x,y)
dosya.close()