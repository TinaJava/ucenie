/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.utvary.utvar;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Predok pre vsetky utvary
 * Ma vlastnost farba, kt. definuje akou farbou bude utvar vykresleny resp. vyplneny
 * Ma metodu vykresliSa, kt. sluzi na vykreslenie utvaru (tuto metodu vola pre kazdy utvar trieda Formular)
 * 
 * @author Stevlik Marian
 */
public abstract class Utvar {

    protected Color farba;  // farba utvaru

    /**
     * Konstruktor, kt. nastavy defaultnu farbu utvaru
     */
    public Utvar() {
        this.farba = Color.BLACK;  // defaultna farba je cierna
    }

    /**
     * Konstruktor, kt. nastavi farbu utvaru podla parametra
     * 
     * @param farba 
     */
    public Utvar(Color farba) {
        this.farba = farba;
    }

    /**
     * Tato metoda sluzi na vykreslenie utvaru
     * Kazdy utvar si ju prepise po svojom, kedze kazdy utvar sa vykresluje inak
     * 
     * @param g - Objekt typu Graphics, kt. sluzi na kreslenie
     */
    public abstract void vykresliSa(Graphics g);

}
