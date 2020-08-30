package MERVE_BINGOL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MERVE_BINGOL {

    int i, gecici, k, j;
    public int[] dizi = new int[15];
    int[] dizi1 = new int[15];
    int sayac = 0;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        dosyaokumayazma ds = new dosyaokumayazma();
        ds.dosyaOku();
        ds.siralamaYap();
        ds.dizileriBirlestir();
        ds.dosyayaYaz();
        ds.aramaYap();
    }

    public void dosyaOku() throws FileNotFoundException, IOException {
        File f = new File("diziler.txt");
        Scanner dosya = new Scanner(f);

        for (int i = 0; i < 2; i++) {
            String isim = dosya.nextLine();
            System.out.println(isim);
            for (int j = 0; j < 5; j++) {
                int sayi = dosya.nextInt();
                System.out.println(sayi);
            }
            dosya.nextLine();
        }
    }

    public void siralamaYap() throws FileNotFoundException {

        System.out.println("dizi1 ve dizi2'nin sıralanmış hali");
        File file = new File("diziler.txt");
        Scanner dos = new Scanner(file);

        Integer[] informations = new Integer[5];
        int users = 0;
        for (int i = 0; i < 1; i++) {
            String deger = dos.nextLine();
            System.out.println(deger);
            for (int j = 0; j < 5; j++) {
                informations[j] = dos.nextInt();
                users++;
            }
            dos.nextLine();
        }

        for (int x = 0; x < users - 1; x++) {
            for (int j = x + 1; j < users; j++) {
                if (informations[x] > informations[j]) //tam tersi için büyüktür işareti yap..
                {
                    gecici = informations[x];
                    informations[x] = informations[j];
                    informations[j] = gecici;
                }
            }
        }

        for (int x = 0; x < users; x++) {
            System.out.println(informations[x]);
        }

        System.out.println("\n");

        File a = new File("diziler.txt");
        Scanner dosya5 = new Scanner(a);

        Integer[] informations1 = new Integer[5];

        for (int j = 0; j < 2; j++) {
            if (j == 1) {
                String isim = dosya5.nextLine();
                System.out.println(isim);
            }
            for (int s = 0; s < 5; s++) {
                dosya5.nextLine();
                if (j == 1 && s < 5) {
                    informations1[s] = dosya5.nextInt();
                    sayac++;
                }
            }
            dosya5.nextLine();
        }

        for (int x = 0; x < sayac - 1; x++) {
            for (int j = x + 1; j < sayac; j++) {
                if (informations1[x] > informations1[j]) //tam tersi için büyüktür işareti yap..
                {
                    gecici = informations1[x];
                    informations1[x] = informations1[j];
                    informations1[j] = gecici;
                }
            }
        }

        for (int x = 0; x < sayac; x++) {
            System.out.println(informations1[x]);
        }

        System.out.println("\n");

        System.out.println("\n");
    }

    public void dizileriBirlestir() {
        System.out.println("dizi3");
        Integer[] informations11 = new Integer[11];
        try {
            File myObj = new File("diziler.txt");
            Scanner myReader = new Scanner(myObj);
            for (i = 0; i < 2; i++) {
                myReader.nextLine();
                while (myReader.hasNextInt()) {
                    i = 0;
                    while (i < 5) {
                        dizi[i] = myReader.nextInt();
                        //System.out.println(dizi[i]);
                        i++;
                    }
                }
                for (i = 0; i < 2; i++) {
                    myReader.nextLine();
                    while (myReader.hasNextInt()) {
                        i = 6;
                        while (i < 12) {
                            dizi[i] = myReader.nextInt();
                            //System.out.println(dizi[i]);
                            i++;
                        }
                    }

                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int x = 0; x < 10; x++) {
            for (int j = x + 1; j < 11; j++) {
                if (dizi[x] > dizi[j]) {
                    gecici = dizi[x];
                    dizi[x] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }

        for (int x = 0; x < 11; x++) {
            System.out.println(dizi[x]);
        }
    }

    public void dosyayaYaz() {
        try {
            File dosyaAdi = new File("siralanmisDizi");
            dosyaAdi.createNewFile();

            FileWriter yazici = new FileWriter(dosyaAdi);
            for (int i = 0; i < 11; i++) {
                yazici.write(String.valueOf(dizi[i] + "\n"));
            }
            yazici.close();

        } catch (IOException e) {
            System.out.println("hata oluştu");
            e.printStackTrace();
        }

    }

    public void aramaYap() {
        Scanner klavye = new Scanner(System.in);
        int k = 0;

           //System.exit(0);
        try {
            for (int j = 0;; j++) {
                System.out.println("Aranan sayiyi giriniz:");
                int aranan;
                int sayac = 0;
                aranan = klavye.nextInt();
                File dosyaAdi = new File("siralanmisDizi");
                dosyaAdi.createNewFile();

                FileWriter yazici = new FileWriter(dosyaAdi);

                Scanner scan = new Scanner(dosyaAdi);

                for (int i = 0; i < 11; i++) {
                    if (aranan == dizi[i]) {
                        System.out.println("Aradiginiz sayi " + i + ". satirdadir.");
                    }
                    if (aranan != dizi[i]) {
                        sayac++;

                        if (sayac == 11) {
                            System.out.println("Aradiginiz sayi dizide yok.");
                        }
                    }
                    yazici.close();

                }
            }
        } catch (IOException exception) {
            System.out.println(" İşlem yapılırken matematiksel bir hata oluştu :");
        }

    }

}

