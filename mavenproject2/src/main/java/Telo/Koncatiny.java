/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telo;

/**
 *
 * @author vlada
 */
public abstract class Koncatiny {
    protected String nazov;
    protected String farba;
    protected String pohyb;

    public Koncatiny(String nazov, String farba, String pohyb) {
        this.nazov = nazov;
        this.farba = farba;
        this.pohyb = pohyb;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public String getPohyb() {
        return pohyb;
    }

    public void setPohyb(String pohyb) {
        this.pohyb = pohyb;
    }

    @Override
    public String toString() {
       
        return "Koncatiny{" 
                + "nazov=" + nazov + ", "
                + "farba=" + farba + ", "
                + "pohyb=" + pohyb +", "
                + '}';
    }

    
    }
    
    
    
    
    

