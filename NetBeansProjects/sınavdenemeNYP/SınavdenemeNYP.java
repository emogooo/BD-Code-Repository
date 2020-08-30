package sınavdenemenyp;

public class SınavdenemeNYP {

    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci(1250);
        Ogrenci ogrenci2 = new Ogrenci(2500, "lisansüstü");

        ogrenci1.setIsim("Aliye");
        if ( !ogrenci1.getIsim().equals("Aliye")) {
            if (ogrenci2.no == 2500) {
                System.out.println("Olur olur");
            } else {
                System.out.println("Olmaz olmaz");
            }
        } else {
            System.out.println("Tekrar dene istersen");
        }

    }

}
