package bilimsel.ve.bakkal.hesap.makinesi;

import java.util.Scanner;

public class BilimselVeBakkalHesapMakinesi {

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);

        for (;;) {

            System.out.println("4 İşlem Hesap Makinesi için 4'ü; Bilimsel Hesap Makinesi için 1'i tuşlayın.");

            int giris = al.nextInt();

            if (giris == 4) {

                for (;;) {

                    System.out.println("Lütfen ilk sayıyı girin.");

                    double a = al.nextDouble();

                    System.out.println("Lütfen operatörü girin."
                            + "\n Toplama işlemi için .... +"
                            + "\n Çıkarma işlemi için .... -"
                            + "\n Çarpma işlemi için .... *"
                            + "\n Bölme işlemi için .... /");

                    String op = al.next();

                    System.out.println("Lütfen ikinci sayıyı girin.");

                    double b = al.nextDouble();

                    if (op.equals("+")) {
                        System.out.println(a + " + " + b + " = " + (a + b));
                    }
                    if (op.equals("-")) {
                        System.out.println(a + " - " + b + " = " + (a - b));
                    }
                    if (op.equals("*")) {
                        System.out.println(a + " * " + b + " = " + (a * b));
                    }
                    if (op.equals("/")) {
                        System.out.println(a + " / " + b + " = " + (a / b));
                    }

                    System.out.println("Üst menüye dönmek için .... 1"
                            + "\n Devam etmek için .... 2"
                            + "\n Tamamen çıkmak için .... 0 tuşlayın.");

                    int kl = al.nextInt();

                    if (kl == 1) {

                        break;

                    }
                    if (kl == 0) {

                        return;

                    }

                }

            } else if (giris == 1) {

                for (;;) {

                    System.out.println("Lütfen hangi işlemi yapmak istediğinizi belirtmek için gereken terimi girin."
                            + "\n Sinüs için ... sin"
                            + "\n Cosinüs için ... cos"
                            + "\n Tanjant için ... tan"
                            + "\n Cotanjant için ... cot"
                            + "\n 10 tabanında logaritma için .... log");

                    String op = al.next();
                    
                    System.out.println("Lütfen sayıyı girin.");

                    double a = al.nextDouble();
                    double b = Math.toRadians(a);

                    switch (op) {

                        case "sin": {
                            System.out.println("sin(" + a + ") = " + Math.sin(b));
                            break;
                        }
                        case "cos": {
                            System.out.println("cos(" + a + ") = " + Math.cos(b));
                            break;
                        }
                        case "tan": {
                            System.out.println("tan(" + a + ") = " + Math.tan(b));
                            break;
                        }
                        case "cot": {
                            System.out.println("cot(" + a + ") = " + (1 / (Math.tan(b))));
                            break;
                        }
                        case "log": {
                            System.out.println("log(" + a + ") = " + Math.log10(a));
                            break;
                        }

                    }

                    System.out.println("Üst menüye dönmek için .... 1"
                            + "\n Devam etmek için .... 2"
                            + "\n Tamamen çıkmak için .... 0 tuşlayın.");

                    int kl = al.nextInt();

                    if (kl == 1) {

                        break;

                    }
                    if (kl == 0) {

                        return;

                    }

                }
            } else {
                System.out.println("Lütfen belirtilen değerlerden birini giriniz.");
            }

        }
    }

}
