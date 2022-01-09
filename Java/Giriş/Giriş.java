package giriş;

import java.util.ArrayList;
import java.util.Scanner;

public class Giriş {

    static ArrayList<String> kAdi = new ArrayList();
    static ArrayList<String> sifre = new ArrayList();
    static Scanner oku = new Scanner(System.in);

    void ekle(String k, String s) {

        kAdi.add(k);
        sifre.add(s);
    }

    String kullanici(String k) {

        int kontrol = 0;
        for (int i = 0; i < kAdi.size(); i++) {
            if (kAdi.get(i).equalsIgnoreCase(k)) {
                System.out.println("Bu kullanıcı adı kullanılmaktadır lütfen başka kullanıcı adı girin.");
                kontrol = 1;
                break;
            }
        }
        if (kontrol == 1) {
            kullanici();
        }
        return k;
    }

    String kullanici() {

        String k = oku.next();
        k = kullanici(k);
        return k;
    }

    public static void main(String[] args) {

        Giriş u = new Giriş();
        u.ekle("emobabatr60", "123456");
        u.ekle("cakmalegolas", "asd123");
        u.ekle("emogooo", "222111");
        int kontrol = 0;

        for (;;) {

            System.out.println("Giriş yapmak için = 1\n"
                    + "Kayıt olmak için = 2 \n"
                    + "Çıkmak için = 99");

            int x = oku.nextInt();
            if (x == 1) {

                System.out.print("Kullanıcı adı = ");
                String k = oku.next();
                System.out.print("Şifre = ");
                String s = oku.next();

                for (int i = 0; i < kAdi.size(); i++) {

                    if (kAdi.get(i).equalsIgnoreCase(k) && sifre.get(i).equalsIgnoreCase(s)) {

                        System.out.println("Başarıyla giriş yaptınız");
                        kontrol = 1;
                        break;
                    }

                }

                if (kontrol == 0) {
                    System.out.println("Lütfen tekrar deneyin.");
                }
            } else if (x == 2) {
                System.out.println("Kullanıcı adınızı girin.");
                String k1 = u.kullanici();
                System.out.println("Şifrenizi girin.");
                String s1 = oku.next();
                u.ekle(k1, s1);
            } else if (x == 99) {
                break;
            }
        }

    }

}
