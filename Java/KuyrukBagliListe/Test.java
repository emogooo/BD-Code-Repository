
class Dugum {

    int veri;
    Dugum sonraki;

    public Dugum(int veri) {
        this.veri = veri;
        sonraki = null;
    }
}

class Kuyruk {

    Dugum head;
    Dugum tail;

    public void push(int veri) {
        Dugum yeniEleman = new Dugum(veri);
        if (head == null) {
            head = yeniEleman;
            tail = yeniEleman;
            return;
        }

        tail.sonraki = yeniEleman;
        tail = yeniEleman;
    }

    public void pop() {

        if (head == null) {
            System.out.println("Dizi boş!");
            return;
        }

        head = head.sonraki;

        if (head == null) {
            tail = null;
        }

        return;
    }

    public void Temizle() {
        head = null;
        tail = null;
    }

    public void Yazdir() {
        Dugum gecici = head;
        while (gecici != null) {
            System.out.print(gecici.veri + " ");
            gecici = gecici.sonraki;
        }
    }

}

public class Test {

    public static void main(String[] args) {
        Kuyruk k = new Kuyruk();
        for (int i = 0; i < 5; i++) {
            k.push(i);
        }

        k.Yazdir();

        k.pop();
        k.pop();
        k.pop();
        k.pop();
        k.pop();
        k.Yazdir();
        k.pop();
        k.pop();
        k.pop();
        k.Yazdir();

    }
}
