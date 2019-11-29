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
public class Hus extends Zviera {

    private boolean perie;
    private boolean vajcia;
    private boolean maso;
    /**vyrobenie gettrov a settrov na perie vajcia a maso, a kedze je to potomok 
     * zvierata tak sa nam pridali k povodnzm vlastnostiam dalsie ine vlastnosti
     * typu :
     * @param hmotnost
     * @param vyska
     * @param uzitkove
     * @param nazov
     * @param cicavec 
     */
    
    public Hus(double hmotnost, int vyska, boolean uzitkove, String nazov, boolean cicavec) {
        super(hmotnost, vyska, uzitkove, nazov, cicavec);
    }

    public boolean isPerie() {
        return perie;
    }

    public void setPerie(boolean perie) {
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
    // vyrobenie metodz string to string 

    @Override
    public String toString() {
        return "Hus{" + "perie=" + perie + ", vajcia=" + vajcia + ", maso=" + maso + '}';
    }
    

}


