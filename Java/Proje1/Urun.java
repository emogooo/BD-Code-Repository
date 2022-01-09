package babageridondu;

public class Urun {

    String isim;
    double fiyat;
    Urun sol;
    Urun sag;

    public Urun(String isim, double fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return isim + "-" + fiyat + "  ";
    }
}



//    public void inOrder() {
//
////        inOrderMetod(kok);
//        inOrderDongu();
//    }
//
//    private void inOrderMetod(Urun kok) {
//        if (kok == null) {
//            return;
//        }
//        inOrderMetod(kok.sol);
//        System.out.println(kok);
//        inOrderMetod(kok.sag);
//    }
//
//    private void inOrderDongu() {
//
//        if (kok == null) {
//            return;
//        }
//        Stack<Urun> s = new Stack();
//        Urun gecici = kok;
//
//        while (gecici != null || s.size() > 0) {
//
//            while (gecici != null) {
//
//                s.push(gecici);
//                gecici = gecici.sol;
//            }
//            gecici = s.pop();
//            System.out.println(gecici);
//            gecici = gecici.sag;
//        }
//
//    }
//
//    public void preOrder() {
////        preOrderDongu();
//        preOrderMetod(kok);
//    }
//
//    private void preOrderDongu() {
//        if (kok == null) {
//            return;
//        }
//        Urun gecici = kok;
//        Stack<Urun> s = new Stack();
//        s.push(gecici);
//        while (s.empty() == false) {
//            gecici = s.pop();
//            System.out.println(gecici);
//
//            if (gecici.sag != null) {
//                s.push(gecici.sag);
//            }
//            if (gecici.sol != null) {
//                s.push(gecici.sol);
//
//            }
//        }
//    }
//
//    private void preOrderMetod(Urun kok) {
//        if (kok == null) {
//            return;
//        }
//        System.out.println(kok);
//        preOrderMetod(kok.sol);
//        preOrderMetod(kok.sag);
//    }
//
//    public void postOrderDongu() {
//        if (kok==null) {
//            return;
//        }
//        Urun gecici=kok;
//        Stack<Urun> s1 = new Stack();
//        Stack<Urun> s2 = new Stack();
//        s1.push(gecici);
//        
//        while (s1.isEmpty()==false) {            
//            gecici=s1.pop();
//            s2.push(gecici);
//            if (gecici.sol!=null) {
//                s1.push(gecici.sol);
//            }
//            if (gecici.sag!=null) {
//                s1.push(gecici.sag);
//            }
//        }
//        while (s2.isEmpty()==false) {            
//            gecici=s2.pop();
//            System.out.println(gecici);
//        }
//    }