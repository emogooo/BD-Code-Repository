package kuyrukdizilerle;

class Kuyruk {

    int kuyrukDizisi[];
    int head = 0;
    int tail = 0;
    int boyut;
    int elemanSayisi = 0;

    public Kuyruk(int boyut) {
        this.boyut = boyut;
        kuyrukDizisi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            kuyrukDizisi[i] = Integer.MIN_VALUE;
        }
    }

    public void push(int veri) {
        if (elemanSayisi < boyut) {
            kuyrukDizisi[tail] = veri;
            tail++;
            if (tail == boyut) {
                tail = 0;
            }
            elemanSayisi++;
        } else {
            System.out.println("Kuyruk dolu," + veri + " eklenemiyor...");
        }
    }

    public void pop() {
        if (elemanSayisi > 0) {
            kuyrukDizisi[head] = Integer.MIN_VALUE;
            head++;
            elemanSayisi--;
        } else {
            System.out.println("Kuyruk boş!!!");
        }
    }

    public void Temizle() {
 
        for (int i = head; i < elemanSayisi; i++) {
            kuyrukDizisi[i]=Integer.MIN_VALUE;
        }
        elemanSayisi=0;
        head=0;
        tail=0;
    }

    public void Yazdir() {
        for (int i = 0; i < elemanSayisi; i++) {
                System.out.print("" + kuyrukDizisi[i] + " ");
        }
    }

}

public class KuyrukDizilerle {

    public static void main(String[] args) {
        Kuyruk k = new Kuyruk(8);
        k.push(1);
        k.push(2);
        k.push(3);
        k.push(4);
        k.push(5);
        k.push(6);
        k.push(7);
        k.push(8);   

        k.Temizle();
        k.Yazdir();

    }

}
