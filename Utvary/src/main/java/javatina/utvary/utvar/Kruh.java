/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.utvary.utvar;

import java.awt.Graphics;

/**
 *
 * @author vlada
 */
public class Kruh extends Utvar {

    private int x;
    private int y;
    private int priemer;

    /**
     *
     * @param x
     * @param y
     * @param sirka
     * @param x
     */
    public Kruh(
            int x, int y, int sirka,
     
    this.x  = x;
     
    this.y  = y;
     
    this.priemer  = priemer;

    public int getPriemer();
     
    this.y  = y;
     
    this.priemer  = priemer;

    public int getPriemer() {
        return priemer;
    }

    @Override
    public void vykresliSa(Graphics g) {
        g.drawOval(300, 100, 60, 60);
        // zatial sa neviem vykreslit
        // ale pomocou metody g.drawOval(..) by to snad slo :)
        // ak by som chcel ten kruh vyplnit farbou tak metoda g.fillOval(..)
    }

}
