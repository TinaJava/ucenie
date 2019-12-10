/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telo;

/**
 *
 * @author vlada
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        System.out.println("Telo a Koncatiny");

        System.out.println("PocetPrstov");
        Ruka ruka;
        ruka = new Ruka();
        ruka ("Prava Ruka"," Telova", " Chyt Pero", 9, true);
           int  pocetPrstov = 10;
        if (pocetPrstov > 15) {
            return pocetPrstov;

        } else if (pocetPrstov < 3) {
       
        return 5;
        } else {
        }
        return pocetPrstov;
        System.out.println(ruka.getPocetPrstov());
     

    }

    private static void ruka(String prava_Ruka, String _Telova, String _Chyt_Pero, int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
