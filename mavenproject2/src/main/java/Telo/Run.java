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
    public static void main(String[] args,int pocetPrstov) {
    
        Ruka ruka;
        ruka = new Ruka("prava ruka", "telova", "chyt pero", 10, true);
        System.out.println(ruka);
        
        Noha noha;
        noha = new Noha("noha","krvava","ohni koleno",5,false,true,42);
        System.out.println(noha);
       
    }
}
      
    

    


//        int pocetPrstov = 10;
//
//        } else if (pocetPrstov < 3) {
//       
//        return 5;
//        } else {
//        }
//        return pocetPrstov;
//        for (Ruka ruka : pocetPrstov) {
//            if (pocetPrstov > 15) {
//                return pocetPrstov;
         
         

