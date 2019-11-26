package Rodina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
/**
 *
 * @author Tina
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("RODINA");
        // TODO code application logic here

        // vytvorenie a naplnenie rodiny 1
        Rodina rod1;  // vytvorenie premennej rod1 typu Rodina 
        rod1 = new Rodina();  // nastavenie premennej rod1,zaroven sluzi ako konstruktor ktory volame metodou new
        rod1.setNazovRodiny(" Stevlikovci ");
        rod1.setAdresa(" Dolna Poruba 244, 91443 ");
        // vytvorenie a nastavenie matky v rodine 1
        rod1.setMatka(new ClenRodiny("Gabika", 40));//naplnenie konstruktora menom a vekom ktory sme vztvorili v triede ClenRodiny
        rod1.getMatka().setMeno("Gisela");  // matku cez getter oznacime ze patri do rod1 a mozme s nou dalej pracovat a cez setter nastavime meno Gisela.ale ak chcheme pouzit prednadstavene meno v konstruktori "gabika",musime settre s inymi menami zmazat.
        System.out.println(rod1.getMatka().getMeno());  // vypiseme si meno matky (vypise nam Gisela)
        rod1.getMatka().setMeno("Johanka"); // matke zmenime cez setter meno na Johanka a zaroven jej dame getter abz sme s nou mohli pracovat
        System.out.println(rod1.getMatka().getMeno());  // znovu si vypiseme meno matky (vypise nam vsak uz Johanka)
        rod1.getMatka().setPohlavie(Pohlavie.ZENA);  //slovo set  pouzivame na zmenu mena,veku,hmotnosti atd...
        rod1.getMatka().setVek(35);                  //slovo getMeno,getVek,getHmotnost atd ... pouzivame na vypis v prikazovom riadku sout.
        rod1.getMatka().setVyska(165);
        rod1.getMatka().setHmotnost(65);
        rod1.getMatka().setFarbaVlasov(FarbaVlasov.BLOND);
//        rod1.matka.setOkuliare(true);
        // vytvorenie a nastavenie otca v rodine 1
        rod1.setOtec( new ClenRodiny());
        rod1.getOtec().setMeno("Martin");
        rod1.getOtec().setPohlavie(Pohlavie.MUZ);
        rod1.getOtec().setVek(400);
        rod1.getOtec().setVyska(180);
        rod1.getOtec().setHmotnost(95);
        rod1.getOtec().setFarbaVlasov(FarbaVlasov.CIERNE);
        //vytvorenie kolekcii deti
        rod1.setDeti(new ArrayList<>());
        // vytvorenie a nastavenie dietata v ClenRodiny
        ClenRodiny dietaPomocne;//cey ctrl R si moyme premenovat premennu
        dietaPomocne = new ClenRodiny();
        dietaPomocne.setMeno("Laura2");
        dietaPomocne.setPohlavie(Pohlavie.ZENA);
        dietaPomocne.setVek(15);
        dietaPomocne.setVyska(142);
        dietaPomocne.setHmotnost(45);
        dietaPomocne.setFarbaVlasov(FarbaVlasov.PLAVE_ROVNE);
        rod1.getDeti().add(dietaPomocne);//do rod1 sme pridali prve dieta
        
        // vytvorenie a nastavenie dietata 2 ClenRodiny
        dietaPomocne = new ClenRodiny();
        dietaPomocne.setMeno("Kira2");
        dietaPomocne.setPohlavie(Pohlavie.ZENA);
        dietaPomocne.setVek(-10);
        dietaPomocne.setVyska(112);
        dietaPomocne.setHmotnost(28);
        dietaPomocne.setFarbaVlasov(FarbaVlasov.CERVENE_KUCERAVE);
        rod1.getDeti().add(dietaPomocne);//do rod1 sme pridali druhe dieta

        // vytvorenie a nastavenie dietata 3 v ClenRodiny
        dietaPomocne = new ClenRodiny();
        dietaPomocne.setMeno("Adam");
        dietaPomocne.setPohlavie(Pohlavie.MUZ);
        dietaPomocne.setVek(18);
        dietaPomocne.setVyska(185);
        dietaPomocne.setHmotnost(75);
        dietaPomocne.setFarbaVlasov(FarbaVlasov.BLOND);
        rod1.getDeti().add(dietaPomocne);//do rod1 sme pridali tretie dieta
       
        // vypis rodiny 1 (na pozadi sa pouzije metoda toString z triedy Rodina)
        System.out.println("rod1" + rod1);

        // vytvorenie a naplnenie rodiny 2
        Rodina rod2;
        rod2 = new Rodina();
        rod2.setMatka(new ClenRodiny());
        
        rod2.setOtec(new ClenRodiny());
        rod2.setDeti(new ArrayList<>());//vytvorenie Listu deti v rod2
        rod2.getDeti().add(new ClenRodiny("filip",12));
        
        //rychly zapis vytvorenia dietata s menom filip,12 a jeho priradenie do  deti v rodine2.
        rod2.getDeti().add(new ClenRodiny( "oto", 5));//naplnenie cez konstruktor
        rod2.setNazovRodiny (" Timkovci ");
        rod2.setAdresa(" Omsenie 105, 91443 ");
        
        rod2.getMatka().setMeno(" Andrea ");
        rod2.getMatka().setPohlavie(Pohlavie.ZENA);
        rod2.getMatka().setVek(33);
        rod2.getMatka().setVyska(175);
        rod2.getMatka().setHmotnost(75);
        rod2.getMatka().setFarbaVlasov(FarbaVlasov.BLOND);
        
        rod2.getOtec().setMeno("Igor");
        rod2.getOtec().setPohlavie(Pohlavie.MUZ);
        rod2.getOtec().setVek(35);
        rod2.getOtec().setVyska(170);
        rod2.getOtec().setHmotnost(85);
        rod2.getOtec().setFarbaVlasov(FarbaVlasov.CIERNE);
        // vypis rodiny 2
        System.out.println("rod2" + rod2);

        // pole mien (pole sa oznacuje hranatymi zatvorkami [])
        String[] mena;
        mena = new String[8];
        mena[0] = "Miro";
        mena[1] = "Jana";
        mena[2] = "Matus";
        mena[3] = "Nasta";
        mena[4] = "Ondrej";
        mena[5] = "Jaro";
        mena[6] = "Brona";
        mena[7] = "Vlada";
        // vypis mien zostupne 4,3,2,1,0
        for (int i = 4; i >= 0; i--) {
            System.out.println(i + ". " + mena[i]);
            //vypisuje mena v opacnom poradi zostupne od 4,3,2,1,0 po 0 a ide o kolekciu cyklov
        }
        // vypis mien vzostupne 0,1,2,3,4
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ". " + mena[i]);//vypise vzostupne od 0 po cislo 4 mena. ak nedame do sout i+". "+ tak vypise len mena.
        }
        // vypis mien opat vzostupne, ale pojde az do dlzky pola (length)
        for (int i = 0; i < mena.length; i++) {
            System.out.println(i + ". " + mena[i]);//so slovom length sa vypise to same len bude cyklus fungovat pre akukolvek dlzku pola.        
        }

        // pole deti
        ClenRodiny[] deti;
        deti = new ClenRodiny[3]; // bude mat 3 prvky (0,1,2)
        // vytvorenie a naplnenie deti 0..2
        deti[0] = new ClenRodiny();
        deti[1] = new ClenRodiny();
        deti[2] = new ClenRodiny();
        deti[0].setMeno("Tomas");
        deti[1].setMeno("Linda");
        deti[2].setMeno("Nika");
        // vypis pola deti cez dvojbodkovy for
        for (ClenRodiny dieta : deti) {
            System.out.println(dieta);
        }

        // pole matiek
        ClenRodiny[] matky;
        matky = new ClenRodiny[1]; // bude mat 1 prvok
        matky[0] = new ClenRodiny();
        matky[0].setMeno("Lubica");
        matky[0].setVek(45);
        matky[0].setFarbaVlasov(FarbaVlasov.CERVENE_KUCERAVE);
        matky[0].setPohlavie(Pohlavie.ZENA);
        // vypis pola matiek cez dvojbodkovy for
        for (ClenRodiny zena : matky) {
            System.out.println(zena);
        }

        // pole otcov (obdobne ako pole matiek)
        ClenRodiny[] otcovia = new ClenRodiny[1];
        otcovia[0] = new ClenRodiny();
        otcovia[0].setMeno("OTO");
        otcovia[0].setOkuliare(true);
        otcovia[0].setPohlavie(Pohlavie.MUZ);
        otcovia[0].setHmotnost(102);
        for (ClenRodiny muz : otcovia) {
            System.out.println(muz);
        }

        // list mien (typ prvkov listu sa uvadza medzi < > (v nasom pripade to bude String, cize pole stringov)
        List<String> mena2;//zadefinovala som premnennu mena2,kt.je typu List v zozname a typu string
        mena2 = new ArrayList<>();//takto som vytvorila List pre pole
        mena2.add("f");//premennu mena sme naplnili tak,zeslovom add. pridavame do zoznamu prvky f,a,x.
        mena2.add("a");
        mena2.add("x");
        System.out.println(mena2.size());//sout pomocou size() nam vypise zo zoznamu jeho velkost.tak mame 3 prvky tam a teda vzpise 3
        mena2.add(1, "b");//pridala som prvok"b" na 1 poziciu do zoznamu
        System.out.println(mena2.size());//vypise mi  velkost zoznamu plus novy prvok cize predosly zozn.3 a +1=4
        mena2.remove("x");//slovom remove odoberiem zo zoznamu  prvok"x"
        mena2.remove(1);//tymto tu odoberam zo zoznamu prvok na 1 pozicii
        System.out.println(mena2.size());

        // list dustikov
        List<String> dusty;
        dusty = new ArrayList<>();
        dusty.add("d");
        dusty.add("y");
        System.out.println(dusty.size());
        dusty.get(0);
        dusty.get(1);
        System.out.println(dusty.get(0));
        dusty.add("d");
        System.out.println(dusty.size());

        // list tutuniek
        List<ClenRodiny> tutunky;//zalozena kolekcia tutunky
        tutunky = new ArrayList<>();
        ClenRodiny tutunka;//premenna zalozena na vyrobu prvkov tej kolekcie
        //vyrobenie prvej tutunky
        tutunka = new ClenRodiny();
        tutunka.setMeno("dusty");
        tutunka.setPohlavie(Pohlavie.MUZ);
        tutunky.add(tutunka);//pridanie prvej tutunky do listu
        //vyrobenie druhej tutunky
        tutunka = new ClenRodiny();
        tutunka.setMeno("stelinka");
        tutunky.add(tutunka);//vlozenie druhej tutunky do listu
        // vypis listu tutuniek cez dvojbodkovy for
        for (ClenRodiny pes : tutunky) {  //cykly nikdy nekoncia bodkociarkou ;
            System.out.println(pes);
        }

        // mapa koni
        Map<String, ClenRodiny> kone;
        kone = new HashMap<>();
        ClenRodiny kon;
        // vytvorenie a naplnenie 1.kona
        kon = new ClenRodiny();
        kon.setMeno("Lucifer");
        kone.put("766220/7245", kon);  // pridanie 1.kona
        // vypis mapy kone
        for (Entry<String, ClenRodiny> nejakeslovo : kone.entrySet()) {
            System.out.println(nejakeslovo.getKey());  //vypise kluc z danej dvojice kon a rodne cislo. cize vypise len rodne cislo to je nas kluc
            System.out.println(nejakeslovo.getValue());  //vypise value cize prvok z dvojice ktory bol vlozeny ku klucu key cez put.v nasom pripade to bolo meno kona "lucifer"
        }
        kone.remove("766220/7245");  // odstranie dvojice podla kluca
        // vypis mapy kone
        for (Entry<String, ClenRodiny> nejakeslovo : kone.entrySet()) {
            System.out.println(nejakeslovo.getKey());  //vypise kluc z danej dvojice kon a rodne cislo. cize vypise len rodne cislo to je nas kluc
            System.out.println(nejakeslovo.getValue());  //vypise value cize prvok z dvojice ktory bol vlozeny ku klucu key cez put.v nasom pripade to bolo meno kona "lucifer"
        }

        // tieto zatvorky tu musia byt (jedna uzatvara metodu main a druha triedu Starter)    
    }
}
