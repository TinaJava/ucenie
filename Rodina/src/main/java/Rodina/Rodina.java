/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rodina;

import java.util.List;

/**
 *
 * @author Tina
 */
public class Rodina {

    private ClenRodiny mama;//s  ctrl r som zmenila matka na mama a potvrdila ze chcem premenovat aj setter a getter
    private ClenRodiny otec;
    private List<ClenRodiny> deti;

    public List<ClenRodiny> getDeti() {
        return deti;
    }
    public void setDeti(List<ClenRodiny> deti) {
        this.deti = deti;
    }
    
    
    private String nazovRodiny;
    private String adresa;

    public ClenRodiny getMama() {
        return mama;
    }

    public void setMama(ClenRodiny mama) {
        this.mama = mama;
    }

    public ClenRodiny getOtec() {
        return otec;
    }

    public void setOtec(ClenRodiny otec) {
        this.otec = otec;
    }

    public String getNazovRodiny() {
        return nazovRodiny;
    }

    public void setNazovRodiny(String nazovRodiny) {
        this.nazovRodiny = nazovRodiny;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    

    @Override
    public String toString() {
        return "Rodina{"
                + "adresa =" + adresa + ",\n"
                + "matka =" + mama + ",\n "
                + "otec =" + otec + ",\n "
                + "nazovRodiny =" + nazovRodiny + ",\n "
                + "deti =" + deti + 
                 "}\n";
    }

}
