/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olaylarlar;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Valilik {
    
    ArrayList<Dinleyiciler> dinleyiciListesi = new ArrayList();
    void dinleyiciEkle(Dinleyiciler d){
        dinleyiciListesi.add(d);
    }
    
    void ElektrikKesintisiVar(){
        Event e = new Event(123,"Valilik");
        for(Dinleyiciler dd:dinleyiciListesi){
            dd.haberVer(e);
        }
        
    }
    
}
