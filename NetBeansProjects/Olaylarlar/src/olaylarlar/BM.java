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
public class BM implements Dinleyiciler{

    public BM() {
        
    }
    
    @Override
    public void haberVer(Event e) {
        if(e.kimlerdensin.equalsIgnoreCase("Valilik")){
            System.out.println("valla valilikten haber geldiyse elektrikler gidecek.., Kesinti miktarı "+
                    e.zamMiktari);
        }else{
        
        System.out.println("Gözün aydın zam geldi... şimdi Ne yapayım " + 
                e.zamMiktari + " Kimlerdensin: " + e.kimlerdensin);
        }
    }
    
}
  