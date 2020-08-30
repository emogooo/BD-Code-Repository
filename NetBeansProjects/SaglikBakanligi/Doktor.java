package saglikbakanligi;

public class Doktor extends Calisan implements ameliyatYapabilir {

    String uzmanlikAlani;
    int ameliyatSayaci = 0;

    public Doktor(String isim, int maas, String uzmanlikAlani) {
        super(isim);
        setMaas(maas);
        this.uzmanlikAlani = uzmanlikAlani;
    }

    @Override
    void calis() {
        System.out.println("Ben bir doktorum ve günde 25 saat çalışırım.");
    }

    @Override
    public void ameliyatYap(double hastaYasi, boolean sigaraKullanimi, double gecirdigiBuyukHastalikSayisi) throws HastaKaybi {

        double sigara = 0.6;
        if (sigaraKullanimi) {
            sigara = 2.2;
        }
        
        double ameliyatDegiskeni = (sigara*(hastaYasi/35)*(gecirdigiBuyukHastalikSayisi+0.5)+(3/(ameliyatSayaci+1)))/20;

        ameliyatSayaci++;
        
        if (ameliyatDegiskeni > 1) {
            throw new HastaKaybi();
        }
        System.out.println(ameliyatSayaci + ". ameliyatımı yapacağım korkmayın çok tecrübeliyim.");

    }

}
