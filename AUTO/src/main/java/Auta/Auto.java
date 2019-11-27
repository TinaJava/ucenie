
package Auta;


/**
 *
 * @author Tina
 */
public class Auto {

    private String spz;
    private double hmotnost;
    private boolean turbo;
    private int pocet_dveri;
    private int velkost_kolies;
    private int pocet_ks;
   
    protected ZnackaAuta ZnackaAuta;
    protected TypAuta TypAuta;
   
    
//vygenerovany konstuktor pre spz auta a turbo typu boolean
    public Auto(String spz,int pocet_dveri,double hmotnost) {
        this.spz = spz;
        this.pocet_dveri = pocet_dveri;
        this.turbo = true;
    }

    public Auto(String spz) {
        this.spz = spz;

    
    //vytvorenie getrov a setrov

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public int getPocet_dveri() {
        return pocet_dveri;
    }

    public void setPocet_dveri(int pocet_dveri) {
        this.pocet_dveri = pocet_dveri;
    }

    public int getVelkost_kolies() {
        return velkost_kolies;
    }

    public void setVelkost_kolies(int velkost_kolies) {
        this.velkost_kolies = velkost_kolies;
    }

    public int getPocet_ks() {
        return pocet_ks;
    }

    public void setPocet_ks(int pocet_ks) {
        this.pocet_ks = pocet_ks;
    }

    public ZnackaAuta getZnackaAuta() {
        return ZnackaAuta;
    }

    public void setZnackaAuta(ZnackaAuta ZnackaAuta) {
        this.ZnackaAuta = ZnackaAuta;
    }

    public TypAuta getTypAuta() {
        return TypAuta;
    }

    public void setTypAuta(TypAuta TypAuta) {
        this.TypAuta = TypAuta;
    }
    //vytvorenie konstruktora 
    public Auto(String spz, double hmotnost, boolean turbo, int pocet_dveri, int velkost_kolies, int pocet_ks, ZnackaAuta ZnackaAuta, TypAuta TypAuta) {
        this.spz = spz;
        this.hmotnost = hmotnost;
        this.turbo = turbo;
        this.pocet_dveri = pocet_dveri;
        this.velkost_kolies = velkost_kolies;
        this.pocet_ks = pocet_ks;
        this.ZnackaAuta = ZnackaAuta;
        this.TypAuta = TypAuta;
    }
    

    @Override
    public String toString() {
        return "Auto{" + "spz=" + spz + ", hmotnost=" + hmotnost + ", turbo=" + turbo + ", pocet_dveri=" + pocet_dveri + ", velkost_kolies=" + velkost_kolies + ", pocet_ks=" + pocet_ks + ", ZnackaAuta=" + ZnackaAuta + ", TypAuta=" + TypAuta + '}';
    }

}

    
   
