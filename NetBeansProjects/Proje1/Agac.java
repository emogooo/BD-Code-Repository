package babageridondu;

import java.util.Stack;

public class Agac {

    Urun kok;

    public void urunEkle(Urun u) {

        if (kok == null) {
            kokEkle(u);
            return;
        }
        Urun gecici = kok;
        Urun gecici2 = null;

        while (gecici != null) {

            gecici2 = gecici;
            if (u.fiyat < gecici.fiyat) {
                gecici = gecici.sol;
            } else {
                gecici = gecici.sag;
            }
        }

        if (u.fiyat < gecici2.fiyat) {
            gecici2.sol = u;
        } else {
            gecici2.sag = u;
        }
    }

    private void kokEkle(Urun u) {
        kok = u;
    }

    public void preOrder() {
        if (kok == null) {
            return;
        }
        Stack<Urun> s = new Stack();
        Urun gecici = kok;
        s.push(gecici);
        while (!s.isEmpty()) {
            gecici = s.pop();
            System.out.println(gecici);

            if (gecici.sag != null) {
                s.push(gecici.sag);
            }
            if (gecici.sol != null) {
                s.push(gecici.sol);
            }
        }
    }

    public void inOrder() {
        if (kok == null) {
            return;
        }

        Stack<Urun> s = new Stack();
        Urun gecici = kok;
        while (gecici != null || s.size() > 0) {
            while (gecici != null) {
                s.push(gecici);
                gecici=gecici.sol;
            }
            
            gecici=s.pop();
            System.out.println(gecici);
            gecici=gecici.sag;
        }
    }
    
    public void postOrder(){
        if (kok==null) {
            return;
        }
        
        Stack<Urun> s1 = new Stack();
        Stack<Urun> s2 = new Stack();
        Urun gecici=kok;
        s1.push(gecici);
        while (!s1.isEmpty()) {            
            gecici=s1.pop();
            s2.push(gecici);
            
            if (gecici.sol!=null) {
                s1.push(gecici.sol);
            }
            if (gecici.sag!=null) {
                s1.push(gecici.sag);
            }
        }
        
        while (!s2.isEmpty()) {            
            gecici=s2.pop();
            System.out.println(gecici);
        }
    }

}
