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
public class Krava extends Zviera {

    private boolean rohovina;
    private boolean mlieko;
    private boolean kozusina;
    private boolean maso;

    public Krava(
            String nazov, double hmotnost, int vyska, boolean uzitkove, boolean cicavec,
            boolean rohovina, boolean mlieko, boolean kozusina, boolean maso
    ) {
        super(nazov, hmotnost, vyska, uzitkove, cicavec);
        this.rohovina = rohovina;
        this.mlieko = mlieko;
        this.kozusina = kozusina;
        this.maso = maso;
    }

    public boolean isRohovina() {
        return rohovina;
    }

    public void setRohovina(boolean rohovina) {
        this.rohovina = rohovina;
    }

    public boolean isMlieko() {
        return mlieko;
    }

    public void setMlieko(boolean mlieko) {
        this.mlieko = mlieko;
    }

    public boolean isKozusina() {
        return kozusina;
    }

    public void setKozusina(boolean kozusina) {
        this.kozusina = kozusina;
    }

    public boolean isMaso() {
        return maso;
    }

    public void setMaso(boolean maso) {
        this.maso = maso;
    }

    @Override
    public String toString() {
        return "Krava{"
                + "nazov=" + nazov + ", "
                + "hmotnost=" + hmotnost + ", "
                + "vyska=" + vyska + ", "
                + "uzitkove=" + uzitkove + ", "
                + "cicavec=" + cicavec + ", "
                + "rohovina=" + rohovina + ", "
                + "mlieko=" + mlieko + ", "
                + "kozusina=" + kozusina + ", "
                + "maso=" + maso
                + '}';
    }

}
