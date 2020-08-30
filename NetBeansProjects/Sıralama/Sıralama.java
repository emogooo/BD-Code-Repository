package sıralama;

import java.util.Random;

public class Sıralama {

    public static void main(String[] args) {
           
        Random rastgele = new Random();
        int [] dizi = new int [10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=rastgele.nextInt(100);
            System.out.println(dizi[i]);
        }
        System.out.println("---------------");
        siralama(dizi);
    }
    
    public static void siralama(int a []){
        int enkucuk=a[0];
        int enbuyuk=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>enbuyuk){
              
                enbuyuk=a[i];
                
            }
            else if(a[i]<enkucuk){
            
                enkucuk=a[i];
                
            }
        }
        System.out.println("En küçük sayı = "+enkucuk);
        System.out.println("En büyük sayı = "+enbuyuk);
    }
    
}
