package polimorfizm;

import java.util.ArrayList;

public class Bilgisayar extends Donanim {

    String isim;
    ArrayList<Yazilim> yazilimlar = new ArrayList();

    public Bilgisayar(String isim,double hiz) {
        super(hiz);
        this.isim = isim;
        
    }

    String yazilimSorgula(Yazilim y) {
        
        for (Yazilim a : yazilimlar) {
            if (y.isim.equalsIgnoreCase(a.isim)) {
                return "Bu " + y.isim + " yazilimi " + isim + " bilgisayarına daha önce yüklenmiştir";
            }
        }
        yazilimlar.add(y);
        return "Bu " + y.isim + " yazilimi " + isim + " bilgisayarına başarı ile yüklenmiştir";

    }
    public double programKarBic(){
      
        double toplam=0;
        for (int i=0; i<yazilimlar.size();i++){
            toplam+=yazilimlar.get(i).getFiyat();
        }       
        return toplam;
    }

}
