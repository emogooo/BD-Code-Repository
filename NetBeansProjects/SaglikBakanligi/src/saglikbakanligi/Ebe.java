package saglikbakanligi;

public class Ebe extends Hemsire{

    public Ebe(String isim, int maas) {
        super(isim, maas);
    }
    
    public void cocuguCikar(){
        System.out.println("Ikınınız.");
    }
    
    @Override
    public void calis(){
        System.out.println("Ben bir ebeyim beni arıyorlar kaçmam lazım.");
    }
    
}
