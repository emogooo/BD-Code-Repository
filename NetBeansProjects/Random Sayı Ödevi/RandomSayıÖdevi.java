package random.sayı.ödevi;

import java.util.Scanner;

import java.util.Random;

public class RandomSayıÖdevi {

    public static void main(String[] args) {

        Scanner tut = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("Kaç adet sayı üretilsin?");
        int adet = tut.nextInt();
        System.out.println("Sayılar 0 dan başlayarak kaça kadar üretilsin?");
        int aralik = tut.nextInt();
        System.out.println("----------------------------------------------");
        int sayac = 1;
        int j = 0;
        int enbuyuk = 0, enkucuk = adet;
        int[] a = new int[adet + 1];
        int[] b = new int[adet + 1];

        for (int i = 1; i <= adet; i++) {
            a[i] = rastgele.nextInt(aralik);
        }

        for (int i = 1; i <= adet; i++) {
            for (j = 0; j <= aralik; j++) {
                if (a[i] == j) {
                    b[j]++;
                    break;
                }
            }

        }
        for (int i = 1; i <= adet; i++) {
            System.out.println(sayac + ".sayı.. = " + a[i] + "...........tekrar sayısı.... = " + b[a[i]]);
            sayac++;
        }
        System.out.println("----------------------------------------------");
        for (j = 0; j < aralik; j++) {

            if (enbuyuk < b[j]) {
                enbuyuk = b[j];
            }
            if (enkucuk > b[j]) {
                enkucuk = b[j];
            }
        }
        System.out.println("En fazla tekrar sayısı ....= " + enbuyuk);
        System.out.println("En az tekrar sayısı ....= " + enkucuk);
    }

}
