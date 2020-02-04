/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zelenina;

import CerstveJedlo.Farba;
import CerstveJedlo.Ovocie_Zelenina;

/**
 *
 * @author vlada
 */
public class Brokolica extends Ovocie_Zelenina {

    private Farba farba;

    public Brokolica(Farba farba, String nazov, double hmotnost, int cena, boolean sladke, boolean supka, boolean kysele) {
        super(nazov, hmotnost, cena, sladke, supka, kysele);
        this.farba = farba;
    }

    public Farba getFarba() {
        return farba;
    }

    public void setFarba(Farba farba) {
        this.farba = farba;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Brokolica{"
                + " farba=" + farba + ","
                + " nazov=" + nazov + ","
                + " hmotnost=" + hmotnost + ","
                + " cena=" + cena
                + '}';
    }

}
