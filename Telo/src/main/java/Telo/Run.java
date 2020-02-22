/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vlada
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("................................................");
        System.out.println("vypis ruka");
        Ruka ruka;
        ruka = new Ruka(10, false, "nazov", "farba", "pohyb");
        ruka.setRukavica(true);
        ruka.setPocetPrstov(5);
        System.out.println(ruka);
        System.out.println("................................................");
        System.out.println("vypis noha");
        Noha noha;
        noha = new Noha(10, false, true, 43, "nazov", "farba", "pohyb");
        System.out.println(noha);
        System.out.println(".................................................");
        System.out.println("vypis pola koncatin : RUKA a NOHA");
        Koncatiny[] poleKoncatin;
        poleKoncatin = new Koncatiny[2];
        poleKoncatin[0] = new Ruka(10, false, "moja ruka", "opalena", "PODAJ_PERO");
        poleKoncatin[1] = new Noha(10, true, false, 40.5, "moja noha", "opalena", "VYSTRI_NOHU");

        for (Koncatiny udy : poleKoncatin) {
            System.out.println(udy);

        }
        System.out.println(".................................................");
        System.out.println("vypis Listu koncatin - Ruka + Noha ");
        List<Koncatiny> ListKoncatin;
        ListKoncatin = new ArrayList<>();
        ListKoncatin.add(new Noha(10, true, false, 40.5, "moja noha", "opalena", "VYSTRI_NOHU"));
        ListKoncatin.add(new Ruka(10, false, "moja ruka", "opalena", "PODAJ_PERO"));

        for (Koncatiny udy1 : ListKoncatin) {
            System.out.println(udy1);
        }
        System.out.println(".................................................");
        System.out.println("Vypis Mapy a  casti tela : ruky a nohy");
        Map<String, Koncatiny> castiTela;
        castiTela = new HashMap<>();
        castiTela.put("1", new Noha(5, false, true, 41, "Noha Ciganky", "Hnedej farby", "Vystri nohu"));
        castiTela.put("2", new Ruka(5, false, "ruka dietata", "ruka zranena", "ohni ruku"));

        for (Map.Entry<String, Koncatiny> udy3 : castiTela.entrySet()) {
            System.out.println(udy3.getKey() + " - " + udy3.getValue());
        }

    }
}

//        int pocetPrstov = 10;
//
//        } else if (pocetPrstov < 3) {
//       
//        return 5;
//        } else {
//        }
//        return pocetPrstov;
//        for (Ruka ruka : pocetPrstov) {
//            if (pocetPrstov > 15) {
//                return pocetPrstov;

