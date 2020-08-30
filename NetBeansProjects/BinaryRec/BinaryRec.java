package binaryrec;

import java.util.Scanner;

public class BinaryRec {

    static int binary[] = new int[40];
    static int index = 0;

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        while (true) {
            System.out.print("Lütfen 10'luk tabandaki sayıyı giriniz:");
            int sonuc = girdi.nextInt();
            if (sonuc != -1) {
                System.out.print("İkiliktabandaki karşılığı = ");
                binaryDonustur(sonuc);

                for (int i = index - 1; i >= 0; i--) {
                    System.out.print(binary[i]);
                }
                System.out.print("\n");
                binary = new int[40];
                index = 0;
            } else {
                break;
            }
        }
    }

    static public void binaryDonustur(int sayi) {

        if (sayi > 0) {
            binary[index++] = sayi % 2;
            binaryDonustur(sayi / 2);
        } else {
            return;
        }
    }

}
