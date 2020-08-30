package determinant.hesaplama.programı;

import java.util.Scanner;

public class DeterminantHesaplamaProgramı {

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        System.out.println("Determinant hesaplama programına hoşgeldiniz.Matrisinizin boyut sayısını giriniz.");
        int mb = al.nextInt();
        
        if(mb==1){
        
            System.out.println("a11'i yazın");
            int a11=al.nextInt();
            System.out.println("Determinant = "+a11);
        
        }
        if(mb==2){
        
            System.out.println("a11'i yazın");
            int a11=al.nextInt();
            System.out.println("a12'i yazın");
            int a12=al.nextInt();
            System.out.println("a21'i yazın");
            int a21=al.nextInt();
            System.out.println("a22'i yazın");
            int a22=al.nextInt();
          
            System.out.println("Determinant = "+(a11*a22-a12*a21));
        }
        if(mb==3){
        
            System.out.println("a11'i yazın");
            int a11=al.nextInt();
            System.out.println("a12'i yazın");
            int a12=al.nextInt();
            System.out.println("a13'i yazın");
            int a13=al.nextInt();
            System.out.println("a21'i yazın");
            int a21=al.nextInt();
            System.out.println("a22'i yazın");
            int a22=al.nextInt();
            System.out.println("a23'i yazın");
            int a23=al.nextInt();
            System.out.println("a31'i yazın");
            int a31=al.nextInt();
            System.out.println("a32'i yazın");
            int a32=al.nextInt();
            System.out.println("a33'i yazın");
            int a33=al.nextInt();
            
            System.out.println("Determinant = "+((a11*a22*a33)+(a21*a32*a13)+(a31*a12*a23)-(a13*a22*a31)-(a23*a32*a11)-(a33*a21*a12)));
        }
    }

}
