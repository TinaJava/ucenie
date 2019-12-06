/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.farma.zviera;

/**
 *
 * @author Stevlik Marian
 */
public abstract class Zviera {

    protected String meno;
    protected double vyska;
    protected double vaha;
    protected boolean domace_zviera;
    protected boolean cicavec;

    public Zviera(String meno, double vyska, double vaha, boolean domace_zviera, boolean cicavec) {
        this.meno = meno;
        this.vyska = vyska;
        this.vaha = vaha;
        this.domace_zviera = domace_zviera;
        this.cicavec = cicavec;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public double getVyska() {
        return vyska;
    }

    public void setVyska(double vyska) {
        this.vyska = vyska;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public boolean isDomace_zviera() {
        return domace_zviera;
    }

    public void setDomace_zviera(boolean domace_zviera) {
        this.domace_zviera = domace_zviera;
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
                + "meno=" + meno
                + ", vyska=" + vyska
                + ", vaha=" + vaha
                + ", domace_zviera=" + domace_zviera
                + ", cicavec=" + cicavec
                + '}';
    }

}
