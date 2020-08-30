package vyp_2;

import java.util.Scanner;

public class VYP_2 {

    Ogrenci ilkdugum = null;

    void ekle(Ogrenci o) {
        if (ilkdugum == null) {
            ilkdugum = o;
        } else {
            asilEkle(o);
        }
    }

    void asilEkle(Ogrenci o) {

        Ogrenci gecici = ilkdugum;

        while (gecici.sonraki != null) {
            gecici = gecici.sonraki;
        }

        gecici.sonraki = o;
        o.onceki = gecici;

    }

    void sil(int no) {

        Ogrenci gecici = ilkdugum;
        int kontrol = 0;

        while (gecici.sonraki != null) {
            if (gecici.no == no) {
                kontrol = 1;
                if (gecici == ilkdugum) {
                    ilkdugum = gecici.sonraki;
                    ilkdugum.onceki = null;
                    kontrol = 1;
                } else {
                    gecici.onceki.sonraki = gecici.sonraki;
                    gecici.sonraki.onceki = gecici.onceki;
                }
            }
            gecici = gecici.sonraki;
        }

        if (gecici.no == no) {

            gecici.onceki.sonraki = null;
        }

    }

    void yazdir() {

        Ogrenci gecici = ilkdugum;
        while (gecici.sonraki != null) {
            System.out.println(gecici.no + " " + gecici.ad + " " + gecici.soyad + " " + gecici.not + "\n");
            gecici = gecici.sonraki;
        }

        System.out.println(gecici.no + " " + gecici.ad + " " + gecici.soyad + " " + gecici.not + "\n");

    }

    void yazdir(int no) {

        Ogrenci gecici = ilkdugum;
        while (gecici.sonraki != null) {
            if (gecici.no == no) {

                System.out.println(gecici.no + " " + gecici.ad + " " + gecici.soyad + " " + gecici.not + "\n");
            }
            gecici = gecici.sonraki;
        }

        if (gecici.no == no) {

            System.out.println(gecici.no + " " + gecici.ad + " " + gecici.soyad + " " + gecici.not + "\n");
        }

    }

    public static void main(String[] args) {

        VYP_2 okul = new VYP_2();

        Ogrenci o1 = new Ogrenci("Emirhan", "Aydın", 50);
        Ogrenci o2 = new Ogrenci("Ahmet", "Sarı", 60);
        Ogrenci o3 = new Ogrenci("Mehmet", "Mavi", 75);
        Ogrenci o4 = new Ogrenci("Ayşe", "Yeşil", 85);
        Ogrenci o5 = new Ogrenci("Hello", "World", 100);

        okul.ekle(o1);
        okul.ekle(o2);
        okul.ekle(o3);
        okul.ekle(o4);
        okul.ekle(o5);

        Scanner oku = new Scanner(System.in);

        for (;;) {

            System.out.println("Hoşgeldiniz, lütfen yapmak istediğiniz işlemin numarasını girin.\n"
                    + "Öğrenci eklemek için = 1\n"
                    + "Öğrenci silmek için = 2\n"
                    + "Numarası verilen öğrenci bilgilerini yazdırmak için = 3\n"
                    + "Tüm öğrencileri yazdırmak için = 4\n"
                    + "Çıkmak için = 99");

            int x = oku.nextInt();

            if (x == 1) {

                System.out.println("Lütfen öğrencini adını girin.");

                String oad = oku.next();

                System.out.println("Lütfen öğrencini soyadını girin.");

                String osoyad = oku.next();

                System.out.println("Lütfen öğrencinin uygulama notunu girin.");

                int unot = oku.nextInt();

                Ogrenci ogrenci = new Ogrenci(oad, osoyad, unot);

                okul.ekle(ogrenci);
            } else if (x == 2) {
                System.out.println("Lütfen silmek istediğiniz öğrencinin numarasını girin");
                int sil = oku.nextInt();
                okul.sil(sil);
            } else if (x == 3) {
                System.out.println("Lütfen bilgilerini yazdırmak istediğiniz öğrenci numarasını girin");
                int yaz = oku.nextInt();
                okul.yazdir(yaz);

            } else if (x == 4) {
                okul.yazdir();
            } else if (x == 99) {
                break;
            }

        }

    }

}
