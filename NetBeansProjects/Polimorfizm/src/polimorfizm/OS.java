package polimorfizm;

public class OS {

    public static void main(String[] args) {
        Bilgisayar b = new Bilgisayar("Merve", 3.4);
        Bilgisayar b2 = new Bilgisayar("Murat", 2.8);
        Yuklenebilir word = new Yazilim(100, "word");
        word.yukle(b);
        word.yukle(b);
        Yuklenebilir excel = new Yazilim(1000, "excel");
        excel.yukle(b);
        System.out.println(b.programKarBic());
        System.out.println(b.fiyatHesapla());

    }

}
