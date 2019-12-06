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
public class Pes extends Zviera {

    private boolean strazneZviera;

    public Pes(String meno, double vyska, double vaha, boolean domace_zviera, boolean cicavec, boolean strazneZviera) {
        super(meno, vyska, vaha, domace_zviera, cicavec);

        this.strazneZviera = strazneZviera;
    }

    public boolean isStrazneZviera() {
        return strazneZviera;
    }

    public void setStrazneZviera(boolean strazneZviera) {
        this.strazneZviera = strazneZviera;
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
        return "Pes{"
                + "strazneZviera=" + strazneZviera
                + "meno=" + meno
                + ", vyska=" + vyska
                + ", vaha=" + vaha
                + ", domace_zviera=" + domace_zviera
                + ", cicavec=" + cicavec
                + '}';
    }

}
