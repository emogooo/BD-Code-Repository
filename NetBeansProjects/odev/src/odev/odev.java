package odev;

public class odev {

    public static void main(String[] args) {
        
        insan veli = new insan(20,80,170);
        insan ali = new insan();
        ali.boy=180;
        ali.kilo=80;
        
        System.out.println("alinin özellikleri = "+ali.boy+","+ali.kilo+","+ali.yas);
        System.out.println("velinin özellikleri = "+veli.boy+","+veli.kilo+","+veli.yas);

    }
    
}
