/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produkcia;

/**
 *
 * @author vlada
 */
public abstract class Farma {  // Preco je ta trieda abstract?
    protected String Zoznam_zvierat;   // Preco to mas ako String? Ved to ma byt zoznam tj List, Pole, Mapa

    public Farma(String Zoznam_zvierat) {
        this.Zoznam_zvierat = Zoznam_zvierat;  // Preco si chces zoznam zvierat posielat z vonku? Ved trieda Farma bude ten zoznam zvierat udrzovat a riadit, nie nikto z vonku
    }

   
}

