/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rodina;

/**
 *
 * @author Tina
 */
public class ClenRodiny {

    private int vek;
    private double hmotnost;
    private String meno;
    private FarbaVlasov farbaVlasov;
    private int vyska;
    private Pohlavie pohlavie;
    private boolean okuliare;

    public ClenRodiny() {//vytvoreny konstruktor s prazdnymi () cize nieje naplneny.no zato  je tam dole podtym natvrdo zadefinovanie okuliarov ze niesu. 
        this.okuliare = false;
    }

    public ClenRodiny(String meno) {//tuna uz vytvoreny konstruktor ocakava naplnenie mena ktore zadame v starteri do ()konstruktora ktory volame metodou new
        this.meno = meno;
        this.okuliare = false;
        this.pohlavie = Pohlavie.MUZ;
    }

    public ClenRodiny(String meno, int vek) {//konstruktor ocakava v starteri naplnenie mena a veku
        this.meno = meno;
        this.vek = vek;
        this.okuliare = false;
    }

    public ClenRodiny(int vek, String meno, Pohlavie pohlavie) {//tu ocakava konstruktor vek,meno a pohlavie a naplnujeme v starteri
        this.vek = vek;
        this.meno = meno;
        this.pohlavie = pohlavie;
    }

    // getter pre vek - vrati hodnotu vlastnbosti vek
    public int getVek() {
        if (pohlavie == Pohlavie.ZENA) {
            return vek - 15;  // ak je ide o zenu, tak vratime "samozrejme" vek o 15 rokov mladsi :)
        } else {
            return vek;
        }
    }

    // setter pre vek - nastavi hodnotu vlastnosti vek
    public void setVek(int vek) {
        // nas vek je zelenou farbou, vek z vonku je ciernou farbou
        // priradime vek, vtedy ak je v intervale 0..100
        if (vek < 0) {  // ak je vek z vonku < 0, tak priradime do nasho veku 0
            this.vek = 0;
        } else if (vek > 100) {  // inak ak je vek z vonku > 100, tak priradime do nasho veku 100
            this.vek = 100;
        } else {
            this.vek = vek;  // inak vek z vnoku je ok, je v intervale 0..100, tak ho priradime do nasho veku
        }
    }

    public double getHmotnost() {
        if (pohlavie == Pohlavie.MUZ) {
            return hmotnost + 10;
        } else {
            return hmotnost;
        }
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public FarbaVlasov getFarbaVlasov() {
        return farbaVlasov;
    }

    public void setFarbaVlasov(FarbaVlasov farbaVlasov) {
        this.farbaVlasov = farbaVlasov;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public Pohlavie getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(Pohlavie pohlavie) {
        this.pohlavie = pohlavie;
    }

    public boolean isOkuliare() {
        return okuliare;
    }

    public void setOkuliare(boolean okuliare) {
        this.okuliare = okuliare;
    }

    @Override
    public String toString() {
        return "ClenRodiny{"
                + "vek=" + vek + ", "
                + "hmotnost=" + hmotnost + ", "
                + "meno=" + meno + ", "
                + "farbaVlasov=" + farbaVlasov + ", "
                + "vyska=" + vyska + ", "
                + "pohlavie=" + pohlavie + ", "
                + "okuliare=" + okuliare
                + '}';
    }

}