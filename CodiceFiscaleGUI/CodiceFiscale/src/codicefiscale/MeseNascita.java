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

    public String workOnMese(String mesenascita)
    {   
        String codicefiscale = ""; 
        
        if(mesenascita.equalsIgnoreCase("Gennaio"))
        {
            codicefiscale = "A"; 
        }
        if(mesenascita.equalsIgnoreCase("Febbraio"))
        {
            codicefiscale = "B"; 
        }
        if(mesenascita.equalsIgnoreCase("Marzo"))
        {
            codicefiscale = "C"; 
        }
        if(mesenascita.equalsIgnoreCase("Aprile"))
        {
            codicefiscale = "D"; 
        }
        if(mesenascita.equalsIgnoreCase("Maggio"))
        {
            codicefiscale = "E"; 
        }
        if(mesenascita.equalsIgnoreCase("Giugno"))
        {
            codicefiscale = "H"; 
        }
        if(mesenascita.equalsIgnoreCase("Luglio"))
        {
            codicefiscale = "L";
        }
        if(mesenascita.equalsIgnoreCase("Agosto"))
        {
            codicefiscale = "M"; 
        }
        if(mesenascita.equalsIgnoreCase("Settembre"))
        {
            codicefiscale = "P"; 
        }
        if(mesenascita.equalsIgnoreCase("Ottobre"))
        {
            codicefiscale = "R"; 
        }
        if(mesenascita.equalsIgnoreCase("Novembre"))
        {
            codicefiscale = "S"; 
        }
        if(mesenascita.equalsIgnoreCase("Dicembre"))
        {
            codicefiscale = "T"; 
        }
        
        return codicefiscale; 
    }
}
