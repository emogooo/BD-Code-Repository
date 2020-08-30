package finalodevialgoritma;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FinalOdeviAlgoritma {

    static int dizi1[], dizi2[], dizi3[];

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // --------- 1. Aşama -----------
        dosyayiOku("C:/Users/EMOGO/Desktop/abc.txt");

        System.out.println("--- 1. Dizi ---");
        yazdir(dizi1);

        System.out.println("--- 2. Dizi ---");
        yazdir(dizi2);

        siralamaYap(dizi1);
        siralamaYap(dizi2);

        System.out.println("--- 1. Dizi Sıralanmış Hali ---");
        yazdir(dizi1);

        System.out.println("--- 2. Dizi Sıralanmış Hali ---");
        yazdir(dizi2);

        // --------- 2. Aşama -----------
        dizileriBirlestir();
        System.out.println("--- 3. Dizi Sıralanmış Hali ---");
        yazdir(dizi3);
        dosyayiYaz("C:/Users/EMOGO/Desktop/siralanmisDiziler.txt");

        // --------- 3. Aşama ---------
        Scanner oku = new Scanner(System.in);

        while (true) {
            System.out.println("Aramak istediğiniz sayıyı girin.");
            try {
                aramaYap(oku.nextInt());
            } catch (Exception exception) {
                System.out.println("Program sonlandırıldı.");
                return;
            }

        }
    }

    static void dosyayiOku(String dosyaYolu) throws FileNotFoundException {

        File f = new File(dosyaYolu);
        Scanner okuyucu = new Scanner(f);
        int dizi1Boyut = 0;
        int dizi2Boyut = 0;
        String okunan;

        while (okuyucu.hasNextLine()) {
            okunan = okuyucu.nextLine();
            if (okunan.equalsIgnoreCase("dizi2")) {
                dizi1Boyut--;
                break;
            }
            dizi1Boyut++;
        }
        while (okuyucu.hasNextLine()) {
            okunan = okuyucu.nextLine();
            dizi2Boyut++;
        }

        int dizi1Beta[] = new int[dizi1Boyut];
        int dizi2Beta[] = new int[dizi2Boyut];

        okuyucu = new Scanner(f);
        okuyucu.nextLine();

        for (int i = 0; i < dizi1Boyut; i++) {
            dizi1Beta[i] = Integer.parseInt(okuyucu.nextLine());
        }

        okuyucu.nextLine();

        for (int i = 0; i < dizi2Boyut; i++) {
            dizi2Beta[i] = Integer.parseInt(okuyucu.nextLine());
        }

        okuyucu.close();

        dizi1 = dizi1Beta;
        dizi2 = dizi2Beta;

        System.out.println("Dosyanın içindeki değerler dizilere aktarıldı.");
    }

    static void siralamaYap(int[] dizi) {

        int kova;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = dizi.length - 1; j > i; j--) {
                if (dizi[j - 1] > dizi[j]) {
                    kova = dizi[j - 1];
                    dizi[j - 1] = dizi[j];
                    dizi[j] = kova;
                }
            }
        }

        System.out.println("Sıralama başarıyla tamamlandı.");
    }

    static void yazdir(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            System.out.print(dizi[i] + ", ");
        }
        System.out.println(dizi[dizi.length - 1]);
    }

    static void dizileriBirlestir() {
        dizi3 = new int[dizi1.length + dizi2.length];

        for (int i = 0, j = 0, k = 0; k < dizi3.length; k++) {

            if (dizi1[i] <= dizi2[j]) {
                dizi3[k] = dizi1[i++];
                if (i == dizi1.length) {
                    for (int p = k + 1; p < dizi3.length; p++) {
                        dizi3[p] = dizi2[j++];
                    }
                    break;
                }
            } else {
                dizi3[k] = dizi2[j++];
                if (j == dizi2.length) {
                    for (int p = k + 1; p < dizi3.length; p++) {
                        dizi3[p] = dizi1[i++];
                    }
                    break;
                }
            }
        }
        System.out.println("Sıralı oluşturma işlemi tamamlandı.");
    }

    static void dosyayiYaz(String dosyaYolu) throws FileNotFoundException, IOException {

        File f = new File(dosyaYolu);

        if (!f.exists()) {
            f.createNewFile();
        }

        BufferedWriter yazici = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));

        for (int i = 0; i < dizi3.length - 1; i++) {
            yazici.append(dizi3[i] + "");
            yazici.newLine();
        }
        yazici.append(dizi3[dizi3.length - 1] + "");

        yazici.flush();
        yazici.close();

        System.out.println("Yazma işlemi başarıyla tamamlandı.");
    }

    static void aramaYap(int sayi) throws FileNotFoundException {
        File f = new File("C:/Users/EMOGO/Desktop/siralanmisDiziler.txt");
        Scanner okuyucu = new Scanner(f);
        int satir = 1;
        while (okuyucu.hasNextLine()) {
            if (Integer.parseInt(okuyucu.nextLine()) == sayi) {
                System.out.println("Aradığınız sayı dosyada " + satir + ". satırda bulunmaktadır.");
                okuyucu.close();
                return;
            }
            satir++;
        }
        System.out.println("Aradığınız sayı bulunamadı.");
        okuyucu.close();
    }

}
