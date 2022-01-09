package çağrınınödevi;

public class Çağrınınödevi {

    public static void main(String[] args) {

        double sayi = 1;
        double a = 1; // her döngüde küçülen değer 0.001 dan büyük olana kadar döngü çalışır
        double x =Math.PI; // cos(50) nin 50'si
        double faktoriyel; // faktöriyeli her seferinde hesaplayıp bu değişkenin içinde tutacağım

        for (int i = 2, k = 1; a > 0.000000000000000001; i += 2, k++) {

            faktoriyel = 1;

            for (int j = i; j > 0; j--) {       // faktöriyeli hesapladığımız yer
                faktoriyel *= i;
            }

            if (k % 2 == 0) {
                a = Math.pow(x, i) / faktoriyel;     // bi artı 
                sayi += a;
            } else {
                a = Math.pow(x, i) / faktoriyel;      // bi eksi
                sayi -= a;
            }

        }
        
        System.out.println(sayi);
        System.out.println(Math.cos(1.57));

    }

}
