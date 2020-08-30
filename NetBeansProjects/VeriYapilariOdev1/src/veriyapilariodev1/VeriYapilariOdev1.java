package veriyapilariodev1;

public class VeriYapilariOdev1 {

    public static void main(String[] args) {

        dinamikListe liste = new dinamikListe();

        
        liste.elemanEkle(10);
        
        liste.elemanEkle(20);
        
        liste.elemanEkle(30);
        
        liste.elemanEkle(40);
       
        liste.elemanEkle(50);
       
        liste.elemanEkle(60);
        
        liste.elemanEkle(70);
        
        liste.elemanEkle(80);
        
        liste.elemanEkle(90);
        
        
        liste.elemanSil(0); // silmek istediğiniz elemanı || elemanları girin

        liste.arayaElemanKoy(0 , 0); // ilk değer diziye eklenecek sayı, ikinci değer ise ekleneceği indis numarasıdır

        liste.listeYazdir();

    }

}
