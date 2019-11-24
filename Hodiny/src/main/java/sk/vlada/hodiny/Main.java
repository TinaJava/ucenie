/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.vlada.hodiny;

import sk.vlada.hodiny.enumeracie.FarbaHodin;
import sk.vlada.hodiny.enumeracie.MaterialHodin;
import sk.vlada.hodiny.enumeracie.TvarHodin;
import sk.vlada.hodiny.enumeracie.TypNaramku;
import sk.vlada.hodiny.enumeracie.VelkostHodin;


/**
 *
 * @author Vladimira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Moj prvy program: HODINY");
        Hodiny hod1;
        Hodiny hod2; //toto su vytvorene premenne(sluzia na vpisovanie  vlastnosti hodin a kedze su rozne tak preto premenne)

//        hod1 = new Hodiny();//po vyrobeni konstruktera v triede  hodiny mi svietil tuna konstruktor lebo ocakava naplneneie znacky hodin
//        hod2 = new Hodiny();//my ho vsak yaremujeme a upravime tak ako ma byt a vypiseme pod to. tototu necham ako vzor ako to bolo napisane
        hod1 = new Hodiny ("Tissot");
        hod2 = new Hodiny (" Tiktak");//takze len sme do prazdnych zatvoriek() uviedli znacku  teda to co sa od nas ocakavalo kedze sme vytvorili v class hodiny konstruktor pre znacku
        
        hod1.setZnacka("QUARTZ");
        hod1.setTvar(TvarHodin.HRANATE);
        hod1.setFarba(FarbaHodin.BIELE);
        hod1.setVelkost(VelkostHodin.NARAMKOVE);

        hod2.setZnacka("CITIZEN");
        hod2.setTvar(TvarHodin.OKRUHLE);
        hod2.setFarba(FarbaHodin.ZLATE);
        hod2.setVelkost(VelkostHodin.SKRINOVE);

        System.out.println("hod1 = " + hod1);
        System.out.println("hod2 = " + hod2);

        Naramkove hod3;
        hod3 = new Naramkove("");
        hod3.setFarba(FarbaHodin.BIELE);
        hod3.setMaterialNaramku(TypNaramku.SILIKON);
        hod3.setVelkost(VelkostHodin.NARAMKOVE);
        hod3.setTvar(TvarHodin.OKRUHLE);
        hod3.setZnacka("....");
        
        Orloj hod4;
        hod4 = new Orloj("Tictac");
        hod4.setBicie(true);
        hod4.setHmotnost(250);
        hod4.setKyvadlo(false);
        hod4.setFarba(FarbaHodin.ZLATE);
        hod4.setTvar(TvarHodin.OKRUHLE);
        hod4.setVelkost(VelkostHodin.VEZOVE_ORLOJOVE);
        hod4.setZnacka("... ");

        SkrinoveHodiny hod5;
        hod5 = new SkrinoveHodiny("TouTou");
        hod5.setFarba(FarbaHodin.HNEDE);
        hod5.setMaterialHodin(MaterialHodin.DREVO);
        hod5.setCifernik(true);
        hod5.setKyvadlo(true);
        hod5.setPocet_ks(5);
        hod5.setHmotnost(65);
        hod5.setTvar(TvarHodin.HRANATE);
        hod5.setVelkost(VelkostHodin.SKRINOVE);
        hod5.setZnacka("CITTIZEN");

        System.out.println("hod3 = " + hod3);
        System.out.println("hod4 = " + hod4);
        System.out.println("hod5 = " + hod5);
    }

}
