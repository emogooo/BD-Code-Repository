package dizi.sırala;

import java.util.Random;
import java.util.Scanner;

public class DiziSırala {

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);

        System.out.println("Programın işlevi:"
                + "\n 1.ADIM = 2 adet dizi oluşturulur."
                + "\n 2.ADIM = Oluşturulan dizilerin tüm elemanlarına 0 ile 100 arasında rastgele sayılar atanır ve diziler ekrana basılır."
                + "\n 3.ADIM = 2 dizinin de elemanları, kendileri arasında küçükten büyüğe sıralanır ve ekrana basılır."
                + "\n 4.ADIM = 2 dizi sıralanarak yeni bir dizide toplanır ve ekrana basılır."
                + "\n----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Lütfen programı başlatmak için herhangi bir tuşa ve entera basın");
        String gec = al.next();
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        Random rastgele = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        for (int i = 0; i < 10; i++) {
            a[i] = rastgele.nextInt(100);
            b[i] = rastgele.nextInt(100);
        }

        System.out.println("A Dizisinin ilk hali");

        for (int i = 0; i < 10; i++) {

            System.out.print(a[i] + " ");
        }

        System.out.println("\nB Dizisinin ilk hali");

        for (int i = 0; i < 10; i++) {

            System.out.print(b[i] + " ");
        }

        System.out.println("\n-------------------------------------");

        int kova = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {

                    kova = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = kova;
                }
            }
        }
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (b[j] > b[j + 1]) {

                    kova = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = kova;
                }
            }
        }

        System.out.println("A Dizisinin sıralanmış hali");

        for (int i = 0; i < 10; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println("\nB Dizisinin sıralanmış hali");

        for (int i = 0; i < 10; i++) {

            System.out.print(b[i] + " ");
        }
        System.out.println("\n-------------------------------------");

        int i, j, k; /* Sorunun asıl kısmı buranın aşağısı */

        for (j = 0, i = 0, k = 0; j < 10 || i < 10; k++) {

            if (a[j] <= b[i]) {

                c[k] = a[j];
                j++;

                if (j == 10) {
                    for (int l = i; l < 10; l++) {
                        k++;
                        c[k] = b[l];

                    }
                    break;
                }
            } else {

                c[k] = b[i];
                i++;

                if (i == 10) {
                    for (int l = j; l < 10; l++) {
                        k++;
                        c[k] = a[l];

                    }
                    break;
                }
            }

        }

        System.out.println("A ve B dizinin sıralanarak toplanmış hali");

        for (k = 0; k < 20; k++) {

            System.out.print(c[k] + " ");
        }
        System.out.println("");
    }

}
