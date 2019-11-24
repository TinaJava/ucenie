/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.vlada.hodiny;

/**
 *
 * @author Tina
 */
public class Orloj extends Hodiny {

    public Orloj(String znacka) {
        super(znacka);
    }
    
    private boolean bicie;
    private boolean kyvadlo;
    private int hmotnost;

    public boolean getBicie() {
        return bicie;
    }

    public void setBicie(boolean bicie) {
        this.bicie = bicie;
    }

   
    public boolean getKyvadlo() {
        return kyvadlo;
    }

    public void setKyvadlo(boolean kyvadlo) {
        this.kyvadlo = kyvadlo;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(int hmotnost) {
        this.hmotnost = hmotnost;
    }
    
}
