package bagliliste;

public class BagliListe {

    Musteri ilkdugum = null;
   

    void ekle(Musteri m) {
        if (ilkdugum == null) {
            ilkdugum = m;
        } else {
            m.sonraki = ilkdugum;
            ilkdugum = m;

        }
        
    }

    void ekleisimdensonra(String isim, Musteri m) {

        Musteri gecici = ilkdugum;

        while (gecici.isim != isim) {
            gecici = gecici.sonraki;
        }

        m.sonraki = gecici.sonraki;
        gecici.sonraki = m;

    }

    void sonaekle(Musteri m) {
        Musteri gecici = ilkdugum;
        while (gecici.sonraki != null) {
            gecici = gecici.sonraki;
        }

        gecici.sonraki = m;

    }

    void yazdir() {
        Musteri gecici = ilkdugum;

        for (; gecici != null;) {
            System.out.println(gecici.isim);
            gecici = gecici.sonraki;

        }

        /*
         while(gecici.sonraki!=null){
         System.out.println(gecici.isim);            
         gecici = gecici.sonraki;
         }
         */
    }

    public static void main(String[] args) {
        Musteri m1 = new Musteri(5, "dilaver", 18);
        Musteri m2 = new Musteri(6, "Mahmut", 19);
        Musteri m3 = new Musteri(15, "Ayse", 19);
        Musteri m4 = new Musteri(17, "Muzaffer", 20);

        Musteri m5 = new Musteri(18, "Recep ivedik", 20);
        Musteri m6 = new Musteri(20, "Şahan", 20);

//       m1.sonraki = m2;
//       m2.sonraki = m3;
//       m3.sonraki = m4;      
//       System.out.println(m1.sonraki.sonraki.sonraki.yas);
        BagliListe kova = new BagliListe();

        kova.ekle(m1);
        kova.sonaekle(m3);
        kova.sonaekle(m4);
        kova.sonaekle(m5);
        kova.sonaekle(m2);
        kova.ekleisimdensonra("Ayse", m6);

        kova.yazdir();

    }

}
