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
import Zvierata.Sliepka;
import Zvierata.Zviera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        hus = new Hus("Hus biela", 12.5, 32, true, false, true, true);
        System.out.println(hus);

        Zviera prasa;
        prasa = new Prasa("Mangalica", 220.55, 104, true, true, true, true, true);
        System.out.println(prasa);

//        String[] zvierata;  // preco si vyrabala pole stringov String[] a nie pole zvierat Zviera[]?
//        zvierata = new String[4];
//        zvierata[0] = "Koza";
//        zvierata[1] = "Krava";
//        zvierata[2] = "Prasa";
//        zvierata[3] = "Hus";
//
//        for (int i = 0; i < zvierata.length; i++) {
//            System.out.println(i + " ." + zvierata[i]);
//
//            String[] cicavci;
//            cicavci = new String[3];
//            cicavci[0] = "Krava";
//            cicavci[1] = "Koza";
//            cicavci[2] = "Prasa";
//
//            for (String savci : cicavci) {
//                System.out.println(savci);
//
//                List<String> Zviera1;
//                Zviera1 = new ArrayList<>();
//                Zviera1.addAll(Zviera1);
//
//                System.out.println(Zviera1.size());
//
//            } 
//
//        }
        // vytvorenie pola zvierat a jeho naplnenie
        Zviera[] zvierata;
        zvierata = new Zviera[5];
        zvierata[0] = new Koza(true, true, false, "Koza", 180.5, 102, true, true);
        zvierata[1] = new Krava("Krava", 550.5, 158, true, true, true, true, true, true);
        zvierata[2] = new Prasa("Parasa", 220.55, 104, true, true, true, true, true);
        zvierata[3] = new Hus("Hus", 12.5, 32, true, false, true, true);
        zvierata[4] = new Sliepka(true, true, true, "Sliepka", 3.5, 20, true);

        // vypis vsetkych zvierat
        System.out.println("-------------------------------------------------------");
        System.out.println("Vsetky zvierata:");
        for (Zviera zviera : zvierata) {
            System.out.println(zviera);
        }

        // vypis len cicavcov
        System.out.println("-------------------------------------------------------");
        System.out.println("Len cicavce:");
        for (Zviera zviera : zvierata) {
            if (zviera.isCicavec()) {  // podmienka na to, ci je zviera cicavec
                System.out.println(zviera);  // vypis zvierata, kt. je cicavec (tj splnilo if)
            }
        }

        List<Zviera> zvierata2;
        zvierata2 = new ArrayList<>();
        zvierata2.add(new Koza(true, true, false, "Koza biela rohata", 180.5, 102, true, true));
        zvierata2.add(new Krava("Krava flakata Malina", 550.5, 158, true, true, true, true, true, true));
        zvierata2.add(new Prasa("Parasa spinave z chlieva", 220.55, 104, true, true, true, true, true));
        zvierata2.add(new Hus("Hus domaca ", 12.5, 32, true, false, true, true));
        zvierata2.add(new Sliepka(true, true, true, "Sliepka Anicka len na vajicka ", 3.5, 20, true));

        System.out.println("-----------------------------------------------------");
        System.out.println(" L i s t  Z v i e r a t  : ");
        for (Zviera vypis : zvierata2) {
            System.out.println(vypis);
        }
        //mapa zvierat husí
        System.out.println(".................................................");
        System.out.println("vypis mapy zvierat");
        System.out.println(".................................................");

        Map<String, Zviera> zvierataMap;
        zvierataMap = new HashMap<>();
        zvierataMap.put("01", new Hus("Hus domaca ", 12.5, 32, true, false, true, true));
        zvierataMap.put("02", new Sliepka(true, true, true, "Sliepka Anicka len na vajicka ", 3.5, 20, true));
        zvierataMap.put("03", new Prasa("Parasa spinave z chlieva", 220.55, 104, true, true, true, true, true));
        zvierataMap.put("04", new Krava("Krava flakata Malina", 550.5, 158, true, true, true, true, true, true));
        zvierataMap.put("05", new Koza(true, true, false, "Koza", 180.5, 102, true, true));
        //vypis mapy
        for (Map.Entry<String, Zviera> zviera : zvierataMap.entrySet()) {
            System.out.println(zviera.getKey() + "-" + zviera.getValue());

            //vypis zoznamu zvierat z triedy Farma.java
            System.out.println("Zoznam zvierat");

            Farma Zoznam_zvierat;
            List<Farma> zoznam;
            zoznam = new ArrayList<>();
            zoznam.add(Zoznam_zvierat("krava, kon, liska, pes, macka, jahna"));

            for (Farma nazov : zoznam) {
                System.out.println(nazov);
            }
        }
    }

}

   