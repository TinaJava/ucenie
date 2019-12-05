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
    
    protected String Meno;
    protected double Vyska;
    protected double Vaha;
    protected boolean Domace_Zviera;
    protected boolean Cicavec;

    public Zviera(String Meno, double Vyska, double Vaha, boolean Domace_Zviera, boolean Cicavec) {
        this.Meno = Meno;
        this.Vyska = Vyska;
        this.Vaha = Vaha;
        this.Domace_Zviera = Domace_Zviera;
        this.Cicavec = Cicavec;
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
        return "Zviera{" + "Meno=" + Meno
                + ", Vyska=" + Vyska 
                + ", Vaha=" + Vaha 
                + ", Domace_Zviera=" 
                + Domace_Zviera 
                + ", Cicavec=" + Cicavec 
                + '}';
    }

    
    }
    
    
    

