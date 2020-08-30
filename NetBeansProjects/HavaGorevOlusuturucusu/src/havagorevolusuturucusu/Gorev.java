package havagorevolusuturucusu;

public class Gorev {

    int no;
    String isim;
    boolean sinif; // Kara Görevleri için false, Hava Görevleri için true.
    String aciklama;
    private static int sayac = 0;

    public Gorev(String isim, boolean sinif, String aciklama) {

        this.no = ++sayac;
        this.isim = isim;
        this.sinif = sinif;
        this.aciklama = aciklama;
    }

}
