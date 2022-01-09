package garnizon;

abstract public class Subay extends Asker implements Uzmanlik {

    private String uzmanKidemi = " ";
    private int uzmanKidemSayisi = 0;
    private String envanter = "";

    public Subay(String ad, String memleket, String rutbe, int yas) {
        super(rutbe);
        this.memleket = memleket;
        setIsim(ad);
        this.yas = yas;
    }

    @Override
    public void kos() {
        if (getIsim().equals("Muhammed")) {
            int k = 750 / yas;
            String yazi = "";
            if (yas >= 65) {
                k = 0;
                yazi = "çünkü otostopla geldim yaz okulu için para lazım";
            }

            System.out.println("Ben " + getIsim() + " ve " + k + " km koştum " + yazi);
        }else{
            int k = 750 / yas;
            String yazi = "";
            if (yas >= 65) {
                k = 0;
                yazi = "çünkü otobüsle geldim akbil beleş";
            }

            System.out.println("Ben " + getIsim() + " ve " + k + " km koştum " + yazi);
        }
    }

    @Override
    public void yuz() {
        System.out.println("Subay yüzüyor");
    }

    @Override
    public void keskinNisanciOl() {

        if (uzmanKidemSayisi == 0) {
            uzmanKidemi = "Keskin Nişancı";
            uzmanKidemSayisi = 10;
            envanter = "M21";
            rutbe = uzmanKidemi + " " + rutbe;
        }

    }

    @Override
    public void tankciOl() {
        if (uzmanKidemSayisi == 0) {
            uzmanKidemi = "Tankçı";
            uzmanKidemSayisi = 20;
            envanter = "M1A2 Abrams";
            rutbe = uzmanKidemi + " " + rutbe;
        }
    }

    @Override
    public void piyadeOl() {

        if (uzmanKidemSayisi == 0) {
            uzmanKidemi = "Piyade";
            uzmanKidemSayisi = 30;
            envanter = "G3";
            rutbe = uzmanKidemi + " " + rutbe;
        }
    }

    @Override
    public void kidemAtla() {

        if (uzmanKidemSayisi >= 11 && uzmanKidemSayisi < 20) {
            envanter = "Barrett M82";
            uzmanKidemSayisi++;
            rutbe = rutbe.substring(5);
            rutbe = (uzmanKidemSayisi % 10) + ".Kd " + rutbe;
        } else if (uzmanKidemSayisi >= 21 && uzmanKidemSayisi < 30) {
            envanter = "Leopard 2A4 NG";
            uzmanKidemSayisi++;
            rutbe = rutbe.substring(5);
            rutbe = (uzmanKidemSayisi % 10) + ".Kd " + rutbe;
        } else if (uzmanKidemSayisi >= 31) {
            envanter = "M16A4 AR";
            uzmanKidemSayisi++;
            rutbe = rutbe.substring(5);
            rutbe = (uzmanKidemSayisi % 10) + ".Kd " + rutbe;
        }

        if (uzmanKidemSayisi == 10) {
            envanter = "Barrett M82";
            uzmanKidemSayisi++;
            rutbe = (uzmanKidemSayisi % 10) + ".Kd " + rutbe;
        } else if (uzmanKidemSayisi == 20) {
            envanter = "Leopard 2A4 NG";
            uzmanKidemSayisi++;
            rutbe = (uzmanKidemSayisi % 10) + ".Kd " + rutbe;
        } else if (uzmanKidemSayisi == 30) {
            envanter = "M16A4 AR";
            uzmanKidemSayisi++;
            rutbe = (uzmanKidemSayisi % 10) + ".Kd " + rutbe;
        }

    }

}
