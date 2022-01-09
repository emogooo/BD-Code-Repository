package vyp_2;

public class Ogrenci {

    int no, not;
    String ad, soyad;
    Ogrenci sonraki, onceki;
    static int noSayac = 0;

    public Ogrenci() {

    }

    public Ogrenci(String ad, String soyad, int not) {

        this.no = ++noSayac;
        this.ad = ad;
        this.soyad = soyad;
        this.not = not;
    }
}
