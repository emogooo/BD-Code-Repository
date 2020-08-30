package hash;

public class Hash {

    static int[] dizi = new int[100];

    void ekle(int a) {
        int b = a % 100;
        dizi[b] = a;
    }

    int bul(int a) {

        int b = a % 100;
        return dizi[b]; 
    }

    public static void main(String[] args) {

        Hash h = new Hash();
        h.ekle(15);
        h.ekle(19);
        h.ekle(82);
        h.ekle(71);
        h.ekle(65);
        
        System.out.println(h.bul(19));

    }

}
