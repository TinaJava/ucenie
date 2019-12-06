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
public class Macka extends Zviera {

    private boolean maznacik;
    private boolean lapacMysi;

    public Macka(boolean maznacik, boolean lapacMysi, String meno, double vyska, double vaha, boolean domaceZviera, boolean cicavec) {
        super(meno, vyska, vaha, domaceZviera, cicavec);

        this.maznacik = maznacik;
        this.lapacMysi = lapacMysi;
    }

    public boolean isMaznacik() {
        return maznacik;
    }

    public void setMaznacik(boolean maznacik) {
        this.maznacik = maznacik;
    }

    public boolean isLapacMysi() {
        return lapacMysi;
    }

    public void setLapacMysi(boolean lapacMysi) {
        this.lapacMysi = lapacMysi;
    }

    @Override
    public String toString() {
        return "Macka{"
                + "meno=" + meno + ", "
                + "vyska=" + vyska + ", "
                + "vaha=" + vaha + ", "
                + "domaceZviera=" + domaceZviera + ", "
                + "cicavec=" + cicavec + ", "
                + "maznacik=" + maznacik + ", "
                + "lapacMysi=" + lapacMysi
                + '}';
    }

}
