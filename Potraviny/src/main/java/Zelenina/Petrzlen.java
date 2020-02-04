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
public class Petrzlen extends Ovocie_Zelenina {
    private Farba farba;
    private boolean korenovaZelenina;

    public Petrzlen(Farba farba, boolean korenovaZelenina, String nazov, int hmotnost, int cena, boolean sladke, boolean supka, boolean kysele) {
        super(nazov, hmotnost, cena, sladke, supka, kysele);
        this.farba = farba;
        this.korenovaZelenina = korenovaZelenina;
    }

    public Farba getFarba() {
        return farba;
    }

    public void setFarba(Farba farba) {
        this.farba = farba;
    }

    public boolean isKorenovaZelenina() {
        return korenovaZelenina;
    }

    public void setKorenovaZelenina(boolean korenovaZelenina) {
        this.korenovaZelenina = korenovaZelenina;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(int hmotnost) {
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
        return "Petrzlen{" 
                + " farba=" + farba + ","
                + " korenovaZelenina=" + korenovaZelenina + ","
                + " nazov=" + nazov + ","
                + " hmotnost="+ hmotnost + ","
                + " cena=" + cena
                + '}';
    }

   
    
}
