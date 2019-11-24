/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.vlada.hodiny;

import sk.vlada.hodiny.enumeracie.TypNaramku;

/**
 *
 * @author Tina
 */
public class Naramkove extends Hodiny {

    public Naramkove(String znacka) {
        super(znacka);
    }

    public Naramkove(TypNaramku materialNaramku, String znacka) {
        super(znacka);//super oznacuje ze zavolal metodu z predka hodin volanie konstruktora z predka je pod nazvom super
        this.materialNaramku = materialNaramku;
    }
    

    private TypNaramku materialNaramku;//vlastnost ktora definuje tvar farbu a popis produktu v nasom pripade naramku hodin

    

    public TypNaramku getMaterialNaramku() {//vytvorenie gettra a settra pre typ Naramku
        return materialNaramku;
    }

    public void setMaterialNaramku(TypNaramku materialNaramku) {
        this.materialNaramku = materialNaramku;
    }

   
    }


