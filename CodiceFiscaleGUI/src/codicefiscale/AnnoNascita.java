package codicefiscale;

/**
 *
 * @author Stefano Valloncini
 */

public class AnnoNascita 
{   
    public String workOnAnno(String anno_completo)
    {
        String cifre_anno = ""; 
        
        cifre_anno += anno_completo.charAt(2); 
        cifre_anno += anno_completo.charAt(3);
        
        return cifre_anno; 
    }
}
