package veriyapilariodev1;

public class dinamikListe {

    int[] dizi;
    int elemanSayisi;
    int boyut;

    public dinamikListe() {

        dizi = new int[5];
        elemanSayisi = 0;
        boyut = dizi.length;

    }

    public void elemanEkle(int Eleman) {
        if (elemanSayisi < boyut) {
            dizi[elemanSayisi] = Eleman;
            elemanSayisi++;
        } else {
            boyut *= 2;
            int[] yenidizi = new int[boyut];

            for (int i = 0; i < dizi.length; i++) {
                yenidizi[i] = dizi[i];
            }

            dizi = yenidizi;

            dizi[elemanSayisi] = Eleman;
            elemanSayisi++;

        }

    }

    void listeYazdir() {
        for (int i = 0; i < elemanSayisi; i++) {

            System.out.print(" " + dizi[i]);
        }
        System.out.println("");
    }

    public void elemanSil(int silinecekEleman) {

        for (int i = 0; i < elemanSayisi; i++) {

            if (dizi[i] == silinecekEleman) {  // burada ki amaç silinecek elemanı bulup, silinecek elemandan sonraki elemanı silinecek eleman yerine yazmak. Bu şekilde dizi sonuna kadar bir sonraki elemanı bir önceki elemana yazdırmak

                for (int j = i; j < elemanSayisi - 1; j++) { 

                    dizi[j] = dizi[j + 1];

                }

                elemanSayisi--;
                boyut--;

                if (dizi[i] == silinecekEleman) { // eğer ard arda 2 veya daha fazla silinecek eleman varsa bu kod gerekiyor

                    elemanSil(silinecekEleman);
                }

            }
        }

        for (int i = elemanSayisi; i < boyut; i++) {  // burası dizinin görüntülenmeyen elemanlarınını sıfırlamak için         
                dizi[i] = 0;    
        }

    }

    public void arayaElemanKoy(int koyulacakEleman, int koyulacakIndis) {

        int[] yeniDizi;

        if (elemanSayisi == boyut) {

            yeniDizi = new int[boyut + 1]; // if else kodlarını dizinin boyutunu aşma hatasını ortadan kaldırmak için kullandım
        } else {

            yeniDizi = new int[boyut];
        }

        for (int i = 0, j = 0; i < yeniDizi.length; i++, j++) {

            if (i == koyulacakIndis) {

                yeniDizi[i] = koyulacakEleman;   // buradaki amaç koyulacakİndis'e gelene kadar dizideki elemanları yenidiziye yazdırıp,
                j--;                             // koyulacakİndise geldikten sonra koyulacakElemanı yazdırıp j'yi 1 azaltmaktır ve bundan sonra
                continue;                        // dizi (j-1) ile yazdırılmaya devam eder.
            }

            yeniDizi[i] = dizi[j];
        }

        dizi = yeniDizi;

        elemanSayisi++;

    }
}
