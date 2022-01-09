import cv2
def goruntuIsle(dosyaYolu):
    resim = cv2.imread(dosyaYolu)
    y, x, _ = resim.shape
    solX = x
    sagX = 0
    altY = 0
    ustY = y
    sb = cv2.threshold(resim, 30, 255, cv2.THRESH_BINARY)[1]
    blur = cv2.blur(sb,(40,40))
    sb = cv2.threshold(blur, 130, 255, cv2.THRESH_BINARY)[1]
    blur = cv2.blur(sb, (80, 80))
    sb = cv2.threshold(blur, 240, 255, cv2.THRESH_BINARY)[1]
    blur = cv2.blur(sb, (80, 80))
    sb = cv2.threshold(blur, 240, 255, cv2.THRESH_BINARY)[1]
    blur = cv2.blur(sb, (80, 80))
    sb = cv2.threshold(blur, 150, 255, cv2.THRESH_BINARY)[1]
    hsv = cv2.cvtColor(sb, cv2.COLOR_BGR2HSV)

    for i in range(0, y):
        for j in range(0, x):
            v = hsv[i, j, 2]
            if int(v) != 0 and solX >= j:
                solX = j
                break

    for i in range(0, y):
        for j in range(x - 1, solX, -1):
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
        for j in range(y - 1, ustY, -1):
            v = hsv[j, i, 2]
            if int(v) != 0 and altY <= j:
                altY = j
                break
    deger = int((sagX - solX) * 1.2)
    if deger < (altY - ustY):
        altY = ustY + deger
    kesilmisResim = resim[ustY: altY, solX: sagX]
    cv2.imshow(dosyaYolu + " goruntusunun islenmis hali", kesilmisResim)

goruntuIsle("cocukKarin.jpeg")
goruntuIsle("orijinal.jpeg")
cv2.waitKey(0)