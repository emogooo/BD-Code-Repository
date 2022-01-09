package garnizon;

public class Garnizon {

    static void hazirOl(Asker a) {
        a.tekmilVer();
    }

    public static void main(String[] args) {

        Kurmay s1 = new Kurmay("Dilaver", "Tokat", "Yüzbaşı", 65);
        hazirOl(s1);
        System.out.println(s1.rutbe);
        Astsubay a1 = new Astsubay("Emirhan", "Samsun", "Kd.Bşçv.", 25);
        hazirOl(a1);
        s1.pasaOl();

        System.out.println(s1.rutbe);
        s1.pasaliktanDus();
        System.out.println(s1.rutbe);
        s1.kos();
        a1.kos();
        a1.yuz();
        s1.yuz();
        
        System.out.println(s1);
       
        
        s1.piyadeOl();
        System.out.println(s1);
        
        s1.kidemAtla();
        System.out.println(s1);
        s1.kidemAtla();
        System.out.println(s1);
        s1.kidemAtla();
        System.out.println(s1);
        s1.kidemAtla();
        System.out.println(s1);
        Kurmay s2 = new Kurmay("Muhammed", "Ankara", "Albay", 500);
        hazirOl(s2);
        s2.kos();
        s2.pasaOl();
        s2.keskinNisanciOl();
        System.out.println(s2);
        s2.kidemAtla();
        s2.kidemAtla();
        s2.kidemAtla();
        s2.kidemAtla();
        s2.kidemAtla();
        s2.kidemAtla();
        System.out.println(s2);

    }

}
