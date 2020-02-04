/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CerstveJedlo;

import Ovocie.Ananas;
import Ovocie.Banany;
import Ovocie.Citrony;
import Ovocie.Jahody;
import Ovocie.Pomarance;
import Zelenina.Brokolica;
import Zelenina.Kapusta;
import Zelenina.Mrkva;
import Zelenina.Petrzlen;
import Zelenina.Uhorka;

/**
 *
 * @author vlada
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(".............Vypis OVOCIA a ZELENINY.............");
        Ananas ananas;
        ananas = new Ananas(Farba.ZLTA,"Ananas", 350.5, 2, true, true, false);
        System.out.println(ananas);

        Citrony citrony;
        citrony = new Citrony(Farba.ZLTA,"Citrony", 52.2, 1, false, true, true);
        System.out.println(citrony);

        Jahody jahody;
        jahody = new Jahody(Farba.CERVENA,"Jahody", 1.5, 3,true,false,false);
        System.out.println(jahody);

        Pomarance pomarance;
        pomarance = new Pomarance(Farba.ORANZOVA,"Pomarance", 2.2,2,false,true,true);
        System.out.println(pomarance);

        Banany banany;
        banany = new Banany(Farba.ZLTA,"Banany", 1.2, 2,true,true,false);
        System.out.println(banany);

        Brokolica brokolica;
        brokolica = new Brokolica(Farba.ZELENA,"Brokolica", 0.5, 1,false,false,false);
        System.out.println(brokolica);

        Kapusta kapusta;
        kapusta = new Kapusta(Farba.ZELENA,"Kapusta hlavkova", 1.5, 1,false,false,false);
        System.out.println(kapusta);

        Mrkva mrkva;
        mrkva = new Mrkva(Farba.ORANZOVA,true,"Mrkva prana", 1.5, 1,true,true,false);
        System.out.println(mrkva);

        Petrzlen petrzlen;
        petrzlen = new Petrzlen(Farba.BIELA,true,"Petrzlen", 1.5, 1,false,true,false);
        System.out.println(petrzlen);

        Uhorka uhorka;
        uhorka = new Uhorka(Farba.ZELENA,"Uhorka salatova", 0.7, 1,false,true,false,true);
        System.out.println(uhorka);
       
        
//      pole ovocia
        Ovocie_Zelenina[] ovocie;
        ovocie = new Ovocie_Zelenina[5];
        ovocie[0] = new Ananas(Farba.ZLTA,"Ananas", 350.5, 2, true, true, false);
        ovocie[1] = new Banany(Farba.ZLTA,"Banany", 1.2, 2,true,true,false);
        ovocie[2] = new Citrony(Farba.ZELENA,"Citrony", 52.2, 1, false, true, true);
        ovocie[3] = new Jahody(Farba.BIELA,"Jahody", 1.5, 3,true,false,false);
        ovocie[4] = new Pomarance(Farba.ORANZOVA,"Pomarance", 2.2, 2,false,true,true);
       
        System.out.println("............. L E N    O V O C I E..............");
//      vypis len ovocia     
        for (Ovocie_Zelenina frucht : ovocie) {
            System.out.println(frucht);
        }
//      pole zeleniny
        Ovocie_Zelenina[] zelenina;
        zelenina = new Ovocie_Zelenina[5];
        zelenina[0] = new Brokolica(Farba.ZELENA,"Brokolica", 0.5, 1,false,false,false);
        zelenina[1] = new Kapusta(Farba.ZELENA,"Kapusta hlavkova", 1.5, 1,false,false,false);
        zelenina[2] = new Mrkva(Farba.ORANZOVA,true,"Mrkva prana", 1.5, 1,true,true,false);
        zelenina[3] = new Petrzlen(Farba.BIELA,true,"Petrzlen", 1.5, 1,false,true,false);
        zelenina[4] = new Uhorka(Farba.ZELENA,"Uhorka salatova", 0.7, 1,false,true,false,true);

        System.out.println(".............L E N   Z E L E N I N A ...............");
//      vypis len zeleniny
        for (Ovocie_Zelenina zel : zelenina) {
            System.out.println(zel);
        }
    }
}
