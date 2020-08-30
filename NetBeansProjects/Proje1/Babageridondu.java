package babageridondu;

public class Babageridondu {

    public static void main(String[] args) {

        Agac a = new Agac();
        Urun u1 = new Urun("Samsung", 4000);
        Urun u2 = new Urun("Vestel", 3000);
        Urun u3 = new Urun("iPhone", 5000);
        Urun u4 = new Urun("Asus", 2000);
        Urun u5 = new Urun("Asus", 3500);
        Urun u6 = new Urun("Asus", 4500);

        a.urunEkle(u1);
        a.urunEkle(u2);
        a.urunEkle(u3);
        a.urunEkle(u4);
        a.urunEkle(u5);
        a.urunEkle(u6);

        a.postOrder();
        
    }

}
