package saglikbakanligi;

abstract public class Calisan {
    String isim;
    private int maas;

    public Calisan(String isim){
        this.isim=isim;
    }
    
    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    
    abstract void calis();
}
