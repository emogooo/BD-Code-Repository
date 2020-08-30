package superkullanimi;

public class SuperKullanimi {

    public static void main(String[] args) {

        B b = new B(1,2);
        System.out.println(b.x+" "+b.y);
    }

}

class A {

    int x;
    int y;

    public A(int x,int y) {
        this.x = x;
        this.y=y;
    }
}

class B extends A {

    public B(int x,int y){
        super(x,y);
    }
}
