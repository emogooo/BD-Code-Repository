/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisan;

/**
 *
 * @author User
 */
public class BilgisayarMuhendisi extends Calisan{
    
    String uzmanolduguProg;
    public BilgisayarMuhendisi() {
        
        System.out.println("Bilgisayar Mühendisliği nesnesi oluşturuldu");
    }

    @Override
    public void iseBasla() {
      super.iseBasla(); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("ııııııııııııııııııııııııııııı");
    
    }

    @Override
    public double maasHesapla() {
        return maas*5;
    }
    
    public void formatAt(){
        
    }
}
