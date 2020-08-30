package zayıflama.ve.spor.kampı.öngörü.programı;

import java.util.Scanner;

public class ZayıflamaVeSporKampıÖngörüProgramı {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        Spor basketbol = new Spor("Basketbol", 3.0, 1000.0);
        Spor yuzme = new Spor("Yüzme", 5.0, 700.0);
        Spor kosu = new Spor("Koşu", 1.0, 1200.0);

        Yemek patates = new Yemek("Haşlanmış Patates", "Kahvaltı", 300.0, 4.0);
        Yemek tost = new Yemek("Ayvalık Tost", "Kahvaltı", 400.0, 5.0);
        Yemek salata = new Yemek("Mevsim Salata", "Öğle Yemeği", 100.0, 3.0);
        Yemek tavuk = new Yemek("Soslu Tavuk", "Öğle Yemeği", 500.0, 6.0);
        Yemek pilav = new Yemek("Bulgur Pilavı", "Akşam Yemeği", 400.0, 4.0);
        Yemek kofte = new Yemek("Fırında Köfte", "Akşam Yemeği", 600.0, 7.0);

        System.out.print("ZAVESKÖP'e hoşgeldiniz. Bu program sizin, kampımızdaki günlük kalori yakımını öngörü programıdır. Devam etmek için herhangi birşey yazın.");

        String x = oku.next();

        tavuk.menuGetir(patates, tost, salata, tavuk, pilav, kofte);

        System.out.println("Lütfen sabah kahvaltısında yemek istediğiniz yiyeceğin kodunu yazın.");

        int sbh = oku.nextInt();

        System.out.println("Lütfen öğle yemeğinde yemek istediğiniz yiyeceğin kodunu yazın.");

        int ogl = oku.nextInt();

        System.out.println("Lütfen akşam yemeğinde yemek istediğiniz yiyeceğin kodunu yazın.");

        int aks = oku.nextInt();

        basketbol.listeGetir(basketbol, yuzme, kosu);

        System.out.println("Lütfen sabah yapmak istediğiniz sporun kodunu girin.");

        int sprsbh = oku.nextInt();

        System.out.println("Bu sporu kaç saat yapmak istediğinizi yazın.");

        double saatsbh = oku.nextInt();

        System.out.println("Lütfen öğleden sonra yapmak istediğiniz sporun kodunu girin.");

        int sprogl = oku.nextInt();

        System.out.println("Bu sporu kaç saat yapmak istediğinizi yazın.");

        double saatogl = oku.nextInt();

        System.out.println("Lütfen akşam yapmak istediğiniz sporun kodunu girin.");

        int spraks = oku.nextInt();

        System.out.println("Bu sporu kaç saat yapmak istediğinizi yazın.");

        double saataks = oku.nextInt();

        double ypara = patates.ucretHesapla(sbh, ogl, aks, patates, tost, salata, tavuk, pilav, kofte);
        double gelenkalori = patates.kaloriHesapla(sbh, ogl, aks, patates, tost, salata, tavuk, pilav, kofte);
        double spara = basketbol.ucretHesapla(sprsbh, saatsbh, sprogl, saatogl, spraks, saataks, basketbol, yuzme, kosu);
        double gidenkalori = basketbol.kaloriHesapla(sprsbh, saatsbh, sprogl, saatogl, spraks, saataks, basketbol, yuzme, kosu);

        System.out.println("--------------------------------------------------------------");

        System.out.printf("Toplam harcamanız..: " + (ypara + spara) + " TL\n"
                + "Yakılan yağ..: " + (gidenkalori - gelenkalori) + " cal" + " ( %,.3f kg )\n", ((gidenkalori - gelenkalori) / 7400.0));

    }

}
