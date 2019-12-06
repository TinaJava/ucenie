/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.farma;

import java.util.ArrayList;
import java.util.List;
import javatina.farma.zviera.Kivi;
import javatina.farma.zviera.Macka;
import javatina.farma.zviera.Pes;
import javatina.farma.zviera.Zviera;

/**
 *
 * @author Stevlik Marian
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Zviera kivi;
        kivi = new Kivi("Kivinecka", 5.2, 0.55, true, true, true);
        System.out.println(kivi);

        Zviera pes;
        pes = new Pes("Mortal", 1.10, 95.5, true, true, true);
        System.out.println(pes);

        Zviera macka;
        macka = new Macka("Luigi", 25.8, 4.5, true, true, true, false);
        System.out.println(macka);

        // vytvorenie pola zvierat a jeho naplnenie
        Zviera[] zvierata;
        zvierata = new Zviera[3];
        zvierata[0] = new Kivi("kiva", 5.2, 0.55, true, true, true);
        zvierata[1] = new Pes("Mort", 110.2, 95.5, true, true, true);
        zvierata[2] = new Macka("Luigi", 35.2, 7.2, true, true, true, false);

        for (Zviera zvieratko : zvierata) {
            System.out.println(zvieratko);

            //vytvorenie listu zvierat a jeho naplnenie
            List<Zviera> zvieratka;
            zvieratka = new ArrayList<>();
            zvieratka.add(new Kivi("skrecok", 5.2, 0.55, true, true, true));
            zvieratka.add(new Pes("velky strazny pes", 110.2, 105.5, true, true, true));
            zvieratka.add(new Macka("ciciak", 35.2, 6.8, true, true, true, true));

            System.out.println("....................................................");
            System.out.println("vypis domacich zvierat s ich vlastnostami");

            for (Zviera zver : zvieratka) {
                System.out.println(zver);

            }
        }
    }
}
