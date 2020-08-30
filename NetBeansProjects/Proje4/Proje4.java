package sevimodev;

import java.util.Scanner;

public class SevimOdev {

    public static void main(String[] args) {
        int toplam = 0;
        int x = -1;
        Scanner oku = new Scanner(System.in);
        System.out.println("Kaç sayı istediğinizi girin.");
        int sayiAdedi = oku.nextInt();
        int i = 0;
        while (i < sayiAdedi) {
            System.out.println(x = x + 2);
            toplam += x;
            i++;
        }

        System.out.println("toplam = " + toplam);
    }

}
