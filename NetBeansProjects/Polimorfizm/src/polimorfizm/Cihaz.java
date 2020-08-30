package polimorfizm;

public abstract class Cihaz {

    private double fiyat;
    public String isim;
    private String model;

    public abstract double fiyatHesapla();

    public String model() {
        return model;
    }

    public Cihaz(String isim) {
        this.isim = isim;
        
    }

    public Cihaz() {
    }
    
    protected double getFiyat(){
        return fiyat;
    }
    protected void setFiyat(double fiyat){
        this.fiyat=fiyat;
    }

}
