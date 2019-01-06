package codicefiscale;

import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.Scanner;   
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Stefano Valloncini
 */

// MAIN CLASS

public class CodiceFiscale 
{
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException 
    {   
        Scanner sc = new Scanner(System.in); 
        byte scelta = 0; 
        String scelta2 = ""; 
        
        do
        {
        System.out.println("\nBenvenuto nel calcolatore del codice fiscale.");
        System.out.println("***********************************");
        System.out.println("* " + "1. Calcolare il codice fiscale " + " *");
        System.out.println("* " + "2. Copyright                   " + " *");
        System.out.println("* " + "0. Terminare il programma " + "      *");
        System.out.println("***********************************");
        
        System.out.print("Scelta: ");
        
        do
        {   
           while(true)
           {
               try
               {
                   scelta = Byte.parseByte(sc.next()); 
                   break; 
               }
               catch(NumberFormatException ignore)
               {
                   System.out.print("Input Invalido!\nScelta: ");
               } 
           }
           if(scelta > 3 || scelta < 0)
                System.out.print("Scelta: ");
        }while(scelta > 3 || scelta < 0); 
        
        System.out.println();
        
        switch(scelta)
        {
            case 1: 
                
                CodiceGenerator CODICEFISCALE = new CodiceGenerator(); 
                CODICEFISCALE.creaOggetti();
                break; 
            case 2: 
                System.out.println("Made by Stefano Valloncini\nAnno Scolastico 2018-2019\nChiunque venga sgamato a copiare da questo programma, verrà diretto in presidenza.");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Capito? :D\n");
                TimeUnit.SECONDS.sleep(2);
                break; 
            default: 
                System.out.println("\n\n\n\n\n\n\n\n\nGrazie per aver utilizzato questo programma, e arrivederci!");                
        }        
        
        if(scelta != 0)
        {
            
            // TimeUnit.SECONDS.sleep(0);
            do
            {   
                System.out.print("Vuoi utilizzare ancora questo programma [S/N]: ");
                    scelta2 = sc.next();
            }while(!scelta2.equalsIgnoreCase("s") && !scelta2.equalsIgnoreCase("n")); 
        }
        
        if(scelta2.equalsIgnoreCase("n"))
                System.out.println("\n\n\n\n\n\n\n\n\nGrazie per aver utilizzato questo programma, e arrivederci!");
        
        }while(!scelta2.equalsIgnoreCase("N") && scelta != 0); 
    }
}
