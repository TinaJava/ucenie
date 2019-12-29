/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produkcia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vlada
 */
<<<<<<< Updated upstream
public abstract class Farma {  // Preco je ta trieda abstract?
    protected String Zoznam_zvierat;   // Preco to mas ako String? Ved to ma byt zoznam tj List, Pole, Mapa
=======                     // a mala mat trieda  vlastnost ako zoznam zvierat a to sa neda dat inak ako string ak ju chchem definovat ako vlastnost

//lebo som myslela ze sa tam musi dopisat abstract ako mam aj inde v inych triedach aby to fungovalo. 


public abstract class Farma {
    private String Zoznam_zvierat;
>>>>>>> Stashed changes

    public Farma(String Zoznam_zvierat) {
        this.Zoznam_zvierat = Zoznam_zvierat;  // Preco si chces zoznam zvierat posielat z vonku? Ved trieda Farma bude ten zoznam zvierat udrzovat a riadit, nie nikto z vonku
    }//natoto ti nedam odpoved lebo ty si ma vydz ucil ze to co sa pise do tried je jedna vec a ostatne sa vpise do  startera. tak som nebola nikdy nutena celit takemuto niecomu a teda to ani nemam odkial vediet ako to funguje
    // a co je to to stashed changes< ja tomu nerozumiem. bud mi zavolaj a korektne mi to vzsvetli alebo sa na to vzprdnem. proste  neviem a nedokazem v takejto komunikaii ani pokracovat dalej
     public String pridajZoznam(){
         return (null);
            }
     Farma zoznam;
            List<Farma> zoznam;
            zoznam = new ArrayList<>();
            zoznam.add(Zoznam_zvierat("krava, kon, liska, pes, macka, jahna"));

            for (Farma nazov : zoznam) {
                System.out.println(nazov);
            }

    private static class zoznam {

        public zoznam() {
        }

        private static class add {

            public add() {
            }
        }
    }
}

