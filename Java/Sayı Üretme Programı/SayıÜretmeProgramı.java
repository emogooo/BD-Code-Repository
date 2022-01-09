package sayı.üretme.programı;

import java.util.Random;
import java.util.Scanner;

public class SayıÜretmeProgramı {

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("Kaç tane sayı üretmek istiyorsun?");
        int adet = al.nextInt();
        System.out.println("Sayılar 0 ile hangi sayı aralığında üretilsin?");
        int aralik = al.nextInt();
        int[] a = new int[adet + 1];
        double toplam = 0;
        int enbuyuk = 0, enkucuk = aralik;
        System.out.println("----------------------");
        for (int i = 1; i <= adet; i++) {
            a[i] = rastgele.nextInt(aralik);
        }
        for (int i = 1; i <= adet; i++) {
            System.out.print(a[i] + " ");
            if (i % 10 == 0) {
                System.out.println("");
            }
            toplam += a[i];
            if (enbuyuk < a[i]) {
                enbuyuk = a[i];
            }
            if (enkucuk > a[i]) {
                enkucuk = a[i];
            }
        }

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Sayıların toplamı = " + toplam
                + "\nSayıların ortalaması = " + toplam / adet
                + "\nEn büyük sayı = " + enbuyuk
                + "\nEn küçük sayı = " + enkucuk);
    }

}
