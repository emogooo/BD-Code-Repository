/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractsinif;

/**
 *
 * @author EMOGO
 */
public class Doktor extends Calisan implements ameliyatYapabilir{
    public Doktor(String isim){
         super(isim);
     }

    @Override
    public void ameliyatYap() throws ArithmeticException{
        System.out.println("pens lütfen..");
        System.out.println("defibrilatör lütfen..");
        System.out.println("tampon lütfen..");
        System.out.println("kleps lütfen..");
        
        try {
            System.out.println(1/0);
        } catch (Exception e) {
        }

        System.out.println("selam");
    
    }
    
}
