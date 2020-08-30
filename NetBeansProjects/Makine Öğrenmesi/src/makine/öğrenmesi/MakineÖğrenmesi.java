package makine.öğrenmesi;

import java.util.Scanner;

public class MakineÖğrenmesi {

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        double [][] dizi = new double[2][2];
      
        System.out.println("Makinenin doğru tahmin ettiği erkek fotoğrafı sayısını giriniz.");
        dizi[0][0] = al.nextDouble(); // ERKEK DOĞRU
        System.out.println("Makinenin yanlış tahmin ettiği erkek fotoğrafı sayısını giriniz.");
        dizi[0][1] = al.nextDouble(); //ERKEK YANLIŞ
        System.out.println("Makinenin doğru tahmin ettiği kadın fotoğrafı sayısını giriniz.");
        dizi[1][1] = al.nextDouble(); //KADIN DOĞRU
        System.out.println("Makinenin yanlış tahmin ettiği kadın fotoğrafı sayısını giriniz.");
        dizi[1][0] = al.nextDouble(); //KADIN YANLIŞ
        System.out.println("Aşağıdaki konfüzyon matrisinde bulunan değerler;"
                + "\n E = Erkek fotoğrafı sayısı"
                + "\n K = Kadın fotoğrafı sayısı"
                + "\n D = Makinenin doğru tahmin ettiği fotoğraf sayısı"
                + "\n Y = Makinenin yanlış tahmin ettiği fotoğraf sayısı"
                + "\n ------------------");
        System.out.println("       D        Y"
                + "\n"
                + "\n E    " + dizi[0][0] + "    " + dizi[0][1]
                + "\n"
                + "\n K    " + dizi[1][1] + "    " + dizi[1][0]
                + "\n"
                + "\n-------------------");
        
        performansHesapla(dizi);
        double []cevap = performansHesapla(dizi);
        System.out.println("Makinenin Doğruluk Oranı = %" + cevap[0] * 100
                + "\nMakinenin Keskinlik Oranı = %" + cevap[1] * 100
                + "\nMakinenin Hassasiyet Oranı = %" + cevap[2] * 100
                + "\nMakinenin F-Skor Oranı = %" + cevap[3] * 100);

    }

    public static double[] performansHesapla(double a[][]) {

        double []cevap=new double[4];
        cevap[0] = (a[0][0] + a[1][1]) / (a[0][0] + a[0][1] + a[1][0] + a[1][1]);
        cevap[1] = a[0][0] / (a[0][0] + a[1][0]);
        cevap[2] = a[0][0] / (a[0][0] + a[0][1]);
        cevap[3] = (2 * cevap[1] * cevap[2]) / (cevap[1] + cevap[2]);
        return cevap;
        
    }

}
