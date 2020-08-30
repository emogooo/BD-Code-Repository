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
public class Mudur {
    ArrayList<Dinleyiciler> dinleyiciListesi = new ArrayList();
    void dinleyiciEkle(Dinleyiciler d){
        dinleyiciListesi.add(d);
    }
    
    void zamYaptim(){
        Event e = new Event(1000,"Mudurgillerdenim");
        for(Dinleyiciler dd:dinleyiciListesi){
            dd.haberVer(e);
        }
        
    }
}
