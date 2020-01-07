/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farma;

import Zvierata.Zviera;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vlada
 */
public class FarmaAkoMapa {

    public Map<String, Zviera> zvierata;   // preco je tato vlastnost public? ved sme vraveli, ze vlastnosti uz budu private vzdy

    public FarmaAkoMapa() {
        this.zvierata = new HashMap<>();
    }

    public void vypisZvierat() {
        System.out.println("vypis zvierat");
        if (zvierata.size() == 0) {//toto sa spusti ak je na farme pocet zvierat 0 cize niesu ziadne
            System.out.println("na farme niesu ziadne zvierata");
        } else {//toto sa spusti ak su na farme nejake zvierata a ich pocet je viac ako 0
            System.out.println("pocet zvierat je..........." + zvierata.size());
            for (Map.Entry<String, Zviera> zviera : zvierata.entrySet()) {
                System.out.println("Cislo zvierata: " + zviera.getKey() + " - " + "Zviera: " + zviera.getValue());
            }
        }
    }

//         preco sa v metode na pridanie zvierata snazis robit vypis zvierat? ved na to ma sluzit metoda vypisZvierat(), kt si tu este nevytvorila
    public void pridajZviera(Zviera zviera, String cislo) {
        zvierata.put(cislo, zviera);
        System.out.println("Bolo pridane nove zviera s cislom: " + cislo + ", aktualny pocet zvierat na farme je: " + zvierata.size());
    }
}
