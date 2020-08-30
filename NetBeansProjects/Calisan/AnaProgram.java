package calisan;

public class AnaProgram {
    
    public static void main(String[] args) {
        
//      BilgisayarMuhendisi bm = new BilgisayarMuhendisi();
//      MakineMuhendisi mm = new MakineMuhendisi();
//      
//      bm.iseBasla();
//      mm.iseBasla();


         WebUzmani wu = new WebUzmani();
         wu.iseBasla();
         
         wu.setMaas(125);
         
         System.out.println(wu.maasHesapla());
         
         BilgisayarMuhendisi bm = new BilgisayarMuhendisi();
         
         
         Calisan c = new WebUzmani();
         Calisan c2 = new BilgisayarMuhendisi();
         
         BilgisayarMuhendisi bm2 = (BilgisayarMuhendisi)c2;
         
         
    }
    
}
