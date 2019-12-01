/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produkcia;

import Zvierata.Hus;
import Zvierata.Koza;
import Zvierata.Krava;
import Zvierata.Prasa;
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
        koza = new Koza(true, true, false, "koza horska", 180.5, 102, true, true);//naplnenie konstruktora pre Koza
        System.out.println(koza);

        Zviera krava;
        krava = new Krava("Malina", 550.5, 158, true, true, true, true, true, true);
        System.out.println(krava);

        Zviera hus;
        hus = new Hus("Hus biela", 12.5, 32, true, false, true, true, true);
        System.out.println(hus);

        Zviera prasa;
        prasa = new Prasa("Mangalica", 220.55, 104, true, true, true, true, true);
        System.out.println(prasa);
    }

}
