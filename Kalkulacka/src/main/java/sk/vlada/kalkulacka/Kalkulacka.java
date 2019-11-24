/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.vlada.kalkulacka;

/**
 *
 * @author Vladimira
 */
public class Kalkulacka {

    /**
     * metoda sa pise takto:
     *
     * public/private typ_vysledku nazov_metody( pripadny zoznam vstupnych
     * parametrov oddelenych ciarkou ) { telo metody }
     *
     * public - metoda je verejna, moze ju volat ktokolvek private - metoda je
     * privatna/sukromna, volat ju moze len jej objekt, nikto viac
     *
     * typ_vysledku moze byt akykolvek typ (jednoduchy ci trieda), alebo void tj
     * metoda nevracia nic ak to nie je void, vyzaduje sa slovicko return v tele
     * metody
     *
     */
    public double scitaj(double a, double b) {
        return a + b;
    }

    public double odcitaj(double a, double b) {
        return a - b;
    }

    public double nasobenie(double a, double b) {
        double c; 
        c = 0;
        for (int i = 1; i <= a; i++) {
        c = c + b; 

        } 
        return c;
//        return a * b;

    }

    public double delenie(double a, double b) {
        if (b == 0) {
            System.out.println("delenie cislom 0 nieje mozne");
            return 0;
        } else {
            return a / b;
        }

    }
    public int funkcia (int f){
         int vysl;
          vysl = 0;
         for (int i = 1; i <= f; i++) {
             vysl = vysl +i;
         }
         return vysl;
    }

}
