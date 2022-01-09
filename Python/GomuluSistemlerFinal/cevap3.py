def metod1(metin):
    metin = metin.replace('İ', 'I')
    metin = metin.replace('Ö', 'O')
    metin = metin.replace('Ü', 'U')
    metin = metin.replace('Ç', 'C')
    metin = metin.replace('Ğ', 'G')
    metin = metin.replace('Ş', 'S')
    metin = metin.replace('ı', 'i')
    metin = metin.replace('ö', 'o')
    metin = metin.replace('ü', 'u')
    metin = metin.replace('ç', 'c')
    metin = metin.replace('ğ', 'g')
    metin = metin.replace('ş', 's')
    return metin

def metod2(metin):
    metin = list(metin)
    for i in range(len(metin)):
        if(metin[i] == 'İ'):
            metin[i] = 'I'
        elif(metin[i] == 'Ö'):
            metin[i] = 'O'
        elif (metin[i] == 'Ü'):
            metin[i] = 'U'
        elif (metin[i] == 'Ç'):
            metin[i] = 'C'
        elif (metin[i] == 'Ğ'):
            metin[i] = 'G'
        elif (metin[i] == 'Ş'):
            metin[i] = 'S'
        elif (metin[i] == 'ı'):
            metin[i] = 'i'
        elif (metin[i] == 'ö'):
            metin[i] = 'o'
        elif (metin[i] == 'ü'):
            metin[i] = 'u'
        elif (metin[i] == 'ç'):
            metin[i] = 'c'
        elif (metin[i] == 'ğ'):
            metin[i] = 'g'
        elif (metin[i] == 'ş'):
            metin[i] = 's'
    return "".join(metin)

metin = input("Metin girin.")
print("1. metod ile işlenen metin: " + metod1(metin))
print("2. metod ile işlenen metin: " + metod2(metin))
