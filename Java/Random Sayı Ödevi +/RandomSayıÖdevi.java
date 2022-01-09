package random.sayı.ödevi;

import java.util.Random;
import java.util.Scanner;

public class RandomSayıÖdevi {

    public static int[][] tekrarSay(int dizi[][], int db , int sa){
    
        for (int i = 1; i < db+1; i++) {
            
            for (int j = 0; j < sa+1; j++) {
                
                if (j==dizi[i][0]) {
                    
                    dizi[0][j]++;
                    break;
                }
            }
        }
        return dizi;
    }
    
    public static void main(String[] args) {
        
        Scanner al = new Scanner(System.in);
        System.out.println("Kaç tane sayı üretilsin?");
        int db = al.nextInt();
        System.out.println("Sayılar 0 ile hangi aralıkta üretilsin?");
        int sa = al.nextInt();
        Random rastgele = new Random();
        int[][]dizi=new int[db+1][sa+1];
        for (int i = 1; i < db+1; i++) {
            
            dizi[i][0]=rastgele.nextInt(sa);
            
        }
        
        tekrarSay(dizi,db,sa);
        
        
        System.out.println("-----------------------------------");
        int sayac=1;
        for (int i = 1; i < db+1; i++) {
            
            System.out.println(sayac+". sayı = "+dizi[i][0]+"..... tekrar sayısı : "+dizi[0][dizi[i][0]]);
            sayac++;
        }
    }
    
}
