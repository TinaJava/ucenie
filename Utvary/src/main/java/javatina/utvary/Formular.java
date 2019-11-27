/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.utvary;

import java.awt.Graphics;
import java.util.List;
import javatina.utvary.utvar.Utvar;
import javax.swing.JFrame;

/**
 * Formular je trieda, kt. reprezentuje formular aplikacie
 * Na plochu formularu sa vykreslia jednotlive utvary, kt. zoznam dostaneme cez konstruktor
 * 
 * @author Stevlik Marian
 */
public class Formular extends JFrame {

    private List<Utvar> utvary;  // zoznam utvarov, kt. sa maju vykreslit

    /**
     * Konstruktor formularu, kt ma na vstupe zoznam utvarov, kt. sa maju vykreslit
     * 
     * @param utvary 
     */
    public Formular(List<Utvar> utvary) {
        this.utvary = utvary;
    }

    /**
     * Overridnuta metoda predka JFrame, kt. sluzi na vykreslenie formularu
     * 
     * @param g 
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);  // predkove vykreslenie
        // vykreslenie utvarov
        if ((utvary != null) && (utvary.size() > 0)) {  // zistim, ci je zoznam utvarov naplneny
            for (Utvar utvar : utvary) {
                utvar.vykresliSa(g);  // pre kazdy utvar zo zoznamu utvarov zavolam metodu vykresliSa
            }
        }
    }

}
