import random

#alfabe girişi aldığım fonksiyon
def Alphabet():
    print("Afabeyi giriniz")
    Alfabe = input().replace(" ","").split(",")
    Alfabe=list(set(Alfabe)) #duplicate olanları ayırıyorum.
    return Alfabe

#filtreleme için liste kullandığım fonksiyon
def Filter(Alfabe):
    filterList=["+","*","[","]","(",")"]+Alfabe
    return filterList

#ifadeyi aldığım fonksiyon
def RegularExpressionInput():
    print("düzenli ifadeyi giriniz")
    regularExpression = input().replace(" ","")
    lregularExpression = list(regularExpression)
    lregularExpression.insert(0,"(")
    lregularExpression.append(")")
    return lregularExpression   

#ifade girildiğinde parantezlerde sorun olduğunda çalışacak olan fonksiyon
def ParenthesesController(lregularExpression):
    OpenP = ["[","{","("]
    CloseP = ["]","}",")"]
    ControllerList = []

    for i in lregularExpression:
        if i in OpenP:
            ControllerList.append(i)
        elif i in CloseP:
            ClosePos = CloseP.index(i)
            if ((len(ControllerList)>0) and 
                OpenP[ClosePos]==ControllerList[len(ControllerList)-1]):
                ControllerList.pop()
            else:
                print("parantezlerde hata var. Eşleşmiyorlar.")
                exit()
                
    if len(ControllerList)!=0:
        print("parantezlerde hata var. Eşleşmiyorlar.")
        exit()

#tanımlanan alfabe dışında harf girildiğinde çalışacak fonksiyon        
def WrongInputCheck(lregularExpression, filterList):
    for x in lregularExpression:
        if x not in filterList:
            print("ifadede hata var. Alfabeyi tanımlarken veya ifadeyi yazarken hata yaptınız.")
            exit()             

#istenen kelime sayısı
def ResultCount():
    inputCount=input("kaç adet kelime üretmek istersiniz? ")
    return inputCount

#toplam işareti var mı kontrolünü yapan fonksiyon
def CheckColectionMark(lregularExpression):
    collectionMark = "+"
    if collectionMark in lregularExpression:
        return True            
   
    return False    

#kleene Star var mı kontrolünü yapan fonksiyon
def FindKleeneStar(lregularExpression):
    KleeneStar = "*"   
    if KleeneStar in lregularExpression:
        return True
    
    return False

#parantezlerin yerini bulan fonksiyon
def findParentheses(s):
    dicparantez = {}
    pstack = []
    for i, c in enumerate(s):
        if c == '(':
            pstack.append(i)
        elif c == ')':
            dicparantez[pstack.pop()] = i
        elif c == "[":
            pstack.append(i)
        elif c == "]":  
            dicparantez[pstack.pop()] = i    
    l = []
    [l.extend([k,v]) for k,v in dicparantez.items()]
    return l

#toplam işareti varsa yapılacak işlemi yapan fonksiyon
def CollectionMarkProcess(l):
    while True:
        z = random.choice(l)
        if z == "+" or z == "*":
            pass
        else:
            break               
    return z

#belirli indisler arasını silme fonksiyonu
def deleteFromList(lregularExpression):
    l = list()
    z = list()
    parenthesesLocation=findParentheses(lregularExpression)
    if len(parenthesesLocation)==0:
        return lregularExpression

    a = parenthesesLocation[0]
    b = parenthesesLocation[1]
    l = lregularExpression[a+1:b]

    #l listesi dilimlenmiş hali yani ifade
    #durum 1
    if CheckColectionMark(l)==False and FindKleeneStar(l)==False:
        lregularExpression[a:b+1] = l
    
    #durum 2
    elif CheckColectionMark(l)==True and FindKleeneStar(l)==False:
        q = CollectionMarkProcess(l)
        lregularExpression[a:b+1]=q     

    #durum 3
    elif FindKleeneStar(l) == True and CheckColectionMark(l)==False:
        lregularExpression[a:b+1] = l

    #durum 4

    else:
        
        temp = []
        z = findKleeneStarLocation(l) 
        lpl = findParentheses(l)

        if len(lpl) <= 2:
            choosen = lastCha(l)
            choosen = list(choosen)
            lregularExpression[0:len(lregularExpression)]=choosen
        else:
            for x in range(len(z)):
                temp.append(l[z[x]-1])
                temp.append(l[z[x]])
                l[z[x]-1:z[x]+1]="-"                   
            choosen = CollectionMarkProcess(l)
            if choosen == "-":
                for xc in range(len(temp)-1):
                    choosen = temp[xc]+temp[xc+1]
                    lregularExpression[a:b+1] = choosen
            else:
                lregularExpression[a:b+1] = choosen
    
    
