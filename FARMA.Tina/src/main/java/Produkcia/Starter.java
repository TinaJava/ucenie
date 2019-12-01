/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produkcia;

import Zvierata.Koza;
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

        Zviera koza;
        koza = new Koza(
                "Koza Horska", 180.5, 102, true, true,
                true, true, true
        );//naplnenie konstruktora pre Koza
        koza.setHmotnost(110);
        System.out.println(koza);

    }

}
