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
public class MakineMuhendisi extends Calisan{
    String bildigiMakine;
    int mühendislikYili;
    
    public MakineMuhendisi(){
        System.out.println("Makine Mühendisi nesnesi oluşturuldu...");
    }

    @Override
    public void iseBasla() {
        System.out.println("makinemakinemakinemakine");
    }

    @Override
    public double maasHesapla() {
        return maas*2;
    }
    
    
}
