package codicefiscale;
import java.util.Scanner; 
import java.io.IOException;

/**
 *
 * @author xStevatt
 */
public class GiornoNascita 
{
    Scanner sc = new Scanner(System.in); 
    
    private String giornonascita = ""; 
    private char[] codicefiscale = new char[2]; 
    private int sizecodice = 0; 
    private String sesso = "";
    
    private String cifregiorno = ""; 
    
    public String doStuff() throws IOException
    {
        askGiornoNascita();
        workOnGiorno();
        
        return getCifreGiorno(); 
    }
    
    public String getCifreGiorno()
    {   
        cifregiorno = String.copyValueOf(codicefiscale);
        return cifregiorno; 
    }

    public String getGiornonascita() {
        return giornonascita;
    }

    public String getSesso() {
        return sesso;
    }
    
    
    public void askGiornoNascita() throws IOException
    {   
        System.out.print("Inserire il giorno di nascita: ");
        do
        {
            giornonascita = sc.nextLine(); 
            if(Integer.parseInt(giornonascita) > 31)
                System.out.println("Inserire un giorno di nascita valido, perfavore!");
        }while(Integer.parseInt(giornonascita) > 31 || Integer.parseInt(giornonascita) <= 0); 
        
    }
    
    public String askSesso() throws IOException
    {   
         

        System.out.print("Inserire il sesso: ");
        do
        {   
            sesso = sc.nextLine();
            if(sesso.equalsIgnoreCase("M") == false && sesso.equalsIgnoreCase("F") == false)
                System.out.print("Perfavore inserire un sesso valido: ");
        }while(sesso.equalsIgnoreCase("M") == false && sesso.equalsIgnoreCase("F") == false); 
        
        return sesso; 
    }
    
    public void workOnGiorno() throws IOException
    {   
        String sesso = this.askSesso(); 
        
        if(sesso.equals("F") || sesso.equals("f"))
        {   
            int totalegiorni = Integer.parseInt(giornonascita) + 40; 
            codicefiscale[sizecodice] = Integer.toString(totalegiorni).charAt(0); 
            ++sizecodice; 
            codicefiscale[sizecodice] = Integer.toString(totalegiorni).charAt(1); 
            ++sizecodice; 
        }
        
        else
        {
            if(Integer.parseInt(giornonascita) > 10)
            {
                codicefiscale[sizecodice] = giornonascita.charAt(0); 
                ++sizecodice; 
                codicefiscale[sizecodice] = giornonascita.charAt(1); 
                ++sizecodice; 
            }
            
            else
            {
                codicefiscale[sizecodice] = '0'; 
                ++sizecodice; 
                codicefiscale[sizecodice] = giornonascita.charAt(0); 
                ++sizecodice; 
            }
        }
    }
}
