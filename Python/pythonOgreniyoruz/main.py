import time
class Bilgisayar:
    def __init__(self, bilgisayarSahibi, ekranKartiGucu, islemciGucu, ram):
        self.bilgisayarSahibi = bilgisayarSahibi
        self.ekranKartiGucu = ekranKartiGucu
        self.islemciGucu = islemciGucu
        self.ram = ram
        self.dbdSaati = 0

    def bilgisayarGucuHesapla(self):
        bilgisayarGucu = (self.ekranKartiGucu * self.islemciGucu / self.ram) * 95 / 100
        return bilgisayarGucu

    def huntOyna(self):
        if (self.bilgisayarGucuHesapla() < 10):
            print(self.bilgisayarSahibi + " paso sineklere ölüyor.")
        elif(self.bilgisayarGucuHesapla() < 50):
            print(self.bilgisayarSahibi + " 0.75 kdaya sahip.")
        else:
            print(self.bilgisayarSahibi + ": Heyyy i'm perfect player man (KDA: 1.35)")

    def dbdOyna(self):
        if (self.bilgisayarGucuHesapla() < 10 and self.dbdSaati < 200):
            print(self.bilgisayarSahibi + " koşuyor koşuyor ama kaçamıyor campi yiyordu.")
        elif(self.bilgisayarGucuHesapla() < 10 and self.dbdSaati > 200):
            print(self.bilgisayarSahibi + " usain bolt gibi koşuyordu ve kaçıyordu.(kapaktan)")
        elif(self.bilgisayarGucuHesapla() > 50 and self.dbdSaati > 200):
            print(self.bilgisayarSahibi + " selam ben yavuzun proüzümüyüm.")
        self.dbdSaati += 50


def main():
    eceninBilgisayari = Bilgisayar("Ece", 0.1, 1.2, 8)
    emirhaninBilgisayari = Bilgisayar("Emirhan", 95, 98, 16)
    merveninBilgisayari = Bilgisayar("Merve", 0, 0, 1.5)
    gunSayaci = 0
    while True:  # HAYAT AKIYOR DEVAM EDİYOR. DEVAMKE
        for i in range(0,24,1):
            if i == 10:
                eceninBilgisayari.dbdOyna()
            if i == 22:
                emirhaninBilgisayari.huntOyna()
                eceninBilgisayari.huntOyna()
        gunSayaci += 1
        print("Gün bitti. Gün = " + gunSayaci)
        time.sleep(5)

main()



