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
public class Ciara extends Utvar {

    private int zaciatokX;  // X-ova suradnica zaciatocneho bodu ciary
    private int zaciatokY;  // Y-ova suradnica zaciatocneho bodu ciary
    private int koniecX;  // X-ova suradnica koncoveho bodu ciary
    private int koniecY;  // Y-ova suradnica koncoveho bodu ciary

    /**
     * Konstruktor, kde sa zadaju vlastnosti ciary (farba ostava
     * defaultna)
     * 
     * @param zaciatokX
     * @param zaciatokY
     * @param koniecX
     * @param koniecY 
     */
    public Ciara(
            int zaciatokX, int zaciatokY, int koniecX, int koniecY
    ) {
        this.zaciatokX = zaciatokX;
        this.zaciatokY = zaciatokY;
        this.koniecX = koniecX;
        this.koniecY = koniecY;
    }

    /**
     * Konstruktor, kde sa zadaju vlastnosti ciary i s farbou
     * 
     * @param zaciatokX
     * @param zaciatokY
     * @param koniecX
     * @param koniecY
     * @param farba 
     */
    public Ciara(
            int zaciatokX, int zaciatokY, int koniecX, int koniecY,
            Color farba
    ) {
        super(farba);
        this.zaciatokX = zaciatokX;
        this.zaciatokY = zaciatokY;
        this.koniecX = koniecX;
        this.koniecY = koniecY;
    }

    /**
     * Overridnuta metoda vykresliSa z predka, v kt. sa vykresli ciara
     *
     * @param g - Objekt typu Graphics, kt. sluzi na kreslenie
     */
    @Override
    public void vykresliSa(Graphics g) {
        g.setColor(farba);  // nastavim farbu
        g.drawLine(zaciatokX, zaciatokY, koniecX, koniecY);  // vykreslim ciaru
    } 

}
