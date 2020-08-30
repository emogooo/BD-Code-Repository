package garnizon;

public class Kurmay extends Subay implements Pasalik {

    private int pasaSayaci;

    public Kurmay(String ad, String memleket, String rutbe, int yas) {
        super(ad, memleket, rutbe, yas);
        pasaSayaci = 0;
    }

    @Override
    public void pasaOl() {
        if (pasaSayaci == 0) {
            System.out.println("Hulusi AKAR : Hayırlı olsun evladım, Allah yolunu bahtını açık etsin.");
            rutbe = "Kurmay " + rutbe;
            pasaSayaci = 1;
        } else {
            System.out.println("Bu kişi zaten paşa olmuş.");
        }

    }

    @Override
    public void pasaliktanDus() {
        if (pasaSayaci == 1) {
            System.out.println("Hulusi AKAR : Yazıklar olsun evladım, Allah yolunu bahtını kapatsın.");
            rutbe = rutbe.substring(7);
            pasaSayaci = -1; //-1 yapmamın sebebi bir asker paşalıktan düşüp tekrardan paşa olamaz şeklinde düşündüğüm için.
        } else {
            System.out.println("Bu kişi daha önce paşalıktan düşmüş veya paşa olmamıştır.");
        }

    }

}
