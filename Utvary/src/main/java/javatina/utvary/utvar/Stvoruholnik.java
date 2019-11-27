/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.utvary.utvar;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Stevlik Marian
 */
public class Stvoruholnik extends Utvar {

    private int x;  // X-ova suradnica laveho-horneho bodu stvoruholnika
    private int y;  // Y-ova suradnica laveho-horneho bodu stvoruholnika
    private int sirka;  // sirka stvoruholnika
    private int vyska;  // vyska stvruholnika
    private boolean vyplnit;  // ma sa stvoruholnik vyplnit farbou 

    /**
     * Konstruktor, kde sa zadaju vlastnosti stvoruholnika (farba ostava
     * defaultna)
     *
     * @param x
     * @param y
     * @param sirka
     * @param vyska
     * @param vyplnit
     */
    public Stvoruholnik(
            int x, int y, int sirka, int vyska,
            boolean vyplnit
    ) {
        this.x = x;
        this.y = y;
        this.sirka = sirka;
        this.vyska = vyska;
        this.vyplnit = vyplnit;
    }

    /**
     * Konstruktor, kde sa zadaju vlastnosti stvoruholnika i s farbou
     *
     * @param x
     * @param y
     * @param sirka
     * @param vyska
     * @param vyplnit
     * @param farba
     */
    public Stvoruholnik(
            int x, int y, int sirka, int vyska,
            boolean vyplnit,
            Color farba
    ) {
        super(farba);
        this.x = x;
        this.y = y;
        this.sirka = sirka;
        this.vyska = vyska;
        this.vyplnit = vyplnit;
    }

    /**
     * Overridnuta metoda vykresliSa z predka, v kt. sa vykresli stvoruholnik
     *
     * @param g - Objekt typu Graphics, kt. sluzi na kreslenie
     */
    @Override
    public void vykresliSa(Graphics g) {
        g.drawRect(x, y, sirka, vyska);  // vykreslia sa obrysy
        if (vyplnit) {
            // ak je nastaveve vyplnit, tak sa stvoruholnik vyplni farbou
            g.setColor(farba);  // nastavi sa farba, kt. chceme vyplnat
            g.fillRect(x, y, sirka, vyska);  // vyplnime stvoruholnik
        }
    }

}
