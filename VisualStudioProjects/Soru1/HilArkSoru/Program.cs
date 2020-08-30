using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HilArkSoru
{
    class Program
    {
        static void Main(string[] args)
        {
            string isim, dogumTarihi, telNo;
            FileStream fs = new FileStream("D:\\180101006.txt", FileMode.Append, FileAccess.Write, FileShare.Write);
            StreamWriter sw = new StreamWriter(fs);
            Console.WriteLine("Lütfen adınızı ve soyadınızı girin.");
            isim = Console.ReadLine();
            Console.WriteLine("Lütfen doğum tarihinizi girin.");
            dogumTarihi = Console.ReadLine();
            Console.WriteLine("Lütfen telefon numaranızı girin.");
            telNo = Console.ReadLine();
            yazmaFonksiyonu(sw, isim, dogumTarihi, telNo);
            Console.WriteLine("Kayıt başarıyla eklenmiştir.");
            okumaFonksiyonu();
            Console.ReadKey();

        }

        static void yazmaFonksiyonu(StreamWriter sw, string isim, string dogumTarihi, string telNo)
        {
            StreamWriter yaz = sw;
            sw.WriteLine("Ad Soyad: " + isim);
            sw.WriteLine("Doğum Tarihi: " + dogumTarihi);
            sw.WriteLine("Telefon Numarası: " + telNo);
            sw.Close();
        }

        static void okumaFonksiyonu()
        {
            string okunan;
            string dosyaYolu = @"D:\180101006.txt";
            FileStream fs = new FileStream(dosyaYolu, FileMode.Open, FileAccess.Read);
            StreamReader sr = new StreamReader(fs);
            do
            {
                okunan = sr.ReadLine();
                Console.WriteLine(okunan);
            } while (okunan != null);

            sr.Close();
            fs.Close();
            Console.WriteLine("Okuma işlemi başarıyla tamamlanmıştır.");
        }
    }
}
