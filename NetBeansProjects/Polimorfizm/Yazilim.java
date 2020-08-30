package polimorfizm;

import java.util.ArrayList;

public class Yazilim extends Cihaz implements Yuklenebilir, Sorgulama {

    int kodSatirSayisi;

    public Yazilim(int kodSatirSayisi, String isim) {
        super(isim);
        this.kodSatirSayisi = kodSatirSayisi;
        setFiyat(fiyatHesapla());
    }

    @Override
    public double fiyatHesapla() {
        return kodSatirSayisi * 10;
    }

    @Override
    public void yukle(Bilgisayar b) {
        //String sonuc = b.yazilimSorgula(this);
        //System.out.println(sonuc);
        
        //Farklı yöntemle
        
        for (int i = 0; i < b.yazilimlar.size(); i++) {
            if (this.isim.equalsIgnoreCase(b.yazilimlar.get(i).isim)) {
                System.out.println("Bu " + this.isim + " yazilimi " + b.isim + " bilgisayarına daha önce yüklenmiştir");
                return;
            }
        }
        b.yazilimlar.add(this);
        System.out.println("Bu " + this.isim + " yazilimi " + b.isim + " bilgisayarına başarı ile yüklenmiştir");

    }

    @Override
    public void kaldir(Bilgisayar b) {

    }

    @Override
    public void guncelle(Bilgisayar b) {

    }

    @Override
    public void guvenlikSorgulama(Bilgisayar b) {

    }

}
