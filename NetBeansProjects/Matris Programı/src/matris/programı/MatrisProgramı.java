package matris.programı;

import java.util.Random;
import java.util.Scanner;

public class MatrisProgramı {

    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        Random rastgele = new Random();
        System.out.println("Lütfen matrisin satır sayısını yazınız.");
        int ay = al.nextInt();
        System.out.println("Lütfen matrisin sütun sayısını yazınız.");
        int ax = al.nextInt();
        System.out.println("Üretilen sayıları 0 ile kaç arasında olsun?");
        int aralik = al.nextInt();
        int[][] a = new int[ay + 1][ax + 1];
        int[][] b = new int[ax + 1][ay + 1];
        int[][] c = new int[ay + 1][ay + 1];
        System.out.println("-----Matrisimizin ilk hali-----");

        for (int i = 0; i < ay; i++) {
            for (int j = 0; j < ax; j++) {
                a[i][j] = rastgele.nextInt(aralik);
            }

        }

        for (int i = 0; i < ay; i++) {
            for (int j = 0; j < ax; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("-----------Transpozu-----------");

        for (int i = 0; i < ay; i++) {
            for (int j = 0; j < ax; j++) {
                b[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < ax; i++) {
            for (int j = 0; j < ay; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
        // Transpoz kısmı burada bitiyor ********************************** //
        for (int i = 0; i < ay; i++) {
            for (int j = 0; j < ay; j++) {
                for (int k = 0; k < ax; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("-----Transpozu ile çarpımı-----");
        for (int i = 0; i < ay; i++) {
            for (int j = 0; j < ay; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
