package hastaneplus;

import java.util.ArrayList;

public class HastanePlus {

    String isim;
    int odaSayisi;
    int doktorSayisi;

    ArrayList<Doktor> doktorListesi = new ArrayList();

    void doktorEkle(Doktor d) {

        doktorListesi.add(d);
    }

    void listeYazdir() {

        for (int i = 0; i < doktorListesi.size(); i++) {
            System.out.println("\n"+doktorListesi.get(i).isim + " - " + doktorListesi.get(i).uzmanlikAlani + " - " +doktorListesi.get(i).no);
        }

    }
    
    int tecrubeSorgula(){
    
        int sayac=0;
        for (int i = 0; i < doktorListesi.size(); i++) {
            if (doktorListesi.get(i).tecrube>=10) {
                sayac++;
            }
        }
        
        return sayac;   
    }

    public static void main(String[] args) {

        HastanePlus hastane = new HastanePlus();
        hastane.isim = "Tokat Devlet Hastanesi";
        hastane.odaSayisi = 1000;
        hastane.doktorSayisi = 100;

        Doktor d1 = new Doktor();
        d1.isim = "Mehmet Hiçbilmeyen";
        d1.no = 1;
        d1.tecrube = 10;
        d1.uzmanlikAlani = "Ortopedi";

        Doktor d2 = new Doktor();
        d2.isim = "Fatma Hiçamahiçbilmeyen";
        d2.tecrube = 15;
        d2.uzmanlikAlani = "Nöroloji";

        Doktor d3 = new Doktor(3,"Emirhan Cahil","Üroloji",6); 
        Doktor d4 = new Doktor(4,"Dmitry Ghluaksov","Göz Hastalıkları",8);
        
        Doktor d5 = new Doktor();
        d5.isim = "Ayşe Bilen";
        d5.tecrube = 10;
        d5.uzmanlikAlani = "Nöroloji";
        
        Doktor d6 = new Doktor(6,"Mert Bilici","KBB",6);
        

        hastane.doktorEkle(d1);
        hastane.doktorEkle(d2);
        hastane.doktorEkle(d3);
        hastane.doktorEkle(d4);
        hastane.doktorEkle(d5);
        hastane.doktorEkle(d6);

        hastane.listeYazdir();
        int ts = hastane.tecrubeSorgula();
        
        System.out.println("\nHastanedeki 10 sene üzeri tecrübesi olan doktor sayısı : "+ts);

    }
}

