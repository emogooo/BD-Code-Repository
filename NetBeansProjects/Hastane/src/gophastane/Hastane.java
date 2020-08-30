package gophastane;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Hastane {

    String isim;
    ArrayList<String> bolumler = new ArrayList();
    int doktorSayisi;
    int odaSayisi;
    ArrayList<Doktor> doktorListesi = new ArrayList();

    public void doktorEkle(Doktor d) {
        if (doktorListesi != null) {
            doktorListesi.add(d);
        } else {
            System.out.println("Lütfen doktor listesi nesnesini oluşturunuz");
        }

    }

    public void doktorListesiniYazdir() {
        if (doktorListesi != null) {
            for (int i = 0; i < doktorListesi.size(); i++) {
                System.out.println(doktorListesi.get(i).isim + ", "
                        + doktorListesi.get(i).uzmanlikAlani);
            }
        }
    }

    public int tecrubeSorgula(int a) {
        int sayac = 0;
        if (doktorListesi != null) {
            for (int i = 0; i < doktorListesi.size(); i++) {
                if (doktorListesi.get(i).tecrube >= a) {
                    sayac++;
                }
            }
        }
        return sayac;
    }

    public static void main(String[] args) {
        Hastane h = new Hastane();
        h.isim = "Gop tıp fakültesi";
        h.odaSayisi = 500;
        h.doktorSayisi = 50;

        Doktor d1 = new Doktor();
        d1.isim = "Ali Bilir";
        d1.sicilNo = 60;
        d1.tecrube = 5;
        d1.uzman = true;
        d1.uzmanlikAlani = "KBB";

        Doktor d2 = new Doktor();
        d2.isim = "Ayşe ÇokBilir";
        d2.sicilNo = 61;
        d2.tecrube = 7;
        d2.uzman = true;
        d2.uzmanlikAlani = "Kardiyoloji";

        Doktor d3 = new Doktor();
        d3.isim = "Mehmet AzBilir";
        d3.sicilNo = 62;
        d3.tecrube = 3;
        d3.uzman = false;
        d3.uzmanlikAlani = "Çocuk Hastalıkları";

        h.doktorEkle(d1);
        h.doktorEkle(d2);
        h.doktorEkle(d3);

        h.doktorListesiniYazdir();
        int sayi = h.tecrubeSorgula(7);

        System.out.println("Tecrubeli doktor sayisi: " + sayi);

    }

}
