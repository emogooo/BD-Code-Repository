using System;

namespace isilipeksarikaya
{
    class Program
    {
        static void Main(string[] args)
        {
            Bilgisayar pc1 = new Bilgisayar("Abus PUF Gaming", 16384, "Pintel g7-6740H", "MGidia 1660 Si", 3.5, 8);
            pc1.bilgileriYazdir();
            Bilgisayar pc2;
            Console.WriteLine("\nBilgisayarın ismini girin.");
            string isim = Console.ReadLine();
            Console.WriteLine("Bilgisayarın işlemcisini girin.");
            string islemci = Console.ReadLine();
            Console.WriteLine("İşlemcinin kaç GHz olduğunu girin. (Örneğin: 2,5)");
            double islemciGHz = Double.Parse(Console.ReadLine());
            Console.WriteLine("Bilgisayarın kaç MB ram'i olduğunu girin.");
            int ramMB = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Bilgisayarın harici ekran kartı var mı? (Varsa 1 - Yoksa 0)");
            string ekranKartiVarmi = Console.ReadLine();
            if (ekranKartiVarmi == "1")
            {
                Console.WriteLine("Ekran kartının ismini girin.");
                string ekranKarti = Console.ReadLine();
                Console.WriteLine("Ekran kartının kaç gb hafızası olduğunu girin.");
                int ekranKartiGB = Convert.ToInt32(Console.ReadLine());
                pc2 = new Bilgisayar(isim, ramMB, islemci, ekranKarti, islemciGHz, ekranKartiGB);
            }
            else
            {
                pc2 = new Bilgisayar(isim, ramMB, islemci, islemciGHz);
            }
            Console.WriteLine("\nYeni bilgisayar oluşturuldu.");
            pc2.bilgileriYazdir();
            Console.WriteLine("\nBilgisayarlar karşılaştırılıyor.\n");
            pc1.karsilastir(pc2);

        }
    }

    class Bilgisayar
    {
        string isim;
        int ramMB;
        string islemci;
        bool ekranKartiVarmi; // diğer bilgilerden hesaplanan bilgi
        string ekranKarti;
        double islemciGHz;
        int ekranKartiGB;
        string sinif; // diğer bilgilerden hesaplanan bilgi
        int sinifSeviyesi; // diğer bilgilerden hesaplanan bilgi
        int karsilastirmaDegeri1 = 0;
        int karsilastirmaDegeri2 = 0;

        public Bilgisayar(string isim, int ramMB, string islemci, string ekranKarti, double islemciGHz, int ekranKartiGB)
        {
            this.isim = isim;
            this.ramMB = ramMB;
            this.islemci = islemci;
            this.ekranKarti = ekranKarti;
            this.islemciGHz = islemciGHz;
            this.ekranKartiGB = ekranKartiGB;
            ekranKartiVarmi = true;
            sinifBelirle();
        }
        public Bilgisayar(string isim, int ramMB, string islemci, double islemciGHz)
        {
            this.isim = isim;
            this.ramMB = ramMB;
            this.islemci = islemci;
            this.islemciGHz = islemciGHz;
            ekranKartiVarmi = false;
            sinifBelirle();
        }

        private void sinifBelirle()
        {
            if (ekranKartiVarmi)
            {
                sinif = "Oyun Bilgisayarı";
                sinifSeviyesi = 3;
            }
            else if (ramMB >= 8192)
            {
                sinif = "İş Bilgisayarı";
                sinifSeviyesi = 2;
            }
            else
            {
                sinif = "Ev Bilgisayarı";
                sinifSeviyesi = 1;
            }
        }

        public void karsilastir(Bilgisayar b)
        {
            karsilastirmaDegeri1 = 0;
            karsilastirmaDegeri2 = 0;
            if (sinifSeviyesi > b.sinifSeviyesi)
            {
                karsilastirmaDegeri1++;
            }
            else if (b.sinifSeviyesi > sinifSeviyesi)
            {
                karsilastirmaDegeri2++;
            }
            else
            {
                if (islemciGHz > b.islemciGHz)
                {
                    karsilastirmaDegeri1++;
                }
                else if (b.islemciGHz > islemciGHz)
                {
                    karsilastirmaDegeri2++;
                }
                else
                {
                    if (ekranKartiVarmi)
                    {
                        if (ekranKartiGB > b.ekranKartiGB)
                        {
                            karsilastirmaDegeri1++;
                        }
                        else if (b.ekranKartiGB > ekranKartiGB)
                        {
                            karsilastirmaDegeri2++;
                        }
                    }
                    if (ramMB > b.ramMB)
                    {
                        karsilastirmaDegeri1++;
                    }
                    else if (b.ramMB > ramMB)
                    {
                        karsilastirmaDegeri2++;
                    }
                }
            }

            if (karsilastirmaDegeri1 > karsilastirmaDegeri2)
            {
                Console.WriteLine(isim + " bilgisayarı " + b.isim + " bilgisayarından daha iyidir.");
            }
            else if (karsilastirmaDegeri2 > karsilastirmaDegeri1)
            {
                Console.WriteLine(b.isim + " bilgisayarı " + isim + " bilgisayarından daha iyidir.");
            }
            else
            {
                Console.WriteLine(b.isim + " bilgisayarı " + isim + " bilgisayarı ile aynı performansa sahiptir.");
            }
            Console.WriteLine(" ");

        }

        public void bilgileriYazdir()
        {
            Console.WriteLine("Bilgisayar ismi = " + isim + "\n" +
                              "Bilgisayar işlemcisi = " + islemci + " " + islemciGHz + " GHz\n" +
                              "Bilgisayar ram'i = " + ramMB + " MB\n" +
                              "Bilgisayar sınıfı = " + sinif);
            if (ekranKartiVarmi)
            {
                Console.WriteLine("Bilgisayar ekran kartı = " + ekranKarti + " " + ekranKartiGB + " GB");
            }
        }


    }
}
