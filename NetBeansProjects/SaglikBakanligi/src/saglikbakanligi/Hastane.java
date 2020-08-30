package saglikbakanligi;

import java.util.ArrayList;

public class Hastane {

    String isim;
    int kapasite;

    ArrayList<Calisan> calisanlar = new ArrayList();
    ArrayList<Doktor> doktorlarDizisi = new ArrayList();
    ArrayList<Hemsire> hemsireler = new ArrayList();
    ArrayList<Ebe> ebeler = new ArrayList();

    int toplamAmeliyatSayisi = 0;

    public Hastane(String isim, int a) {
        this.isim = isim;
        kapasite = a;
    }

    public void doktorEkle(String isim, int maas, String uzmanlikAlani) {
        Doktor d = new Doktor(isim, maas, uzmanlikAlani);
        calisanlar.add(d);
        doktorlarDizisi.add(d);
    }

    public void ebeEkle(String isim, int maas) {
        Ebe e = new Ebe(isim, maas);
        calisanlar.add(e);
        ebeler.add(e);
//        hemsireler.add(e);
    }

    public void hemsireEkle(String isim, int maas) {
        Hemsire h = new Hemsire(isim, maas);
        calisanlar.add(h);
        hemsireler.add(h);
    }

    public void ameliyatYap(Doktor d, double hastaYasi, boolean sigaraKullanimi, double gecirdigiBuyukHastalikSayisi) {
        try {
            d.ameliyatYap(hastaYasi, sigaraKullanimi, gecirdigiBuyukHastalikSayisi);
        } catch (HastaKaybi hk) {
            System.out.println(d.isim + " suçludur. " + isim + " olarak bu yüz karasına dava açacağız. " + hk.getLocalizedMessage());
        } finally {
            toplamAmeliyatSayisi++;
        }

    }

    public void toplamCalisanSayisi() {
        System.out.println(this.isim + "'nin toplam çalışan sayısı: " + toplamCalisanSayisi_());
    }

    private int toplamCalisanSayisi_() {
        return calisanlar.size();
    }

}
