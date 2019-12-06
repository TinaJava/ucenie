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
    protected boolean domaceZviera;
    protected boolean cicavec;

    public Zviera(String meno, double vyska, double vaha, boolean domaceZviera, boolean cicavec) {
        this.meno = meno;
        this.vyska = vyska;
        this.vaha = vaha;
        this.domaceZviera = domaceZviera;
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

    public boolean isDomaceZviera() {
        return domaceZviera;
    }

    public void setDomaceZviera(boolean domaceZviera) {
        this.domaceZviera = domaceZviera;
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
                + "meno=" + meno + ", "
                + "vyska=" + vyska + ", "
                + "vaha=" + vaha + ", "
                + "domaceZviera=" + domaceZviera + ", "
                + "cicavec=" + cicavec
                + '}';
    }

}
