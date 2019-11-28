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
 * @author vlada
 */
public class Kruh extends Utvar {

    private int x;
    private int y;
    private int priemer;
    private boolean vyplnit;

    public Kruh(
            int x, int y, int priemer,
            boolean vyplnit
    ) {
        this.x = x;
        this.y = y;
        this.priemer = priemer;
        this.vyplnit = vyplnit;
    }

    public Kruh(
            int x, int y, int priemer,
            boolean vyplnit,
            Color farba
    ) {
        super(farba);
        this.x = x;
        this.y = y;
        this.priemer = priemer;
        this.vyplnit = vyplnit;
    }

    @Override
    public void vykresliSa(Graphics g) {
        g.setColor(farba);
        g.drawOval(x, y, priemer, priemer);
        if (vyplnit) {
            g.fillOval(x, y, priemer, priemer);
        }
    }

}
