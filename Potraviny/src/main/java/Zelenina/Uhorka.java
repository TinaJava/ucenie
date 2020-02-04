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
public class Uhorka extends Ovocie_Zelenina {

    private Farba farba;
    private boolean jadierka;
    private boolean supka;

    public Uhorka(Farba farba, String nazov, double hmotnost, int cena, boolean sladke, boolean supka, boolean kysele,boolean jadierka) {
        super(nazov, hmotnost, cena, sladke, supka, kysele);
        this.jadierka = jadierka;
        this.farba = farba;
    }

    public Farba getFarba() {
        return farba;
    }

    public void setFarba(Farba farba) {
        this.farba = farba;
    }

    public boolean isJadierka() {
        return jadierka;
    }

    public void setJadierka(boolean jadierka) {
        this.jadierka = jadierka;
    }

    public boolean isSupka() {
        return supka;
    }

    public void setSupka(boolean supka) {
        this.supka = supka;
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
        return "Uhorka{"
                + " farba=" + farba + ","
                + " jadierka=" + jadierka + ","
                + " supka=" + supka + ","
                + " nazov=" + nazov + ","
                + " hmotnost=" + hmotnost + ","
                + " cena=" + cena
                + '}';
    }

}
