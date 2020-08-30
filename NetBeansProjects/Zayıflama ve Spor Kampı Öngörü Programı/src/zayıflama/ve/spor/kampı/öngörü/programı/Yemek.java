package zayıflama.ve.spor.kampı.öngörü.programı;

public class Yemek {

    String adi;
    String turu;
    double ucreti;
    double kalorisi;

    public Yemek() {

    }

    public Yemek(String adi, String turu,  double kalorisi,double ucreti) {

        this.adi = adi;
        this.turu = turu;      
        this.kalorisi = kalorisi;
        this.ucreti = ucreti;
    }

    public void menuGetir(Yemek patates, Yemek tost, Yemek salata, Yemek tavuk, Yemek pilav, Yemek kofte) {

        System.out.println("------------------------------------------------------------------"
                + "\nKahvaltılar :" + patates.adi + "..:" + patates.ucreti + " Lira .... kodu = 1 \n"
                + "             " + tost.adi + "..:" + tost.ucreti + " Lira .... kodu = 2 \n"
                + "\nÖğle Yemekleri:" + salata.adi + "..:" + salata.ucreti + " Lira .... kodu = 3 \n"
                + "              :" + tavuk.adi + "..:" + tavuk.ucreti + " Lira ....kodu = 4 \n"
                + "\nAkşam Yemekleri:" + pilav.adi + "..:" + pilav.ucreti + " Lira .... kodu = 5 \n"
                + "                " + kofte.adi + "..:" + kofte.ucreti + " Lira ....kodu = 6 \n"
                + "--------------------------------------------------------------------");
    }

    public double ucretHesapla(int sbh, int ogl, int aks, Yemek patates, Yemek tost, Yemek salata, Yemek tavuk, Yemek pilav, Yemek kofte) {

        double para = 0;

        if (sbh == 1) {
            para += patates.ucreti;

        } else {
            para += tost.ucreti;

        }

        if (ogl == 3) {
            para += salata.ucreti;

        } else {
            para += tavuk.ucreti;

        }

        if (aks == 5) {
            para += pilav.ucreti;

        } else {
            para += kofte.ucreti;

        }
        return para;

    }

    public double kaloriHesapla(int sbh, int ogl, int aks, Yemek patates, Yemek tost, Yemek salata, Yemek tavuk, Yemek pilav, Yemek kofte) {

        double kalori = 0;

        if (sbh == 1) {

            kalori += patates.kalorisi;
        } else {

            kalori += tost.kalorisi;
        }

        if (ogl == 3) {

            kalori += salata.kalorisi;
        } else {

            kalori += tavuk.kalorisi;
        }

        if (aks == 5) {

            kalori += pilav.kalorisi;
        } else {

            kalori += kofte.kalorisi;
        }

        return kalori;

    }
}
