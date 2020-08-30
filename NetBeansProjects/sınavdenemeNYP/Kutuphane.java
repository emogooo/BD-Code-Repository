
package sınavdenemenyp;

import java.util.ArrayList;

public class Kutuphane {

    String isim;
    ArrayList<Ogrenci> ogrenciler;
    ArrayList<Kitap> kitaplar;

    public Kutuphane() {
        this("isimsiz");
    }

    public Kutuphane(String isim) {
        this.isim = isim;
        ogrenciler = new ArrayList<Ogrenci>();
        kitaplar = new ArrayList<Kitap>();
    }

    void kitapAlanOgrenciler(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
    }
}
