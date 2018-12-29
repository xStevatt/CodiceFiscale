package codicefiscale;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

/**
 *
 * @author Stefano Valloncini
 */

public class CodiceComune
{   
    Scanner sc = new Scanner(System.in); 
    
    public String doStuff() throws FileNotFoundException
    {
        String cifrecomune = workOnCodice(askComune()); 
        return cifrecomune; 
    }
       
    public String askComune()
    {   
        String comune = ""; 
        
        System.out.print("Insere il comune di nascita: ");
        while(comune.length() <= 0)
        {
            comune = sc.nextLine();
            
            if(comune.length() <= 0)
                System.out.print("Inserire un comune valido: ");
        }
            
       return comune; 
    }
    
    public String workOnCodice(String comune) throws FileNotFoundException
    {   
        // metodo che ricerca nel file il comune
        
        Scanner reader = new Scanner(new File("codici_catastali.txt")); 
        
        comune = " " + comune + " "; 
        comune = comune.toUpperCase(); 
        
        while(reader.hasNext())
        {
            String temp = reader.nextLine(); 
            
            if(temp.contains(comune))
            {   
                return temp.substring(0, 5); 
            }
        }

        return null; 
    }
}
