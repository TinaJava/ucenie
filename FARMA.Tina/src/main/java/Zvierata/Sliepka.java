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
public class Sliepka extends Zviera {

    private boolean vajcia;
    private boolean maso;
    private boolean perie;

    public Sliepka(boolean vajcia, boolean maso, boolean perie, String nazov, double hmotnost, int vyska, boolean uzitkove) {
        super(nazov, hmotnost, vyska, uzitkove, false);  // to iste ako pre Hus
        this.vajcia = vajcia;
        this.maso = maso;
        this.perie = perie;
    }

    public boolean isVajcia() {
        return vajcia;
    }

    public void setVajcia(boolean vajcia) {
        this.vajcia = vajcia;
    }

    public boolean isMaso() {
        return maso;
    }

    public void setMaso(boolean maso) {
        this.maso = maso;
    }

    public boolean isPerie() {
        return perie;
    }

    public void setPerie(boolean perie) {
        this.perie = perie;
    }

    @Override
    public String toString() {
        return "Sliepka{"
                + "nazov=" + nazov + ", "
                + "hmotnost=" + hmotnost + ", "
                + "vyska=" + vyska + ", "
                + "uzitkove=" + uzitkove + ", "
                + "cicavec=" + cicavec + ", "
                + "vajcia=" + vajcia + ", "
                + "maso=" + maso + ", "
                + "perie=" + perie
                + '}';
    }

}
