

class Dugum{
    int veri;
    Dugum sonraki;
    
    public Dugum(int veri){
        this.veri = veri;
    }
}


class Stack{
    Dugum top;
    
    public void push(int veri){
        Dugum yeni = new Dugum(veri);
        
        if(top==null){
            top = yeni;
            return;
        }
        yeni.sonraki = top;
        top = yeni;
    }
    
    
    public void pop(){
        
        if(top == null){
            return;
        }
        top = top.sonraki;
    }
    
    
    public void yazdir(){
        Dugum gecici = top;
        while (gecici!=null) {
            System.out.print(gecici.veri +" ");
            gecici = gecici.sonraki;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.yazdir();
        
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

        System.out.println("");
        s.yazdir();

    }
}
