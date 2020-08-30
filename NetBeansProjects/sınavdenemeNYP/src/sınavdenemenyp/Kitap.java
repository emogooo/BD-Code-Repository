package sınavdenemenyp;

import java.util.Date;

public class Kitap {

    private String isim;
    int baskiYili;
    private int oduncSuresi;
    private Date alisZamani;

    public Kitap(String isim, int baskiYili, int oduncSuresi) {
        this.isim = isim;
        this.baskiYili = baskiYili;
        this.oduncSuresi = oduncSuresi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
