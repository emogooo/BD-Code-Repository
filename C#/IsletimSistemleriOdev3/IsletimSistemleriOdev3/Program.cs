using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IsletimSistemleriOdev3
{
    class Program{
        static void beklemeSuresiBul(int[] surecNo, int[] calismaSuresi, int[] beklemeSuresi){

            beklemeSuresi[0] = 0;
            for (int i = 1; i < surecNo.Length; i++){
                beklemeSuresi[i] = calismaSuresi[i - 1] + beklemeSuresi[i - 1];
            }
        }
        static void ortalamaBeklemeSuresiBul(int[] surecNo, int[] calismaSuresi){

            int[] beklemeSuresi = new int[surecNo.Length];
            int toplamBeklemeSuresi = 0;
            beklemeSuresiBul(surecNo, calismaSuresi, beklemeSuresi);
            Console.Write("Surec C.Suresi B.Suresi\n");
            for (int i = 0; i < surecNo.Length; i++){
                toplamBeklemeSuresi = toplamBeklemeSuresi + beklemeSuresi[i];
                Console.Write(" {0} ", (i + 1));
                Console.Write("     {0} ", calismaSuresi[i]);
                Console.Write("     {0}", beklemeSuresi[i] + "\n");
            }
            float ortalamaBeklemeSuresi = (float)toplamBeklemeSuresi / (float)surecNo.Length;
            Console.Write("Ortalama bekleme süresi = {0}", ortalamaBeklemeSuresi);
        }
        public static void Main(String[] args){
            int[] surecNo = { 1, 2, 3, 4, 5 };
            int[] calismaSuresi = { 2, 5, 10, 7, 6 };
            ortalamaBeklemeSuresiBul(surecNo, calismaSuresi);
            Console.ReadKey();
        }
    }
}
