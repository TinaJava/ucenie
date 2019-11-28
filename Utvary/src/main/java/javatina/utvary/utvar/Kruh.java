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

    public Kruh(int x, int y, int priemer) {
        this.x = x;
        this.y = y;
        this.priemer = priemer;
    }

    public Kruh(int x, int y, int priemer, Color farba) {
        super(farba);
        this.x = x;
        this.y = y;
        this.priemer = priemer;
    }
    
    

    @Override
    public void vykresliSa(Graphics g) {
        g.drawOval(x, y, priemer,priemer);
        // zatial sa neviem vykreslit
        // ale pomocou metody g.drawOval(..) by to snad slo :)
        // ak by som chcel ten kruh vyplnit farbou tak metoda g.fillOval(..)
    }

}