#ifade içerisindeki alfabenin içindeki harflerin countunu döndüren fonksiyon
def returnCountInExpression(lregularExpression,alfabe):
    count = 0
    for i in range(len(lregularExpression)):
        if lregularExpression[i] in alfabe:
            count+=1
    return count

#son durumdaki seçim işlemi
def lastCha(l):
    while True:
        
        qqqq = random.randint(0,len(l)-1)
        if l[qqqq] == "+" or l[qqqq] == "*":
            pass
        elif l[qqqq]!="+" or l[qqqq]!="*":
            if l[qqqq+1]!="*":
                return l[qqqq]
            elif l[qqqq+1] == "*" or l[qqqq+1] in alfabe:
                lastchawords = l[qqqq]+l[qqqq+1]
                return lastchawords
            elif l[qqqq-1] in alfabe:
                lastchawords = l[qqqq]+l[qqqq-1]
                return lastchawords
        else:
            l[qqqq]
            break               
    return qqqq


#ifadede toplam sembolü kalmayana kadar devam ettiren kod    
def OverAgain(lregularExpression):   
    while True:
        if CheckColectionMark(lregularExpression):
            deleteFromList(lregularExpression)           
        else:
            break

#üs alma işlemine benzer bir işlemi stringler için yaptığım fonksiyon
def Power(letter,countKleeneStar):
    wordskleeneStar= ""
    if wordskleeneStar == 0:
        return wordskleeneStar
    else:    
        for i in range(countKleeneStar):
            wordskleeneStar+=letter
    return wordskleeneStar

#kleenestar yerlerini bulan algoritma
def findKleeneStarLocation(lregularExpression):
    KleenestarLocation = list()
    for i in range(len(lregularExpression)):
        if lregularExpression[i]=="*":
            KleenestarLocation.append(i)
    return KleenestarLocation

#kleenestarın işlevini yerine getiren drive fonksiyonu
def KleeneStarProcess(lregularExpression,KleenestarLocation):
    KleenestarLocation = findKleeneStarLocation(lregularExpression)
    i=random.randint(0,10)
    for q in range(len(KleenestarLocation)):
        result2 = Power(lregularExpression[KleenestarLocation[q]-1],i)
        lregularExpression[KleenestarLocation[q]-1:KleenestarLocation[q]+1]=result2
    
    RepeatKleeneStarProcess(lregularExpression)    
    
#kleene star kalmayana kadar ifadeyi tekrar tekrar kuran fonksiyon    
def RepeatKleeneStarProcess(lregularExpression):
    while True:
        if FindKleeneStar(lregularExpression) == True:
            KleeneStarProcess(lregularExpression,kleeneStarLocation)
        else:
            break    

#listeyi son aşamada listeden stringe çeviren fonksiyon
def listtoString(lregularExpression):
    str1 = ""
    for q in lregularExpression:
        str1+=q        
    return str1

#result listte çıkan parantezleri silen fonksiyon
def deleteParentheses(resultList):
    for i in range(len(resultList)):
        if resultList[i] == "(" or i==")":
            resultList.remove(i)
    return resultList

#aynı elemanları attığım fonksiyon
def duplicateWords(resultList):
    resultList = list(set(resultList))
    resultList.sort()  
    return resultList


alfabe = Alphabet()
lregularExpression=RegularExpressionInput()
lregularExpression2 = lregularExpression.copy()
ParenthesesController(lregularExpression)
filterlist=Filter(alfabe)
WrongInputCheck(lregularExpression,filterlist)
parenthesesLocation = findParentheses(lregularExpression)

ResultCount =int (ResultCount())

resultList=list()
while True:
    
    if len(resultList) >= ResultCount:
        resultList=deleteParentheses(resultList)
        print("son hali = ",resultList)
        break
    else:
        lregularExpression=lregularExpression2.copy()
        if CheckColectionMark(lregularExpression) and FindKleeneStar(lregularExpression):
            deleteFromList(lregularExpression)
            OverAgain(lregularExpression)
            kleeneStarLocation = findKleeneStarLocation(lregularExpression)
            KleeneStarProcess(lregularExpression,kleeneStarLocation)
        elif FindKleeneStar(lregularExpression):
            kleeneStarLocation = findKleeneStarLocation(lregularExpression)
            KleeneStarProcess(lregularExpression,kleeneStarLocation)  
            
        elif CheckColectionMark(lregularExpression):    
            deleteFromList(lregularExpression)
            OverAgain(lregularExpression)

        
    resultList.append(listtoString(lregularExpression))  
    resultList = list(set(resultList))
    resultList.sort()
       
