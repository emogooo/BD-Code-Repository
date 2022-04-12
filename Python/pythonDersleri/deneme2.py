def rakamTopla(a):
    toplam=0
    for rakam in str(a):
        if int(rakam) != 0:
            toplam += int(rakam)
    return toplam

a,b = map(int,input().split())
x = a
y = b % 6
if y == 0:
    print(1)
else:
    while x > 9:
        x = rakamTopla(x)

    for i in range(y - 1):
        x *= a
        while x > 9:
            x = rakamTopla(x)
    print(x)