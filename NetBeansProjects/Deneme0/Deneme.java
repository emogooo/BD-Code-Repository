package deneme;

import java.util.Random;

public class Deneme {

    public static void main(String[] args) {

        Random rastgele = new Random();
        int []dizi = new int[10];
        for (int i = 0; i < 10; i++) {
            dizi[i]=rastgele.nextInt(10);
        }
        int kova = 0;
        for (int i = 0; i < dizi.length - 1; i++) {

            int kontrol = 1;

            for (int j = 0; j < dizi.length - i - 1; j++) {

                if (dizi[j] >= dizi[j + 1]) {
                    kontrol = 0;
                    kova = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = kova;
                }
            }
            
            if(kontrol==1)
                break;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(dizi[i]);
        }
    }

}
