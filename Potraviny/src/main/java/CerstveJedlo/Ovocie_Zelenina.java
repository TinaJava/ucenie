/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CerstveJedlo;

/**
 *
 * @author vlada
 */
public abstract class Ovocie_Zelenina {

    protected String nazov;
    protected int hmotnost;
    protected int cena;
    private final boolean sladke;
    private final boolean kysele;
    private final boolean supka;
    private boolean isSladke;

    public Ovocie_Zelenina(String nazov, double hmotnost, int cena, boolean sladke, boolean supka, boolean kysele) {
        this.nazov = nazov;
        this.hmotnost = (int) hmotnost;
        this.cena = cena;
        this.sladke = sladke;
        this.kysele = kysele;
        this.supka = supka;
    }

    @Override
    public String toString() {
        return "Ovocie_Zelenina{"
                + "nazov=" + nazov + ","
                + " hmotnost=" + hmotnost + ","
                + " cena=" + cena
                + '}';
    }

}
