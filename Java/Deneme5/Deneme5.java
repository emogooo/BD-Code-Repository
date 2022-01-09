package deneme5;

public class Deneme5 {

    public static void main(String[] args) {
        
        System.out.println(2^18);
        A a1 = new A(5);
        A a2 = new A(6);
        a1.sonraki=a2;
        A gecici=a1;
        System.out.println(a1.sonraki.veri);
        gecici.sonraki=null;
        System.out.println(a1.sonraki.veri);
    }
    
}
class A{
    int veri;
    A sonraki;
    public A(int veri){
        this.veri=veri;
    }

}