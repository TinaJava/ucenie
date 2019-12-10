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
    private String sadra;
    private String topanka;
    private double velkostNohy;

    public Noha(String nazov, String farba, String pohyb,int pocetPrstov,boolean sadra,boolean topanka,double velkostNohy) {
        super(nazov, farba, pohyb);
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
