package trycatch;

public class Trycatch {

    static void calis() throws Exception {

        throw new Exception("selmaın aleyküm arkadaşlar ben dj emirhan");
    }

    public static void main(String[] args) {

        try {
            calis();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
