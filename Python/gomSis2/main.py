yanlisGiris = 0
while True:
    kullanici_adi = input("Kullanıcı adınız: ")
    if yanlisGiris == 3:
        print("Parolanız bloke edilmiştir")
        continue
    parola = input("Parolanız: ")
    if kullanici_adi == "aliveli" and parola == "12345678":
        break
    else:
        print("Yanlış kullanıcı adı veya parola!")
        yanlisGiris += 1
print("Programa hoşgeldiniz")