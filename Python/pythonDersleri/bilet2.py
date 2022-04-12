class_list = []
guzergah = []

def appendandremove(q):
    guzergah.append(class_list[q][1])
    class_list.remove(class_list[q])

for i in range(int(input())):
    class_list.append(input().split())

q,a = 0,0
tekrarsayisi = 0
while True:
    if tekrarsayisi !=3:
        if class_list[q][0]==class_list[a][1]:
            tekrarsayisi = 1
            if tekrarsayisi == 1:
                q+=1
                a=0
                tekrarsayisi=0
        elif class_list[q][0]!=class_list[a][1] and a != len(class_list):
            a+=1
            if a == len(class_list) and tekrarsayisi==0:
                guzergah.append(class_list[q][0])
                appendandremove(q)
                tekrarsayisi=3
                q,a=0,0
    elif tekrarsayisi==3:

        if guzergah[-1]==class_list[q][0]:
            appendandremove(q)
            q=0
        elif guzergah[-1]!=class_list[q][0] and q<=len(class_list):
            q+=1
        if q==len(class_list):
            break

print(*guzergah)