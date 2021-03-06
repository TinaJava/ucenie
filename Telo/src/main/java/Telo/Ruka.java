/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telo;

/**
 *
 * @author vlada
 */
public class Ruka extends Koncatiny {

    private int pocetPrstov;
    private boolean rukavica;

    public Ruka(int pocetPrstov, boolean rukavica, String nazov, String farba, String pohyb) {
        super(nazov, farba, pohyb);
        this.pocetPrstov = pocetPrstov;
        this.rukavica = rukavica;
    }

   
    public int getPocetPrstov() {
        return pocetPrstov;
    }

    public int setPocetPrstov(int pocetPrstov) {
        this.pocetPrstov = pocetPrstov;
        return 5;
    }

    public boolean getRukavica() {
        return rukavica;
    }

    public void setRukavica(boolean rukavica) {
        this.rukavica = rukavica;
    }

    @Override
    public String toString() {
        return "Ruka{"
                + "pocetPrstov=" + pocetPrstov + ", "
                + "rukavica=" + rukavica + ", "
                + "nazov=" + nazov + ", "
                + "farba=" + farba + ", "
                + "pohyb=" + pohyb + ", "
                + '}';
    }

}
