biletSayisi = int(input())
a0 = []
a1 = []
guzergah = []
for i in range(biletSayisi):
    a,b = map(str,input().split())
    a0.append(a)
    a1.append(b)

# İlk noktayı bulmak.
kontrol = False
x = 0
for i in range(biletSayisi):
    for j in range(biletSayisi):
        if a0[i] == a1[j]:
            kontrol = False
            break
        else:
            kontrol = True
    if kontrol:
        guzergah.append(a0[i])
        guzergah.append(a1[i])
        x = i
        break

for i in range (biletSayisi - 1):
    for k in range(biletSayisi):
        if a1[x] == a0[k]:
            guzergah.append(a1[k])
            x = k
            break


print(*guzergah, sep = " ")