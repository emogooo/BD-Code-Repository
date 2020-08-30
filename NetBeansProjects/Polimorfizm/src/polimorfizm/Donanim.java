package polimorfizm;

public class Donanim extends Cihaz {

    double hiz;
    String marka;

    public Donanim(double hiz){
        this.hiz=hiz;
        setFiyat(hiz*350);
    }
    @Override
    public double fiyatHesapla() {
        
        return getFiyat()*5.74 ;
    }

}
