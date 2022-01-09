import cv2
def goruntuIsle(dosyaYolu):
    resim = cv2.imread(dosyaYolu)
    y, x, _ = resim.shape
    solX = x
    sagX = 0
    altY = 0
    ustY = y
    esikDegeri = 100
    siyahBeyazResim = cv2.threshold(resim, esikDegeri, 255, cv2.THRESH_BINARY)[1]
    blurlanmisResim = cv2.blur(siyahBeyazResim,(40,40))
    islenmisSiyahBeyazResim = cv2.threshold(blurlanmisResim, esikDegeri, 255, cv2.THRESH_BINARY)[1]
    hsv = cv2.cvtColor(islenmisSiyahBeyazResim, cv2.COLOR_BGR2HSV)

    for i in range(0, y):
        for j in range(0, x):
            v = hsv[i, j, 2]
            if int(v) != 0 and solX >= j:
                solX = j
                break

    for i in range(0, y):
        for j in range(x-1, solX, -1):
            v = hsv[i, j, 2]
            if int(v) != 0 and sagX <= j:
                sagX = j
                break

    for i in range(solX, sagX):
        for j in range(0, y):
            v = hsv[j, i, 2]
            if int(v) != 0 and ustY >= j:
                ustY = j
                break

    for i in range(solX, sagX):
        for j in range(y-1, ustY, -1):
            v = hsv[j, i, 2]
            if int(v) != 0 and altY <= j:
                altY = j
                break
    kesilmisResim = resim[ustY: altY, solX: sagX]
    cv2.imshow(dosyaYolu + " goruntusunun orijinal hali", resim)
    cv2.imshow(dosyaYolu + " goruntusunun islenmis hali", kesilmisResim)

goruntuIsle("orijinal.jpeg")
"""goruntuIsle("asagiYapisik.jpeg")
goruntuIsle("ortalanmis.jpeg")
goruntuIsle("sagaYapisik.jpeg")
goruntuIsle("solaYapisik.jpeg")"""
cv2.waitKey(0)