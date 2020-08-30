package aysenurabla;

public class AysenurAbla {

    public static void main(String[] args) {

        int[] dizi = {10, 9, 100, 81, 50, 10, 36, 90, -4, 8, 93, 43, 3, 5, 6};
        int[] enKucuk3Sayi = enk3Sayi(dizi);
        for (int i = 0; i < 3; i++) {
            System.out.println("En küçük " + (i + 1) + ". sayı: " + enKucuk3Sayi[i]);
        }
    }

    public static int[] enk3Sayi(int[] dizi) {

        int[] enk3Dizi = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int enKucuk = Integer.MAX_VALUE;
        int tutucu = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j] < enKucuk) {
                    enKucuk = dizi[j];
                    tutucu = j;
                }
            }
            dizi[tutucu] = Integer.MAX_VALUE;
            enk3Dizi[i] = enKucuk;
            enKucuk = Integer.MAX_VALUE;
        }

        return enk3Dizi;
    }

}
