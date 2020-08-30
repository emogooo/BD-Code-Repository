package vyp_1;

import java.util.Scanner;

public class VYP_1 {

    Fonksiyon ilkdugum = null;

    void ekle(Fonksiyon f) {
        if (ilkdugum == null) {
            ilkdugum = f;
        } else {
            asilekle(f);

        }
    }

    void asilekle(Fonksiyon f) {

        Fonksiyon gecici = ilkdugum;

        while (gecici.sonraki != null) {
            gecici = gecici.sonraki;
        }

        gecici.sonraki = f;
    }

    void fonkYazdir() {

        Fonksiyon gecici = ilkdugum;

        System.out.print("\n.......... f(x,y) = ");

        do {

            if (gecici.katsayi != 0) {

                System.out.print(" " + gecici.kIsaret + " " + gecici.katsayi + ".x^" + gecici.xDerece + ".y^" + gecici.yDerece);

            }

        } while ((gecici = gecici.sonraki) != null);

        System.out.println(" ..........\n");

    }

    void f(int x, int y) {

        Fonksiyon gecici = ilkdugum;

        int sonuc = 0;

        do {

            if (gecici.kIsaret == '+') {
                sonuc += gecici.katsayi * (Math.pow(x, gecici.xDerece)) * (Math.pow(y, gecici.yDerece));
            } else {
                sonuc -= gecici.katsayi * (Math.pow(x, gecici.xDerece)) * (Math.pow(y, gecici.yDerece));
            }

        } while ((gecici = gecici.sonraki) != null);

        System.out.println("\n.......... f(" + x + "," + y + ") = " + sonuc + " ..........\n");
    }

    void fonksiyonSil() {

        Fonksiyon gecici = ilkdugum;

        do {

            if (gecici.xDerece == 0 || gecici.yDerece == 0) {

                gecici.katsayi = 0;

            }

        } while ((gecici = gecici.sonraki) != null);

    }

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        VYP_1 kova = new VYP_1();

        System.out.println("Hoşgeldiniz lütfen fonksiyonu girin.(Örnek = +1x1y2-5x2y3+2x0y1)\n");

        String fonk = oku.next();
        fonk+=".";
       

        for (int i = 0; i < fonk.length()-1;) {

            char op = ' ';
            int ks = 0;
            int xd = 0;
            int yd = 0;
            String s = "";
            char sa;
            int sayac = 0;
            int sayac2 = 0;
            

            op = fonk.charAt(i);
            i++;
            

            

            while (fonk.charAt(i+sayac) != 'x') {
                sayac++;
                
            }

            

            for (int j = i; j < sayac+i; j++) {
                sa = fonk.charAt(j);
                s += String.valueOf(sa);
                sayac2++;

            }
            i += sayac2;

            ks = Integer.parseInt(s);

            i++;

            sayac = 0;

            while (fonk.charAt(i+sayac) != 'y') {
                sayac++;

            }

            
            
            s = "";
            sayac2 = 0;
            for (int j = i; j < sayac + i; j++) {
                sa = fonk.charAt(j);
                s += String.valueOf(sa);
                sayac2++;
            }

            i += sayac2;
            xd = Integer.parseInt(s);
            i++;

            sayac = 0;

            while (fonk.charAt(i+sayac)!='.'&&fonk.charAt(i+sayac)!='+'&&fonk.charAt(i+sayac)!='-') {
                sayac++;

            }

            
            s = "";
            sayac2=0;
            for (int j = i; j < sayac + i; j++) {
                sa = fonk.charAt(j);
                s += String.valueOf(sa);
                sayac2++;

            }
            i += sayac2;
            yd = Integer.parseInt(s);
            

            Fonksiyon f = new Fonksiyon(op, ks, xd, yd);

            kova.ekle(f);

        }

        kova.fonkYazdir();

        for (;;) {
            System.out.println("Lütfen yapmak istediğiniz işlemin kodunu girin.\n"
                    + "Tek değişkenli fonksiyon parçalarını silmek için = 0\n"
                    + "Fonksiyonu çalıştırmak için = 1\n"
                    + "Çıkmak için = 99;");

            int sec = oku.nextInt();

            if (sec == 0) {

                kova.fonksiyonSil();
                kova.fonkYazdir();
            } else if (sec == 1) {

                System.out.println("Lütfen x değerini girin.");

                int xd = oku.nextInt();

                System.out.println("Lütfen y değerini girin.");

                int yd = oku.nextInt();

                kova.fonkYazdir();

                kova.f(xd, yd);

            } else if (sec == 99) {
                break;
            }
        }
    }

}
