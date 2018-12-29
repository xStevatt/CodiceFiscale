package codicefiscale;
import java.util.Scanner; 

/**
 *
 * @author xStevatt
 */
public class Cognome
{
    Scanner sc = new Scanner(System.in); 
    
    private String cognome = ""; 
    
    private char[] cosonanticognome = new char[100];     
    private char[] vocalicognome = new char[100];
    private char[] codicefiscale = new char[3]; 
    private int sizeconsonanticognome = 0; 
    private int sizevocalicognome = 0; 
    private int sizecodice = 0; 
    
    private String cifrecognome = ""; 
    
    public String doStuff()
    {
        askCognome();
        workOnCognome();
        
        return getCifre();
    }
   
    public void askCognome()
    {   
        System.out.print("Inserire il cognome: ");
        do
        {
            cognome = sc.nextLine(); 
            cognome = cognome.toUpperCase(); 
            cognome = cognome.replaceAll("\\s+","");
            if(cognome.length() <= 0)
                System.out.print("Inserire un cognome valido: ");
        }while(cognome.length() <= 0);
    }
    
    public String getCifre()
    {   
        cifrecognome = String.copyValueOf(codicefiscale);
        return cifrecognome; 
    }

    public String getCognome() {
        return cognome;
    }
    
    
    
    public void workOnCognome()
    {
        for(int i = 0; i < cognome.length(); i++)
        {
            if(cognome.charAt(i) != 'A' && cognome.charAt(i) != 'E' && cognome.charAt(i) != 'I' && cognome.charAt(i) != 'O' && cognome.charAt(i) != 'U')
            {   
                cosonanticognome[sizeconsonanticognome] = cognome.charAt(i); 
                ++sizeconsonanticognome;
            }
            else
            {
                vocalicognome[sizevocalicognome] = cognome.charAt(i); 
                ++sizevocalicognome; 
            }
        }
        
        if(sizeconsonanticognome >= 3)
        {
            for(int i = 0; i < 3; i++)
            {
                codicefiscale[sizecodice] = cosonanticognome[i]; 
                ++sizecodice;
            }
        }
        
        if(sizeconsonanticognome == 2 && sizevocalicognome > 0)
        {   
            codicefiscale[sizecodice] = cosonanticognome[0];
            ++sizecodice; 
            codicefiscale[sizecodice] = cosonanticognome[1];
            ++sizecodice; 
            codicefiscale[sizecodice] = vocalicognome[0];
            ++sizecodice;
        }
        
        if(sizeconsonanticognome == 1 && sizevocalicognome == 1)
        {
            codicefiscale[sizecodice] = cosonanticognome[0];
            ++sizecodice; 
            codicefiscale[sizecodice] = vocalicognome[0];
            ++sizecodice;
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice; 
        }
        
        if(sizeconsonanticognome == 2 && sizevocalicognome == 0)
        {   
            codicefiscale[sizecodice] = cosonanticognome[0];
            ++sizecodice; 
             codicefiscale[sizecodice] = cosonanticognome[0];
            ++sizecodice; 
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice; 
        }
        
        if(sizeconsonanticognome == 1 && sizevocalicognome == 0)
        {   
            codicefiscale[sizecodice] = cosonanticognome[0];
            ++sizecodice; 
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice; 
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice; 
        }
        
        if(sizeconsonanticognome == 1 && sizevocalicognome >= 2)
        {
            codicefiscale[sizecodice] = cosonanticognome[0];
            ++sizecodice;
            codicefiscale[sizecodice] = vocalicognome[0];
            ++sizecodice;
            codicefiscale[sizecodice] = vocalicognome[1];
            ++sizecodice;
        }
        
        if(sizeconsonanticognome == 0 && sizevocalicognome >= 3)
        {
            codicefiscale[sizecodice] = vocalicognome[0];
            ++sizecodice;
            codicefiscale[sizecodice] = vocalicognome[1];
            ++sizecodice;
            codicefiscale[sizecodice] = vocalicognome[2];
            ++sizecodice;
        }
        
        if(sizeconsonanticognome == 0 && sizevocalicognome == 2)
        {
            codicefiscale[sizecodice] = vocalicognome[0];
            ++sizecodice;
            codicefiscale[sizecodice] = vocalicognome[1];
            ++sizecodice;
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice;
        }
        
        if(sizeconsonanticognome == 0 && sizevocalicognome == 1)
        {
            codicefiscale[sizecodice] = vocalicognome[0];
            ++sizecodice;
            codicefiscale[sizecodice] = 'X';
            ++sizecodice;
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice;
        }
    }
}
