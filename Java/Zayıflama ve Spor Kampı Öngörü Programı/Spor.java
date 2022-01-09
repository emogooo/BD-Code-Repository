package zayıflama.ve.spor.kampı.öngörü.programı;

public class Spor {

    String spor_adi;
    double saatlik_ucret;
    double saatlik_kalori_yakimi;

    public Spor() {

    }

    public Spor(String spor_adi, double saatlik_ucret, double saatlik_kalori_yakimi) {

        this.spor_adi = spor_adi;
        this.saatlik_ucret = saatlik_ucret;
        this.saatlik_kalori_yakimi = saatlik_kalori_yakimi;
    }

    public void listeGetir(Spor a, Spor b, Spor c) {

        System.out.println("------------------------------------------------------------------"
                + "\n Spor Listesi ve Saatlik Ücretleri\n\n"
                + a.spor_adi + " .....: " + a.saatlik_ucret + " Lira .... kodu.. = 1\n"
                + b.spor_adi + " .....: " + b.saatlik_ucret + " Lira .... kodu.. = 2\n"
                + c.spor_adi + " .....: " + c.saatlik_ucret + " Lira .... kodu.. = 3\n"
                + "--------------------------------------------------------------------");

    }

    public double ucretHesapla(int skodus, double ssaatis, int skoduo, double ssaatio, int skodua, double ssaatia, Spor a, Spor b, Spor c) {

        double para = 0;

        if (skodus == 1) {
            para += a.saatlik_ucret * ssaatis;

        }

        if (skodus == 2) {
            para += b.saatlik_ucret * ssaatis;

        } else {
            para += c.saatlik_ucret * ssaatis;

        }
        if (skoduo == 1) {
            para += a.saatlik_ucret * ssaatio;

        }

        if (skoduo == 2) {
            para += b.saatlik_ucret * ssaatio;

        } else {
            para += c.saatlik_ucret * ssaatio;

        }
        if (skodua == 1) {
            para += a.saatlik_ucret * ssaatia;

        }

        if (skodua == 2) {
            para += b.saatlik_ucret * ssaatia;

        } else {
            para += c.saatlik_ucret * ssaatia;

        }

        return para;
    }

    public double kaloriHesapla(int skodus, double ssaatis, int skoduo, double ssaatio, int skodua, double ssaatia, Spor a, Spor b, Spor c) {

        double kalori = 0;

        if (skodus == 1) {
            kalori += a.saatlik_kalori_yakimi * ssaatis;

        }

        if (skodus == 2) {
            kalori += b.saatlik_kalori_yakimi * ssaatis;

        } else {
            kalori += c.saatlik_kalori_yakimi * ssaatis;

        }
        if (skoduo == 1) {
            kalori += a.saatlik_kalori_yakimi * ssaatio;

        }

        if (skoduo == 2) {
            kalori += b.saatlik_kalori_yakimi * ssaatio;

        } else {
            kalori += c.saatlik_kalori_yakimi * ssaatio;

        }
        if (skodua == 1) {
            kalori += a.saatlik_kalori_yakimi * ssaatia;

        }

        if (skodua == 2) {
            kalori += b.saatlik_kalori_yakimi * ssaatia;

        } else {
            kalori += c.saatlik_kalori_yakimi * ssaatia;

        }

        return kalori;
    }
}
