package odev;

public class insan {
    
    int boy;
    int kilo;
    int yas;
    public insan(){
        System.out.println("Bir insan objesi oluşturuldu.");
        this.yas=1;
    }
    
    public insan(int yas, int kilo, int boy){
        this();
        this.yas=yas;
        this.kilo=kilo;
        this.boy=boy;
    }
}
