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
public class Muhasebeci implements Dinleyiciler {

    @Override
    public void haberVer(Event e) {
        System.out.println(" iyi ki muhasebe okumuşum. iş yüküm arttı. zamlı maaşları hesapla" + 
                e.zamMiktari);
    }
    
}
