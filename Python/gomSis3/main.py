pi = 3.14159
while True:
    cap = input("Daire'nin çapını girin ")
    try:
        cap = float(cap)
        break
    except ValueError:
        print("Girdiğiniz değer sayısal değildir")
yaricap = cap / 2
alan = pi * (yaricap * yaricap)
cevre = 2 * pi * yaricap
if alan > cevre:
    print("Çapı", cap, "cm olan dairenin alanı: ", alan, "cm2'dir")
elif alan < cevre:
    print("Çapı", cap, "cm olan dairenin çevresi: ", cevre, "cm'dir")
else:
    print("Çapı", cap, "cm olan dairenin alanı ve çevresi: ", cevre, "cm2/cm'dir")