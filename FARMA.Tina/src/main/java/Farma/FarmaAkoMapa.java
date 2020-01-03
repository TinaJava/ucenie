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

    public Map<String, Zviera> zvierata;

    public FarmaAkoMapa() {
        this.zvierata = new HashMap<>();
    }
//    public void pridajZviera(Zviera zviera) {//metoda ktora prida zviera
//        System.out.println(".............Prida zviera do Mapy.................");

    public void vypisZvierat() {

        // preco sa v metode na pridanie zvierata snazis robit vypis zvierat? ved na to ma sluzit metoda vypisZvierat(), kt si tu este nevytvorila
//        for (Map.Entry<String, Zviera> zviera : zvierata.entrySet()) {
//            if(zvierata.size()==0){
                System.out.println("pocet zvierat v mape " + zvierata.size());
            }
//            System.out.println(zviera.getKey());//vypis kluca
//            System.out.println(zviera.getValue());//vypis hodnoty 
        }
    

