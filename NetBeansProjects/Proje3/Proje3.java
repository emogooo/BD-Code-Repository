package sametodev;

import java.util.Scanner;

public class SametOdev {

    public static void main(String[] args) {
        int dizi[] = {1, 1, 0, 1, 0, 1, 1, 0, 1, 0};
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        while ((toplam = 0) != -1) {
            System.out.print("Taban giriniz = ");
            int taban = oku.nextInt();
            if (taban > 10 || taban < 0) {
                System.out.println("Bitti");
                return;
            }
            for (int i = 9; i >= 0; i--) {
                toplam += dizi[i] * Math.pow(taban, 9 - i);
            }
            System.out.println("Sonuç = " + toplam);
        }
    }
}
