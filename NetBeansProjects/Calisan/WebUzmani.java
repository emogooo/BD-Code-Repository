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
public class WebUzmani extends BilgisayarMuhendisi {
    
    String webuzmanlik;
    
    public WebUzmani(){
        System.out.println("web uzmanı nesnesi oluşturuld..");
    } 

    @Override
    public void iseBasla() {
       super.iseBasla();
       
        System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()*2;
    }
   
   
}
