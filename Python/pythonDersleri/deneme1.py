import math
def rakamTopla(a):
    toplam=0
    for rakam in str(a):
        if int(rakam) != 0:
            toplam += int(rakam)
    return toplam

a,b = map(int,input().split())

while a > 9:
    a = rakamTopla(a)

if a == 9:
    print(9)
else:
    b = b % 6
    if (a == 3 and b > 1) or (a == 6 and b > 1):
        print(9)
    else:
        cevap = int(math.pow(a,b))
        while cevap>9:
            cevap = rakamTopla(cevap)
        print(cevap)