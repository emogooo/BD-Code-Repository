package garnizon;

public class Astsubay extends Asker{

    public Astsubay(String isim, String memleket, String rutbe, int yas) {
        super(rutbe);
        this.memleket = memleket;
        setIsim(isim);
        this.yas = yas;
    }

    @Override
    public void kos() {
        
        int k = 500/yas;
        String yazi="";
        
        if (yas>=65) {
            k=0;
            yazi="çünkü otobüsle geldim akbil beleş";
        }
        
        
        System.out.println("Ben " + getIsim()+" "+ k +" km koştum "+yazi);
    }

    @Override
    public void yuz() {
        System.out.println("Astsubay yüzüyor");
    }

}
