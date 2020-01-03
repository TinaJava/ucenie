/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farma;

import Zvierata.Hus;
import Zvierata.Prasa;
import Zvierata.Sliepka;
import Zvierata.Zviera;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author vlada
 */
public class FarmaAkoMapa {

    Map<String, Zviera> zvierata2;  // preco si to nazvala "zvierata2", preco nie opat "zvierata"?  preco si nedefinovala, ci je tato vlastnost private akebo public?

    public FarmaAkoMapa() {
        this.zvierata2 = new HashMap<>();
    }
//pridanie zvierat do hashmapy s key typu string ako kluc a s value nazov Zvierata.

    public void pridajZviera(Zviera zviera) {//metoda ktora prida zviera
        System.out.println(".............Prida zviera do Mapy.................");
        
        // preco tu pridavas natvrdo nejake zvierata, ved ich budeme pridavat cez starter?
        zvierata2.put("01", new Sliepka(true, true, true, "Sliepka Anicka len na vajicka ", 3.5, 20, true));
        zvierata2.put("02", new Prasa("Parasa spinave z chlieva", 220.55, 104, true, true, true, true, true));
        zvierata2.put("03", new Hus("Hus domaca ", 12.5, 32, true, false, true, true));

        Zviera Sliepka = null;
        zvierata2.put("01", Sliepka);
        Zviera Prasa = null;
        zvierata2.put("02", Prasa);
        Zviera Hus = null;
        zvierata2.put("03", Hus);
    
        // preco sa v metode na pridanie zvierata snazis robit vypis zvierat? ved na to ma sluzit metoda vypisZvierat(), kt si tu este nevytvorila
        for (Map.Entry<String, Zviera> zviera : zvierata2.entrySet()) {//cyklus pre hashMapu mi nejako nefunguje???
           
            System.out.println(zviera.getKey());//vypis kluca
            System.out.println(zviera.getValue());//vypis hodnoty 
        }
    }
}


