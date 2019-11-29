/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zvierata;

/**
 *
 * @author vlada
 */
public class Zviera {
    private Zviera koza;
    private Zviera Krava;
    private Zviera hus;
    private Zviera prasa;

    private double hmotnost;
    private int vyska;
    private boolean uzitkove;
    private String nazov;
    private boolean cicavec;

//vytvorenie sett a gett pre triedu zviera
    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public boolean isUzitkove() {
        return uzitkove;
    }

    public void setUzitkove(boolean uzitkove) {
        this.uzitkove = uzitkove;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public boolean isCicavec() {
        return cicavec;
    }

    public void setCicavec(boolean cicavec) {
        this.cicavec = cicavec;
    }

    //vytvorenie konstruktora
    public Zviera(double hmotnost, int vyska, boolean uzitkove, String nazov, boolean cicavec) {
        this.hmotnost = hmotnost;
        this.vyska = vyska;
        this.uzitkove = uzitkove;
        this.nazov = nazov;
        this.cicavec = cicavec;
    }

}
