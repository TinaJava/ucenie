/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatina.utvary;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javatina.utvary.utvar.Ciara;
import javatina.utvary.utvar.Stvoruholnik;
import javatina.utvary.utvar.Utvar;
import javax.swing.JFrame;

/**
 *
 * @author Stevlik Marian
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vytvorenie a naplnenie zoznamu utvarov, kt. sa maju vykreslit
        List<Utvar> utvary = new ArrayList<>();
        utvary.add(new Stvoruholnik(300, 100, 15, 15, false));   // stvorec defaultnej farby bez vyplnenia
        utvary.add(new Stvoruholnik(50, 50, 80, 40, true, Color.BLUE));  // vyplneny obdlznik modrej farby
        utvary.add(new Ciara(0, 0, 100, 100));  // ciara defaultnej farby
        utvary.add(new Ciara(400, 500, 200, 200, Color.RED));  // cervena ciara
        
        // vytvorenie a nastavenie formularu, do kt. sa tie utvary vykreslia
        Formular frm = new Formular(utvary);  // volam konstruktor o odovzdavam mu zoznam utvarov
        frm.setTitle("Útvary");  // nastavim nadpis formularu
        frm.setSize(900, 600);  // nastavim velkost formularu: sirka, vyska
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // nastavim, ze sa ma cely projekt skoncit, ked sa klikne na krizik na formulari
        frm.setVisible(true);  // zobrazenie formularu (zavola sa jeho metoda paint)
    }
    
}
