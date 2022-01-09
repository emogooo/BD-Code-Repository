package saglikbakanligi;

public class SaglikBakanligi {

    public static void main(String[] args) {

        Hastane h1 = new Hastane("Tokat Devlet Hastanesi", 1000);
        Hastane h2 = new Hastane("Tokat Üniversite Hastanesi", 1500);

        h1.doktorEkle("Demirhan", 5500, "Pratistyen Hekim");
        h1.doktorEkle("Kemirhan", 8500, "Kardiyoloji");
        h1.hemsireEkle("Dilaver", 4500);
        h1.ebeEkle("Dudu", 4500);

        h1.ameliyatYap(h1.doktorlarDizisi.get(1), 70, true, 15);
        h1.ameliyatYap(h1.doktorlarDizisi.get(1), 48, false, 2);
        h1.ameliyatYap(h1.doktorlarDizisi.get(1), 22, false, 0);
        h1.ameliyatYap(h1.doktorlarDizisi.get(1), 37, true, 9);
        h1.ameliyatYap(h1.doktorlarDizisi.get(1), 55, true, 4);
        
    }

}
