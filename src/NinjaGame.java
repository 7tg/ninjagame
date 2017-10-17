
import java.util.Random;
import java.util.Scanner;



public class NinjaGame {
  
    public static void fight(Ninja ninjas[])
    {
       Random rn = new Random();
       int damage;
        for (int i = 0; true ;i++)
        {
        System.out.println();
            System.out.println("Round :"+(i+1)+" is starting!");
        do{
            
//1. to 2.
            System.out.println(ninjas[0].name+" is attacking "+ninjas[1].name);
            ninjas[1].healt -= (damage = (rn.nextInt(10)+1));
           System.out.println(ninjas[0].name+" gave "+damage+" damage to "+ninjas[1].name+"(Reamaing :"+ninjas[1].healt+")");
            if(ninjas[1].healt <= 0)
                break;
//2. to 1.
           System.out.println(ninjas[1].name+" is attacking "+ninjas[0].name);
            ninjas[0].healt -= (damage = (rn.nextInt(10)+1));
           System.out.println(ninjas[1].name+" gave "+damage+" damage to "+ninjas[0].name+"(Reamaing :"+ninjas[0].healt+")");
           if(ninjas[1].healt <= 0)
                break;
        }while(ninjas[0].healt >= 0 && ninjas[1].healt >= 0);
        if(ninjas[0].healt <= 0)
        {
            System.out.println(ninjas[1].name+" won round "+(i+1)+"!");
            ninjas[1].winPoint += 1;
        }else if (ninjas[1].healt <= 0)
        {
            System.out.println(ninjas[0].name+" won round "+(i+1)+"!");
            ninjas[0].winPoint += 1;
        }
        else if (ninjas[0].healt == 0 && ninjas[1].healt == 0)
        {
            System.out.println("Round draw !");
        }
        if(ninjas[0].winPoint >= 3)
        {
            System.out.println();
            System.out.println(ninjas[0].name+" hava 3 win point !!");
            break;
        }else if (ninjas[1].winPoint >= 3)
        {
            System.out.println();
            System.out.println(ninjas[1].name+" hava 3 win point !!");
            break;
        }
       ninjas[0].healt = 20;
        ninjas[1].healt = 20;  
        }
        
    
    }

    
    public static void main(String[] args) {
      
        System.out.println("Welcome to the game 'Ninjas'");
        System.out.println("-------------------------------");
        //
        Ninja[] ninjas = new Ninja[2];
        //
        for ( int i=0; i<ninjas.length; i++) 
        {
            ninjas[i]=new Ninja();
        }
       //
         for (int i=0; i<ninjas.length; i++) 
        {
        System.out.println((i+1)+".Ninja:");
        System.out.println("Name : "+ninjas[i].name);
        System.out.println("Healt : "+ninjas[i].healt);
        System.out.println("");
        }
        fight(ninjas);
        

        
    }
    
}
