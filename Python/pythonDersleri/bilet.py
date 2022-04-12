biletSayisi = int(input())
class_list = dict()
guzergah = ""
i = 0
while True:
    a, b = list(map(str, input().split()))
    class_list[i] = [a]
    i = i + 1
    class_list[i] = [b]
    i = i + 1
    if i == biletSayisi * 2:
        break

k = 0
j = 1
while True:
    if class_list.get(k) == class_list.get(j):
        j = 1
        k += 2
        continue
    else:
        j += 2
        if len(class_list) + 1 == j:
            guzergah = str(class_list.get(k)) + " " + str(class_list.get(k+1))
            break

j = 0
while True:
    if class_list.get(k+1) == class_list.get(j):
        guzergah += " " + str(class_list.get(j+1))
        k = j
        j = 0
    else:
        j += 2
        if j > len(class_list):
            break

print(guzergah)