package yıldızlar.ile.ters.dik.üçgen;

import java.util.Scanner;

public class YıldızlarIleTersDikÜçgen {

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        System.out.println("Taban uzunluğu kaç birim olsun?");
        int a = al.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j = 0; j < a - i; j++) {

                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {

                System.out.print("* ");
            }

            System.out.println("");
        }

    }

}
