package kapsülleme.ve.soyutlama;

public class KapsüllemeVeSoyutlama {

    public static void main(String[] args) {
        
        muhendis ali = new muhendis();
        muhendis veli = new muhendis();
        veli.setYas(10);
        ali.setYas(25);
        System.out.println(ali.getYas());
        ali.setMaas(5000);
        ali.kurnaz();
        System.out.println(ali.getMaas());
    }   
}

interface ajan{
    void kurnaz();
    void bagir();
}

abstract class insan{
    protected int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    private static int sayac=0;

    public static int getSayac() {
        return sayac;
    }
    public insan(){
        sayac++;
    }
    
}
class muhendis extends insan implements ajan{
    private int maas;

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    public void kurnaz(){
        System.out.println("s");
    }
    public void bagir(){
        
    }
}


