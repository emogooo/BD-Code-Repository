package sınav;

import java.util.Random;

public class Sınav {

    public static void main(String[] args) {

        Random uret = new Random();

        int[] A = new int[100];
        int[] B = new int[100];
        double dogru = 0, yanlis = 0;

        for (int i = 0; i < 100; i++) {
            A[i] = uret.nextInt(5);
            B[i] = uret.nextInt(5);

            if (A[i] == B[i]) {
                dogru++;
            } else {
                yanlis++;
            }
        }

        System.out.println("Doğru sayınız..: "+dogru+"\nYanlış sayınız..: "+yanlis+"\nNet sayınız..: "+(dogru-(yanlis/4)));
    }

}
