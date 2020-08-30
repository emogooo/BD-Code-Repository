package garnizon;

abstract public class Asker implements Yuzebilir {

    protected int yas;
    protected String rutbe;
    protected String memleket;
    private String isim;

    public Asker(String rutbe) {
        this.rutbe = rutbe;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    abstract public void kos();

    public void tekmilVer() {
        System.out.println(getIsim() + " " + memleket + " emret komutanım.");
    }

    @Override
    public String toString() {

        return rutbe + " " + getIsim() + " " + yas + " " + memleket;
    }
}
