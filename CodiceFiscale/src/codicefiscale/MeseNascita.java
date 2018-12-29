package codicefiscale;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

/**
 *
 * @author xStevatt
 */
public class MeseNascita
{   
    Scanner sc = new Scanner(System.in); 
    
    private String mesenascita = ""; 
    private char[] codicefiscale = new char[1];
    private int sizecodice = 0; 
    
    private String cifremese = ""; 
    
    public String doStuff() throws IOException
    {   
        askMeseNascita();
        workOnMese();
        return getCifre(); 
    }
    
    public String getCifre()
    {   
        cifremese = String.copyValueOf(codicefiscale); 
        return cifremese; 
    }

    public String getMesenascita() {
        return mesenascita;
    }
    
    
    
    public void askMeseNascita() throws IOException
    {   
        
        do
        {
            System.out.print("Inserire il mese di nascita: ");
                mesenascita = sc.nextLine(); 
            if(Integer.parseInt(mesenascita) > 12 || Integer.parseInt(mesenascita) < 0)
                System.out.println("Inserire un valore valido!");
        }while(Integer.parseInt(mesenascita) < 1 || Integer.parseInt(mesenascita) > 12);
    }
    
    public void workOnMese()
    {
        if(Integer.parseInt(mesenascita) == 1)
        {
            codicefiscale[sizecodice] = 'A'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 2)
        {
            codicefiscale[sizecodice] = 'B'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 3)
        {
            codicefiscale[sizecodice] = 'C'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 4)
        {
            codicefiscale[sizecodice] = 'D'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 5)
        {
            codicefiscale[sizecodice] = 'E'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 6)
        {
            codicefiscale[sizecodice] = 'H'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 7)
        {
            codicefiscale[sizecodice] = 'L'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 8)
        {
            codicefiscale[sizecodice] = 'M'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 9)
        {
            codicefiscale[sizecodice] = 'P'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 10)
        {
            codicefiscale[sizecodice] = 'R'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 11)
        {
            codicefiscale[sizecodice] = 'S'; 
            ++sizecodice;
        }
        if(Integer.parseInt(mesenascita) == 12)
        {
            codicefiscale[sizecodice] = 'T'; 
            ++sizecodice;
        }
    }
}
