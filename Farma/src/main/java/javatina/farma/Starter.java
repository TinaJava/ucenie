/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.farma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        // jednotlivci
        System.out.println("................................................");
        System.out.println("Zvierata ako jednotlivci");
        System.out.println("................................................");
        Zviera kivi;
        kivi = new Kivi("Kivinecka", 5.2, 0.55, true, true, true);
        System.out.println(kivi);
        Zviera pes;
        pes = new Pes("Mortal", 1.10, 95.5, true, true, true);
        System.out.println(pes);
        Zviera macka;
        macka = new Macka(true, true, "Luigi", 25.8, 4.5, true, true);
        System.out.println(macka);

        // pole zvierat
        System.out.println("................................................");
        System.out.println("Zvierata ako pole");
        System.out.println("................................................");
        Zviera[] zvierataPole;
        zvierataPole = new Zviera[3];
        zvierataPole[0] = new Kivi("kiva", 5.2, 0.55, true, true, true);
        zvierataPole[1] = new Pes("Mort", 110.2, 95.5, true, true, true);
        zvierataPole[2] = new Macka(true, true, "Luigi", 35.2, 7.2, true, false);
        // vypis
        for (Zviera zviera : zvierataPole) {
            System.out.println(zviera);
        }

        // list zvierat
        System.out.println("................................................");
        System.out.println("Zvierata ako list");
        System.out.println("................................................");
        List<Zviera> zvierataList;
        zvierataList = new ArrayList<>();
        zvierataList.add(new Kivi("skrecok", 5.5, 1.55, true, false, false));  // naschval tvrdime, ze Kivi-Skrecok nie je cicavec
        zvierataList.add(new Pes("velky strazny pes", 110.2, 105.5, true, true, true));
        zvierataList.add(new Macka(true, true, "ciciak", 35.2, 6.8, true, true));
        // vypis
        for (Zviera zviera : zvierataList) {
            System.out.println(zviera);
        }

        // pocet cicavcov
        int pocetCicavcov = 0;  // vytvorim premennu pocetCicavcov a priradim jej rovno 0
        for (Zviera zviera : zvierataList) {
            if (zviera.isCicavec()) {
                pocetCicavcov = pocetCicavcov + 1;  // ak je zviera cicavec, tak priratam 1
            }
        }
        System.out.println(".............................................");
        System.out.println("Pocet cicavcov: " + pocetCicavcov);  // za cyklomn vypisem pocet cicavcov
        System.out.println(".............................................");

        // list cicavcov
        List<Zviera> cicavceList;
        cicavceList = new ArrayList<>();
        // naplnenie cicavcov
        for (Zviera zviera : zvierataList) {
            if (zviera.isCicavec()) {
                cicavceList.add(zviera);
            }
        }
        // vypis cicavcov
        System.out.println(".................................................");
        System.out.println("Vypis cicavcov:");
        System.out.println(".................................................");
        for (Zviera cicavec : cicavceList) {
            System.out.println(cicavec);
        }

        // list necicavcov
        List<Zviera> necicavceList;
        necicavceList = new ArrayList<>();
        // naplnenie necicavcov
        for (Zviera zviera : zvierataList) {
            if (zviera.isCicavec() == false) {
                necicavceList.add(zviera);
            }
        }
        // !!! tu urob naplnenie listu necicavceList z listu zvierataList
        // vypis necicavcov
        System.out.println(".................................................");
        System.out.println("Vypis necicavcov:");
        System.out.println(".................................................");
        for (Zviera necicavec : necicavceList) {
            System.out.println(necicavec);
        }
        // !!! tu urob vypis naplneneho listu necicavceList
        // toto je zle        
//        //vypis necicavcov
//        System.out.println(".................................................");
//        System.out.println("necicavce");
//
//
//        List<Zviera> necicavceList;
//        necicavceList = new ArrayList<>();
//
//        int pocetNecicavcov = 0;
//                        pocetNecicavcov = pocetNecicavcov + 1;
//
//        for (Zviera necicavec : necicavceList) {
//            if (necicavec.isCicavec() == false) {
//                Zviera zviera = necicavec;
//                necicavceList.add(zviera);
//            }
//        }
//                necicavceList.add(new Pes("velky strazny pes", 110.2, 105.5, true, false, true));
//                necicavceList.add(new Macka(true,false, "ciciak", 35.2, 6.8, false, true));
//                necicavceList.add(new Kivi("kiva", 5.2, 0.55, false, false, false));
//                System.out.println(necicavceList);
//        boolean necicavec = false;
//                System.out.println(necicavec);
//                System.out.println("pocet necicavcov "+ pocetNecicavcov);
//                System.out.println(necicavceList);
        // mapa zvierat
        System.out.println("................................................");
        System.out.println("Zvierata ako mapa");
        System.out.println("................................................");
        Map<String, Zviera> zvierataMap;
        zvierataMap = new HashMap<>();
        zvierataMap.put("0001", new Kivi("skrecok", 5.5, 1.55, true, true, true));
        // vypis
        for (Map.Entry<String, Zviera> zviera : zvierataMap.entrySet()) {
            System.out.println(zviera.getKey() + " - " + zviera.getValue());
        }

    }
}
