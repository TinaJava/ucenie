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
public class Kivi extends Zviera {

    private boolean skrecok;

    public Kivi(String meno, double vyska, double vaha, boolean domaceZviera, boolean cicavec, boolean skrecok) {
        super(meno, vyska, vaha, domaceZviera, cicavec);
    }

    public boolean isSkrecok() {
        return skrecok;
    }

    public void setSkrecok(boolean skrecok) {
        this.skrecok = skrecok;
    }

    @Override
    public String toString() {
        return "Kivi{"
                + "meno=" + meno + ", "
                + "vyska=" + vyska + ", "
                + "vaha=" + vaha + ", "
                + "domaceZviera=" + domaceZviera + ", "
                + "cicavec=" + cicavec + ", "
                + "skrecok=" + skrecok
                + '}';
    }

}
