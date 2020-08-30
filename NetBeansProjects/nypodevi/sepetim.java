
package nypodevi;

public class sepetim{
public static void main(String[]args)  {
televizyon TV1= new televizyon("LG","AKLSJHD23",1000.0, 60);
televizyon TV2= new televizyon("LG","M12HSDLFKJ",2342.0, 50);
televizyon TV3= new televizyon("Philips","ASKDJFH234",3800.0, 37);
televizyon TV4= new televizyon("Vestel","C3847ASD",2200.0, 35);
televizyon TV5= new televizyon("Arçelik","AASD234A",2238.4, 65);

telefon telefon1= new telefon("Apple","Iphone XS MAX",9000.0, 10);
telefon telefon2= new telefon("Samsung","S10",5500, 7);
telefon telefon3= new telefon("SAMSUNG","S3 MİNİ",4800, 5);
telefon telefon4= new telefon("SAMSUNG","Note 4",4600, 12);
telefon telefon5= new telefon("GENERAL MOBİLE","GM5 PLUS",1700, 10);

bilgisayar bilgisayar1= new bilgisayar("CASPER","EXCALIBUR",8000.0);
bilgisayar bilgisayar2= new bilgisayar("Monster","Abra A3",5800.0);
bilgisayar bilgisayar3= new bilgisayar("LENOVO","80YL",5000.0);
bilgisayar bilgisayar4= new bilgisayar("Lenovo","G570",5300.0);
bilgisayar bilgisayar5= new bilgisayar("LENOVO","510",4000.0);

tablet tablet1= new tablet ("SAMSUNG","GALAXY TAB1",1700.5,15);
tablet tablet2= new tablet ("SAMSUNG","GALAXY TAB",2000.8, 17);
tablet tablet3= new tablet ("SAMSUNG","GALAXY TAB2",5000.5, 9);
tablet tablet4= new tablet ("APPLE","GALAXY TAB4",1700.0, 16);
tablet tablet5= new tablet ("SAMSUNG","GALAXY TAB5",1100.0, 19);
      
stok stok= new stok();
        
  stok.TelefonListesi.add(telefon1);
  stok.TelefonListesi.add(telefon2); 
  stok.TelefonListesi.add(telefon3); 
  stok.TelefonListesi.add(telefon4); 
  stok.TelefonListesi.add(telefon5); 
  
  stok.TabletListesi.add(tablet1);
  stok.TabletListesi.add(tablet2); 
  stok.TabletListesi.add(tablet3); 
  stok.TabletListesi.add(tablet4); 
  stok.TabletListesi.add(tablet5);
  
  stok.BilgisayarListesi.add(bilgisayar1);
  stok.BilgisayarListesi.add(bilgisayar2); 
  stok.BilgisayarListesi.add(bilgisayar3); 
  stok.BilgisayarListesi.add(bilgisayar4); 
  stok.BilgisayarListesi.add(bilgisayar5);
  
  stok.TelevizyonListesi.add(TV1);
  stok.TelevizyonListesi.add(TV2); 
  stok.TelevizyonListesi.add(TV3); 
  stok.TelevizyonListesi.add(TV4); 
  stok.TelevizyonListesi.add(TV5);
  

    
    
}
}
