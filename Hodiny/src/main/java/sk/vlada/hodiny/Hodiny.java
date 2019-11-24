/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.vlada.hodiny;

import sk.vlada.hodiny.enumeracie.FarbaHodin;
import sk.vlada.hodiny.enumeracie.TvarHodin;
import sk.vlada.hodiny.enumeracie.VelkostHodin;
import sk.vlada.hodiny.enumeracie.MaterialHodin;
import sk.vlada.hodiny.enumeracie.TypNaramku;

/**
 *
 * @author Vladimira
 */
public class Hodiny {//verejna trieda s nazvom Hodiny

    protected String znacka;
    protected FarbaHodin farba; 
    protected TypNaramku typNaramku;
    protected TvarHodin tvar;
    protected VelkostHodin velkost;
    protected MaterialHodin materialHodin;

   

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public FarbaHodin getFarba() {
        return farba;
    }

    public void setFarba(FarbaHodin farba) {
        this.farba = farba;
    }

    public TypNaramku getTypNaramku() {
        return typNaramku;
    }

    public void setTypNaramku(TypNaramku typNaramku) {
        this.typNaramku = typNaramku;
    }

    public TvarHodin getTvar() {
        return tvar;
    }

    public void setTvar(TvarHodin tvar) {
        this.tvar = tvar;
    }

    public VelkostHodin getVelkost() {
        return velkost;
    }

    public void setVelkost(VelkostHodin velkost) {
        this.velkost = velkost;
    }

    public MaterialHodin getMaterialHodin() {
        return materialHodin;
    }

    public void setMaterialHodin(MaterialHodin materialHodin) {
        this.materialHodin = materialHodin;
    }

    public Hodiny(String znacka) {
        this.znacka = znacka;// vyrobenz konstruktor na uvedenie znacky
    }
    

   

   

        //anodacia su to upoyornenia pre javu abz si dali poyor ye sme prepisali predka
        //public string to string je metoda ktora vrati vsetkz atributz hodin v jednom texte. farbu ynacku atd.

    @Override
    public String toString() {
        return "Hodiny{" + "znacka=" + znacka + ", farba=" + farba + ", typNaramku=" + typNaramku + ", tvar=" + tvar + ", velkost=" + velkost + ", materialHodin=" + materialHodin + '}';
    }

    }


