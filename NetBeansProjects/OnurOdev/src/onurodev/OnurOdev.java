package onurodev;

import java.util.Scanner;

public class OnurOdev {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int uzunluk = oku.nextInt();
        System.out.println("---------------");
        int i, j;
        i = 1;
        while (i <= uzunluk) {
            j = 1;
            while (j <= i) {
                System.out.print(j++ + " ");
            }
            System.out.println("");
            i++;
        }

        i = uzunluk - 1;
        while (i >= 1) {
            j = 1;
            while (j <= i) {
                System.out.print(j++ + " ");
            }
            System.out.println("");
            i--;
        }
    }
}
