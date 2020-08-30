package djikstra;

import java.util.ArrayList;

public class Dugum {

    String isim;
    ArrayList<Dugum> komsular;
    ArrayList<Integer> uzakliklar;

    public Dugum(String isim) {
        this.isim = isim;
        komsular = new ArrayList<Dugum>();
        uzakliklar = new ArrayList<Integer>();
    }

    public void komsuEkle(Dugum komsu, int uzaklik) {
        komsular.add(komsu);
        uzakliklar.add(uzaklik);
    }
}
