package dizistack;

public class DiziStack {

    public static void main(String[] args) {
        
        Stack s = new Stack(5);
        s.push(5);
        s.push(6);
        s.push(1);
        s.pop();
        s.isEmpty();
        s.yazdir();
        
    }
    
}
class Stack{
    
    int dizi[];
    int boyut;
    static int elemanSayisi;
    
    public Stack(int boyut){
        
        this.boyut=boyut;
        dizi=new int[boyut];
        elemanSayisi=0;
        for (int i = 0; i < dizi.length; i++) {
            
            dizi[i]=Integer.MIN_VALUE;
        }
    }
    
    void push(int a){
        
        if (elemanSayisi==boyut) {
            System.out.println("Eleman eklenemez, yığın dolu.");
            return;
        }
        
        int sayac=0;
        elemanSayisi++;
        for (int i = 0; i <dizi.length; i++) {
            if (dizi[i]!=Integer.MIN_VALUE) {
               sayac++; 
            }
        }
        while (sayac!=0) {            
            dizi[sayac]=dizi[sayac-1];
            sayac--;
        }
        
        dizi[0]=a;
        
    }
    void yazdir(){
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(dizi[i]);
        }
    }
    void pop(){
        for (int i = 0; i < elemanSayisi; i++) {
            dizi[i]=dizi[i+1];
        }
        elemanSayisi--;
    }
    void top(){
        System.out.println(dizi[0]);
    }
    void isEmpty(){
        if (elemanSayisi==0) {
            System.out.println("Dizi boş");
            return;
        }
        System.out.println("Dizi dolu");
    }
}