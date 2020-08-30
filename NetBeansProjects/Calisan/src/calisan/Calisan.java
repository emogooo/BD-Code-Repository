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
public class Calisan {
    
    String isim;
    double id;
    protected double maas;
    int uzmanlik;
    int yas;
    
    public Calisan(){
        System.out.println("Calisan nesnesi olusturuldu");
    }
    
    public void iseBasla(){
        System.out.println("aaaaaaaaaaaaa");
    }

    public double maasHesapla(){
        return 0;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
   
}
