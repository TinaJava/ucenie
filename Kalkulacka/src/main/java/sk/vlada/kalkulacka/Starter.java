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
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicializacia
        double vysledok;  // zadefinujeme premennu vysledok typu double
        Kalkulacka kalk1;  // zadefinujeme premennu kalk typu nasa trieda Kalkulacka
        kalk1 = new Kalkulacka();   // do premennej kalk vytvorime objekt nasej triedy Kalkulacka cez prikaz new
        Kalkulacka kalk2;
        kalk2 = new Kalkulacka();

        //nasobenie
        vysledok = kalk1.nasobenie(430, 39);
        System.out.println(vysledok);

        //delenie
        vysledok = kalk1.delenie(10.5, 3);
        System.out.println(vysledok);

        vysledok = kalk2.delenie(900, 250);
        System.out.println(vysledok);

        vysledok = kalk1.delenie(900, 250);
        System.out.println(vysledok);
        //nasobenie
        vysledok = kalk1.nasobenie(30.5, 20);
        System.out.println(vysledok);

        vysledok = kalk1.scitaj(1, 2);
        vysledok = kalk1.scitaj(vysledok, 3);
        System.out.println(vysledok);
        //new zadanie 100-90+35-15+20-10
        vysledok = kalk2.odcitaj(100, 90);
        vysledok = kalk1.scitaj(vysledok, 35);
        vysledok = kalk2.odcitaj(vysledok, 15);
        vysledok = kalk1.scitaj(vysledok, 20);
        vysledok = kalk2.odcitaj(vysledok, 10);
        System.out.println(vysledok);

        //dalsie ulohy
        vysledok = kalk1.scitaj(20, 30);
        vysledok = kalk1.nasobenie(vysledok, 2);
        vysledok = kalk1.odcitaj(vysledok, 2);
        System.out.println(vysledok);

        vysledok = kalk1.delenie(vysledok, 5);
        vysledok = kalk1.scitaj(5, vysledok);
        System.out.println(vysledok);

        vysledok = kalk1.nasobenie(5, 3);
        vysledok = kalk1.odcitaj(vysledok, 15);
        System.out.println(vysledok);

        vysledok = kalk1.delenie(10, vysledok);
        System.out.println(vysledok);

        vysledok = kalk1.delenie(10, 0);
        System.out.println(vysledok);

        for (double i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 20; i >= 5; i--) {
            System.out.println(i);
        }
        vysledok = kalk1.funkcia(5);
        System.out.println(vysledok);
        vysledok = kalk1.funkcia(12);
        System.out.println(vysledok);
        vysledok = kalk1.funkcia(7);
        System.out.println(vysledok);
    }

}
