package com.example.dolap;

public class Urunler {
    int image;
    String baslik;
    String aciklama;
    double fiyat;
    int like;

    public Urunler(int image, String baslik, String aciklama, double fiyat) {
        this.image = image;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
        this.like = 0;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
