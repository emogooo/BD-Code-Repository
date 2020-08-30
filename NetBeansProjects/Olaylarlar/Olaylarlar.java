/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olaylarlar;

/**
 *
 * @author User
 */
public class Olaylarlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Mudur mudur = new Mudur();
        Valilik valilik = new Valilik();
        
        BM bm = new BM();
        Muhasebeci muhasebeci = new Muhasebeci();
        
        mudur.dinleyiciEkle(bm);
        mudur.dinleyiciEkle(muhasebeci);
        // mudur buton olsun
        mudur.dinleyiciEkle(new Dinleyiciler(){
            @Override
            public void haberVer(Event e) {
                //
                mudurButonu_Click(e);
            }
            
        });
          
        valilik.dinleyiciEkle(bm);
        
        mudur.zamYaptim();
        valilik.ElektrikKesintisiVar();
    }
    
    static void  mudurButonu_Click(Event e){
        System.out.println("Ben nesnensi bilinmeyen bir kardeşinizim, Zam miktarı: " +
                e.zamMiktari);
    }
    
}
