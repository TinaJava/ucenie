/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.farma.zviera;

import java.util.Map;

/**
 *
 * @author Stevlik Marian
 */
public class Zviera {

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

    public Zviera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void put(String string, Zviera zviera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterable<Map.Entry<String, Zviera>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
