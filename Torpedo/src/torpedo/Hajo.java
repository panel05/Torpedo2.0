
package torpedo;

import java.util.Scanner;

public class Hajo {
   private static int[] pozicio = new int[3];
   private static int lovesDb = 0;
     
   public static String talalat(int poz){
       for (int i = 0; i < pozicio.length; i++) {
           if(Loves() == pozicio[i]){
               System.out.println("talált");
            }else{
               System.out.println("Nem talált");
           }
       }
    lovesDb++;
    return null;
}
   public Hajo(int [] pozicio){
       int helyzet = (int)(Math.random())*5;
       pozicio[0]= helyzet;
       pozicio[1]= helyzet+1;
       pozicio[2]= helyzet+2;
   }
   
   public static int Loves(){
      Scanner sc = new Scanner(System.in);
       System.out.println("Lövés: ");
       int loves = sc.nextInt();
       return loves;
   }
   
}

