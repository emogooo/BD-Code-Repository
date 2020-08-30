package abstractsinif;

import java.util.ArrayList;

public class AbstractSinif {

    void mesaiyeBasla(ArrayList<Calisan> calisanlar) {
        for (Calisan c : calisanlar) {
            c.calis();
        }
        for (int i = 0; i < calisanlar.size(); i++) {
            calisanlar.get(i).calis();
        }

    }

//    public void adaletDagit(Batman[] b) {
//        for (int i = 0; i < b.length; i++) {
//            b[i].adalet();
//        }
//    }
//
//    public void ucmayaBasla(Superman[] s) {
//        for (int i = 0; i < s.length; i++) {
//            s[i].uc();
//        }
//    }

    public static void main(String[] args) {
        Calisan c1 = new Doktor("Ali");
        Doktor c2 = new Doktor("Ayşe");
        Hemsire c3 = new Hemsire("Zeki");
        Mudur c4 = new Mudur();
        ArrayList a14 = new ArrayList<Calisan>();
        
        try {
            c2.ameliyatYap();
        } catch (Exception e) {
            System.out.println("Hata yok kardeş devam et");
        }
        
        System.out.println("Ben Muhammed 1 km'ye yakın yürüdüm çünkü saat 21.48 ve yurda gitmek istiyorum");
        
        ameliyatYapabilir a1 = new Doktor("Emirhan");
        
        c1.calis();
        a1.ameliyatYap();

    }

}
