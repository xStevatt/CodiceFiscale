package codicefiscale;
import java.util.Scanner; 

/**
 *
 * @author Stefano Valloncini
 */
public class AnnoNascita 
{   
    Scanner sc = new Scanner(System.in); 
    
    String anno = ""; 
    private char[] codicefiscale = new char[2]; 
    private int sizecodice = 0; 
    
    private String cifreanno = ""; 
    
    public String doStuff()
    {
        askAnno();
        workOnAnno();
        
        return cifreAnno();
    }
    
    public String cifreAnno()
    {
        cifreanno = String.copyValueOf(codicefiscale); 
        
        return cifreanno; 
    }

    public String getAnno() {
        return anno;
    }

    
    public void askAnno()
    {
        do
        {
            System.out.print("Inserire l'anno di nascita: ");
            anno = sc.nextLine(); 
            if(Integer.parseInt(anno) < 1900)
                System.out.println("Inserire un anno di nascita valido, perfavore!");
        }while(Integer.parseInt(this.anno) < 1900); 
    }
    
    public void workOnAnno()
    {
        codicefiscale[sizecodice] = anno.charAt(2); 
        ++sizecodice; 
        codicefiscale[sizecodice] = anno.charAt(3);
        ++sizecodice;
    }
}
