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
