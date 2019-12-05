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

    private boolean Maznacik;
    private boolean LapacMysi;

    public Macka(String Meno, double Vyska, double Vaha, boolean Domace_Zviera, boolean Cicavec, boolean Maznacik, boolean LapacMysi) {
        super(Meno, Vyska, Vaha, Domace_Zviera, Cicavec);
    }

    public boolean isMaznacik() {
        return Maznacik;
    }

    public void setMaznacik(boolean Maznacik) {
        this.Maznacik = Maznacik;
    }

    public boolean isLapacMysi() {
        return LapacMysi;
    }

    public void setLapacMysi(boolean LapacMysi) {
        this.LapacMysi = LapacMysi;
    }

    public String getMeno() {
        return Meno;
    }

    public void setMeno(String Meno) {
        this.Meno = Meno;
    }

    public double getVyska() {
        return Vyska;
    }

    public void setVyska(double Vyska) {
        this.Vyska = Vyska;
    }

    public double getVaha() {
        return Vaha;
    }

    public void setVaha(double Vaha) {
        this.Vaha = Vaha;
    }

    public boolean isDomace_Zviera() {
        return Domace_Zviera;
    }

    public void setDomace_Zviera(boolean Domace_Zviera) {
        this.Domace_Zviera = Domace_Zviera;
    }

    public boolean isCicavec() {
        return Cicavec;
    }

    public void setCicavec(boolean Cicavec) {
        this.Cicavec = Cicavec;
    }

    @Override
    public String toString() {
        return "Macka{" + "Maznacik=" + Maznacik
                + ", LapacMysi=" + LapacMysi + '}';
    }

}
