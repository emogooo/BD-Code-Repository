package deneme2;

import static java.lang.reflect.Array.get;
import static java.nio.file.Paths.get;
import java.util.ArrayList;

public class Deneme2 {

    public static void main(String[] args) {
        
        Urun u1 = new Urun();
        Urun u2 = new Urun();
        
        u1.isim="Telefon";
        u1.no=1;
        u2.isim="Buzdolabı";
        u2.no=2;
        
        Urun[] liste = new Urun[2];
        
        liste[0]=u1;
        liste[1]=u2;
        
        ArrayList<Integer> lise = new ArrayList();
        lise.add(100);
        lise.add(200);
        
        
        for (int i = 0; i <liste.length; i++) {
            System.out.println(liste[i].isim+" "+liste[i].no);
        }
               
        
    }
    
}
