package saglikbakanligi;

public class Hemsire extends Calisan {
    
    public Hemsire(String isim,int maas) {
        super(isim);
        setMaas(maas);
    }

    @Override
    void calis() {
        System.out.println("Ben bir hemşireyim ve çalışırım(istediğim kadar).");
    }
    
    public void igneYap(){
        System.out.println("Korkma canım elim hafiftir.");
    }
}
