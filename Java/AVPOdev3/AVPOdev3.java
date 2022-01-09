package avpodev3;

import java.util.Scanner;

public class AVPOdev3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] girdi = new double[4]; /* 0. indis TP
         1. indis TN
         2. indis FP
         3. indis FN'i temsil etmektedir. */

        System.out.println("Sırasıyla TP,TN,FP ve FN değerlerin giriniz.");
        girdi[0] = sc.nextDouble();
        girdi[1] = sc.nextDouble();
        girdi[2] = sc.nextDouble();
        girdi[3] = sc.nextDouble();

        double[] sonuc = performansHesapla(girdi);

        System.out.println("Doğruluk = " + sonuc[0]);
        System.out.println("Kesinlik = " + sonuc[1]);
        System.out.println("Hassasiyet = " + sonuc[2]);
        System.out.println("F-Skor = " + sonuc[3]);
    }

    static double[] performansHesapla(double[] girdi) {
        double[] sonuc = new double[4]; /* 0. indis Doğruluk
         1. indis Kesinlik,
         2. indis Hassasiyet
         3. indis F-Skor'u temsil etmektedir. */

        sonuc[0] = (girdi[0] + girdi[1]) / (girdi[0] + girdi[1] + girdi[2] + girdi[3]);
        sonuc[1] = girdi[0] / (girdi[0] + girdi[2]);
        sonuc[2] = girdi[0] / (girdi[0] + girdi[3]);
        sonuc[3] = (2 * sonuc[1] * sonuc[2]) / (sonuc[1] + sonuc[2]);

        return sonuc;
    }

}
