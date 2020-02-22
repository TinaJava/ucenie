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
public class Noha extends Koncatiny {
    
    private int pocetPrstov;
    private boolean sadra;
    private boolean topanka;
    private double velkostNohy;

    public Noha(int pocetPrstov, boolean sadra, boolean topanka, double velkostNohy, String nazov, String farba, String pohyb) {
        super(nazov, farba, pohyb);
        this.pocetPrstov = pocetPrstov;
        this.sadra = sadra;
        this.topanka = topanka;
        this.velkostNohy = velkostNohy;
    }

    public int getPocetPrstov() {
        return pocetPrstov;
    }

    public void setPocetPrstov(int pocetPrstov) {
        this.pocetPrstov = pocetPrstov;
    }

    public boolean isSadra() {
        return sadra;
    }

    public void setSadra(boolean sadra) {
        this.sadra = sadra;
    }

    public boolean isTopanka() {
        return topanka;
    }

    public void setTopanka(boolean topanka) {
        this.topanka = topanka;
    }

    public double getVelkostNohy() {
        return velkostNohy;
    }

    public void setVelkostNohy(double velkostNohy) {
        this.velkostNohy = velkostNohy;
    }

   

   

   

    @Override
    public String toString() {
        return "Noha{"
                + "pocetPrstov=" + pocetPrstov + ", "
                + "sadra=" + sadra + ", "
                + "topanka=" + topanka + ", "
                + "velkostNohy=" + velkostNohy +", " 
                + "nazov=" + nazov + ", "
                + "farba=" + farba + ", "
                + "pohyb=" + pohyb + ", "
                +'}';
    }
    
    
}
