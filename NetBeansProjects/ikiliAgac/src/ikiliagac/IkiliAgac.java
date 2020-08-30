package ikiliagac;

public class IkiliAgac {

    Dal kok =null;
           
    void ekle(int veri){
        if (kok==null) {
            kok=new Dal(veri);
            return;
        }
        Dal gecici=kok;
        if (veri>gecici.veri) {
            gecici.sag.veri=veri;
        }
        else{
            gecici.sol.veri=veri;
        }
   
    }
    
    public static void main(String[] args) {
        
        IkiliAgac agac = new IkiliAgac();
        agac.ekle(1);
        agac.ekle(2);
        agac.ekle(3);
        
    }
    
}
class Dal{
    
    Dal sag;
    Dal sol;
    int veri;
    public Dal(int veri){
        this.veri=veri;
    }
}
