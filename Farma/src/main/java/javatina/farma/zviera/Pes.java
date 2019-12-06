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

    public Pes(String meno, double vyska, double vaha, boolean domaceZviera, boolean cicavec, boolean strazneZviera) {
        super(meno, vyska, vaha, domaceZviera, cicavec);

        this.strazneZviera = strazneZviera;
    }

    public boolean isStrazneZviera() {
        return strazneZviera;
    }

    public void setStrazneZviera(boolean strazneZviera) {
        this.strazneZviera = strazneZviera;
    }

    @Override
    public String toString() {
        return "Pes{"
                + "meno=" + meno + ", "
                + "vyska=" + vyska + ", "
                + "vaha=" + vaha + ", "
                + "domaceZviera=" + domaceZviera + ", "
                + "cicavec=" + cicavec + ", "
                + "strazneZviera=" + strazneZviera
                + '}';
    }

}
