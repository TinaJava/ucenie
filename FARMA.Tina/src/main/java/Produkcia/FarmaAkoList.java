/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produkcia;

import Zvierata.Zviera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vlada
 */
public class FarmaAkoList {

    private List<Zviera> zvierata;

    public FarmaAkoList() {  // konstruktor som chcel bez parametrov
        this.zvierata = new ArrayList<>();// tuto nieco bude zacinajuce na new ...;
    }

    /**
     * Metoda vypise zoznam zvierat na farme
     */
    public void vypisZvierat() {
        // tu sprav vypis zvierat z listu "zvierata" (pomocou for a sout)
//        System.out.println("..................vypis zvierat,ich pocet je.................. " + zvierata.size());
        System.out.println("vypis zvierat");
        if (zvierata.size() == 0) {//toto sa spusti ak je na farme pocet zvierat 0 cize niesu ziadne
            System.out.println("na farme niesu ziadne zvierata");
        } else {//toto sa spusti ak sunna farme nejake zvierata a ich pocet je viac ako 0
            System.out.println("pocet zvierat je..........."+ zvierata.size());
            for (Zviera vypis : zvierata) {
                System.out.println(vypis);
            }
        }
    }

    /**
     * Metoda prida do zoznamu zvierat na farme dalsie zviera
     *
     * @param zviera - zviera, kt. sa ma pridat
     */
    public void pridajZviera(Zviera zviera) {

        zvierata.add(zviera); // tu urob pridanie zviarata zo vstupneho parametra do listu "zvierata"
        System.out.println("bolo pridane new zviera,aktualny pocet zvierat na farme je" + zvierata.size());
        
    }

}
