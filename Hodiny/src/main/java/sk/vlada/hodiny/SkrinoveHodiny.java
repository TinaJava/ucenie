/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.vlada.hodiny;

/**
 *
 * @author Tina
 */
public class SkrinoveHodiny extends Hodiny {

    public SkrinoveHodiny(String znacka) {//opet vytvoreny konstruktor pre znacku a kedze ide o potomka hodin tak vola konstruktor z predka hodiny do potomka skrinove
        super(znacka);//a super znamena ze je konstruktor volany z predka konstruktora hodin
    }
    

    private boolean kyvadlo;
    private boolean cifernik;
    private boolean drevo;
    private double hmotnost;
    private int pocet_ks;

//    public SkrinoveHodiny() {
//        // tento konstruktor neocakava nic (nema vstupne parametre), ale nastavi, ze nema kyvadlo
//        this.kyvadlo = false;
//    }

//    public SkrinoveHodiny(boolean kyvadlo) {
//        // tento konstruktor ocakava, ze mu z vonku povedia, ci ma kyvadlo alebo nie
//        this.kyvadlo = kyvadlo;
//    }

    public boolean getKyvadlo() {
        return kyvadlo;
    }

    public void setKyvadlo(boolean kyvadlo) {
        this.kyvadlo = kyvadlo;
    }

    public boolean getCifernik() {
        return cifernik;
    }

    public void setCifernik(boolean cifernik) {
        this.cifernik = cifernik;
    }

    public boolean getDrevo() {
        return drevo;
    }

    public void setDrevo(boolean drevo) {
        this.drevo = drevo;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public int getPocet_ks() {
        return pocet_ks;
    }

    public void setPocet_ks(int pocet_ks) {
        this.pocet_ks = pocet_ks;
    }

}
