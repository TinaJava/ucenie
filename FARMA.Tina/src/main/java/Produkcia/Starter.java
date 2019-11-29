/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produkcia;

import Zvierata.Zviera;

/**
 *
 * @author vlada
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Zviera");
        
        Zviera zviera1;       
        zviera1 = new Zviera(180,102,true,"Koza Horska",true);//naplnenie konstruktora pre Zviera  
        zviera1.setHmotnost(110);  
        
        System.out.println(zviera1);
      
    }
    
}
