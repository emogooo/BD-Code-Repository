package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz...");
        int sayi=al.nextInt();
        if(sayi==60){
        
            System.out.println("Doğru sayıyı girdin hll len gizli mit bilgileri paylaşılıyor....");
            System.out.println("..");
        }
        else
            System.out.println("Mitin bilgilerine erişmeye çalışma fedöcü");
           
    }
    
}
