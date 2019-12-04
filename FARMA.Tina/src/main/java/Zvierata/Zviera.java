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
public abstract class Zviera {

    protected String nazov;
    protected double hmotnost;
    protected int vyska;
    protected boolean uzitkove;
    protected boolean cicavec;

    //vytvorenie konstruktora
    public Zviera(String nazov, double hmotnost, int vyska, boolean uzitkove, boolean cicavec) {
        this.nazov = nazov;
        this.hmotnost = hmotnost;
        this.vyska = vyska;
        this.uzitkove = uzitkove;
        this.cicavec = cicavec;
    }

    //vytvorenie sett a gett pre triedu zviera
    public double getHmotnost() {
        // if neukoncujes cez ; ale {
        // ak je premenna typu boolean, tak staci napisat len jej nazov a podla toho ci jej hodnota je true, alebo false sa vykona if
        if (cicavec) {
            return hmotnost + 20.5;
        } else {
            return hmotnost;
        }
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

    @Override
    public String toString() {
        return "Zviera{"
                + "nazov=" + nazov + ", "
                + "hmotnost=" + hmotnost + ", "
                + "vyska=" + vyska + ", "
                + "uzitkove=" + uzitkove + ", "
                + "cicavec=" + cicavec
                + '}';
    }

}
