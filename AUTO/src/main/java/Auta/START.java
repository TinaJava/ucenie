/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auta;

/**
 *
 * @author Tina
 */
public class START {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
  
        Auto auto1;       
        auto1 = new Auto("TT 123B",3,445.2);//naplnenie konstruktora s spz a poctom dveri samozrejme ak by som chchela zmenit parametre tak ich dopisem sem do starteru pod ostatne a zmenim ich slovom set.      
        auto1.setHmotnost(580);      // tak ako je to tu. auto1.setTurbo(false);
        auto1.setPocet_ks(2);
        auto1.setTurbo(false);
        auto1.setVelkost_kolies(15);
        auto1.setTypAuta(TypAuta.COMBI);
        auto1.setZnackaAuta(ZnackaAuta.AUDI);
      
        System.out.println(auto1);
        
        Auto auto2;
        auto2 = new Auto("TN",5,500.1);
        auto2.setZnackaAuta(ZnackaAuta.BMW);
        
    }

    Auto auto3;
    auto3 = new Auto();
//nerozumiem tomu preco mi to vypisalo zelenym to auto3. stlacila som nieco??
//a neviem ani to preco mi podciarkuje cervene konstruktor skusila som aj naplnit a aj tak bol zly.
// chce to po mne dalsiu triedu auto3 v package auta.je nutne vytvorit dalsiu triedu?   
}
