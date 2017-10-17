import java.util.Random;
import java.util.Scanner;

public class Ninja {
    
String[] Names = {
"Alald","Alan","Alar","Alarik","Alarke","Alarne","Aleld","Alen","Alens","Aler","Alik","Alis","Alorn"
,"Asgald","Asgan","Asgar","Asgarik","Asgarke","Asgarne","Asgeld","Asgen","Asgens","Asger","Asgik","Asgis","Asgorn",
"Bjald","Bjan","Bjar","Bjarik","Bjarke","Bjarne","Bjeld","Bjen","Bjens","Bjer","Bjik","Bjis","Bjorn",
"Erald","Eran","Erar","Erarik","Erarke","Erarne","Ereld","Eren","Erens","Erer","Erik","Eris","Erorn",
"Fenrald","Fenran","Fenrar","Fenrarik","Fenrarke","Fenrarne","Fenreld","Fenren","Fenrens","Fenrer","Fenrik","Fenris","Fenrorn",
"Harald","Haran","Harar","Hararik","Hararke","Hararne","Hareld","Haren","Harens","Harer","Harik","Haris","Harorn",
"Ingmald","Ingman","Ingmar","Ingmarik","Ingmarke","Ingmarne","Ingmeld","Ingmen","Ingmens","Ingmer","Ingmik","Ingmis","Ingmorn",
"Jurgald","Jurgan","Jurgar","Jurgarik","Jurgarke","Jurgarne","Jurgeld","Jurgen","Jurgens","Jurger","Jurgik","Jurgis","Jurgorn",
"Kjald","Kjan","Kjar","Kjarik","Kjarke","Kjarne","Kjeld","Kjen","Kjens","Kjer","Kjik","Kjis","Kjorn",
"Mojald","Mojan","Mojar","Mojarik","Mojarke","Mojarne","Mojeld","Mojen","Mojens","Mojer","Mojik","Mojis",
"Mojorn","Sorald","Soran","Sorar","Sorarik","Sorarke","Sorarne","Soreld","Soren","Sorens","Sorer","Sorik","Soris","Sororn",
"Torbald","Torban","Torbar","Torbarik","Torbarke","Torbarne","Torbeld","Torben","Torbens","Torber","Torbik","Torbis","Torborn",
"Ulrald","Ulran","Ulrar","Ulrarik","Ulrarke","Ulrarne","Ulreld","Ulren","Ulrens","Ulrer","Ulrik","Ulris"
};
    
    
    Random rn = new Random();
    public String name = Names[rn.nextInt(168)];
    public int healt = 20;
    public int winPoint = 0; 


}
