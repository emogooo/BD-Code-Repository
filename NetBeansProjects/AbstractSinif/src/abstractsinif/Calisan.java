package abstractsinif;

abstract public class Calisan {
    String isim;
     public Calisan(){
         
     }
    public Calisan(String isim){
         this.isim=isim;
     }
    void calis(){
        System.out.println(isim + " çalışmaya başladı.");
        
    }
    
}
