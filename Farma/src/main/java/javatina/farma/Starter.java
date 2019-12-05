/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.farma;

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

    }

}
