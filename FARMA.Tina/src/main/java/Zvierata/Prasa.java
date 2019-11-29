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
public class Prasa extends Zviera {
    
    private boolean maso;
    private boolean mast;
    private boolean vnutornosti;

    public Prasa(double hmotnost, int vyska, boolean uzitkove, String nazov, boolean cicavec) {
        super(hmotnost, vyska, uzitkove, nazov, cicavec);
    }

    public boolean isMaso() {
        return maso;
    }

    public void setMaso(boolean maso) {
        this.maso = maso;
    }

    public boolean isMast() {
        return mast;
    }

    public void setMast(boolean mast) {
        this.mast = mast;
    }

    public boolean isVnutornosti() {
        return vnutornosti;
    }

    public void setVnutornosti(boolean vnutornosti) {
        this.vnutornosti = vnutornosti;
    }

    @Override
    public String toString() {
        return "Prasa{" + "maso=" + maso + ", mast=" + mast + ", vnutornosti=" + vnutornosti + '}';
    }
    
    
    
}
