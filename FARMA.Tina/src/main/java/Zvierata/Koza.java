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
public class Koza extends Zviera {
    
    private boolean mlieko;
    private boolean maso;
    private boolean kozusina;

    public Koza(double hmotnost, int vyska, boolean uzitkove, String nazov, boolean cicavec) {
        super(hmotnost, vyska, uzitkove, nazov, cicavec);
    }

    public boolean isMlieko() {
        return mlieko;
    }

    public void setMlieko(boolean mlieko) {
        this.mlieko = mlieko;
    }

    public boolean isMaso() {
        return maso;
    }

    public void setMaso(boolean maso) {
        this.maso = maso;
    }

    public boolean isKozusina() {
        return kozusina;
    }

    public void setKozusina(boolean kozusina) {
        this.kozusina = kozusina;
    }

    @Override
    public String toString() {
        return "Koza{" + "mlieko=" + mlieko + ", maso=" + maso + ", kozusina=" + kozusina + '}';
    }
    
    
    
    
}