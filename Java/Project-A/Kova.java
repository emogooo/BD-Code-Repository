package project.a;

public class Kova {

    Dugum bas;

    public void basaEkle(int sayi) {
        Dugum d = new Dugum(sayi);
        if (bas == null) {
            bas = d;
        } else {
            d.sonraki = bas;
            bas.onceki = d;
            bas = d;
        }
    }

    public void sonaEkle(int sayi) {
        Dugum d = new Dugum(sayi);
        Dugum gecici = bas;
        if (bas == null) {
            bas = d;
        } else {
            while (gecici.sonraki != null) {
                gecici = gecici.sonraki;
            }
            gecici.sonraki = d;
            d.onceki = gecici;
        }
    }

    public void yazdir() {
        Dugum gecici = bas;
        while (gecici != null) {
            System.out.println(gecici.sayi);
            gecici = gecici.sonraki;
        }
    }

    public void arayaEkle(int sayi, int sonrasi) {
        Dugum d = new Dugum(sayi);
        Dugum gecici = bas;
        while (gecici.sayi != sonrasi) {
            gecici = gecici.sonraki;
        }

        if (gecici.sonraki == null) {
            sonaEkle(sayi);
            return;
        }

        d.sonraki = gecici.sonraki;
        d.sonraki.onceki = d;
        gecici.sonraki = d;
        d.onceki = gecici;
    }

    public void basSil() {
        if (bas.sonraki != null) {
            bas.sonraki.onceki = null;
            bas = bas.sonraki;
            return;
        }
        bas = null;
    }

    public void sonSil() {
        Dugum gecici = bas;
        while (gecici.sonraki != null) {
            gecici = gecici.sonraki;
        }
        if (gecici.onceki != null) {
            gecici.onceki.sonraki = null;
        }
    }

    public void araDugumSil(int sayi) {
        Dugum gecici = bas;
        while (gecici.sayi != sayi) {
            gecici = gecici.sonraki;
        }
        gecici.onceki.sonraki = gecici.sonraki;
        gecici.sonraki.onceki = gecici.onceki;
    }

    public void tamOrtayaEkleAmaTamOrtayaOlsunLutfen(int sayi) {
        Dugum d = new Dugum(sayi);
        Dugum gecici = bas;
        int sayac = 0;
        while (gecici != null) {
            sayac++;
            gecici = gecici.sonraki;
        }
        sayac = (sayac / 2) - 1;
        gecici = bas;
        for (int i = 0; i < sayac; i++) {
            gecici = gecici.sonraki;
        }
        d.sonraki = gecici.sonraki;
        gecici.sonraki = d;
        d.sonraki.onceki = d;
        d.onceki = gecici;

    }
}
