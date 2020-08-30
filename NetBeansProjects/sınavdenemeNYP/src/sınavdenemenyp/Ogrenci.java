package sınavdenemenyp;

import java.util.ArrayList;

public class Ogrenci {

    int no;
    private String isim;
    protected String egitimTuru;
    private int kitapSayisi;
    ArrayList<Kitap> kitaplar;

    public Ogrenci(int no) {
        this(no, "lisans");
        log("bir parametreli yapici");
    }

    public Ogrenci(int No, String egitimTuru) {
        no = No;
        this.egitimTuru = egitimTuru;
        kitaplar = new ArrayList<Kitap>();
        if (egitimTuru.equals("lisans")) {
            kitapSayisi = 3;
        } else {
            kitapSayisi = 5;
        }
        log(toString());
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setNo(int no) {
        this.no = no;
    }

    void kitapOduncAl(Kitap kitap) {
        if (kitaplar.size() < kitapSayisi) {
            kitaplar.add(kitap);
        } else {
            log("Ödünç kitap Sayısını aştınız.");
        }
    }
   
    @Override
    public String toString() {
        return no + " " + egitimTuru + " " + kitaplar.size();
    }

    void log(String mesaj) {
        System.out.println(mesaj);
    }
}
