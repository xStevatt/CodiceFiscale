/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codiceinverso;

import java.util.Scanner;

/**
 *
 * @author xStevatt
 */
public class CodiceInverso 
{   
    private String codicefiscale; 

    public CodiceInverso(String codicefiscale) 
    {
        this.codicefiscale = codicefiscale;
    }

    public String trovaNome()
    {
        return codicefiscale.substring(0, 4); 
    }
    
    public String trovaCognome()
    {
        return codicefiscale.substring(4, 8); 
    }
    
    public String trovaAnno()
    {   
        String anno = ""; 
        
        if(Integer.parseInt(codicefiscale.substring(8, 11)) > 20)
            return "20" + codicefiscale.substring(8, 11); 
        else
            return "19" + codicefiscale.substring(8, 11); 
    }
    
    public String trovaGiorno()
    {
        if(Integer.parseInt(codicefiscale.substring(11, 12)) > 31)
        {
            int temp = Integer.parseInt(codicefiscale.substring(11, 12)) - 40; 
            return String.valueOf(temp);
        }
        else
            return codicefiscale.substring(11, 13); 
    }
    
    public String trovaMese()
    {   
        String mese = ""; 
        switch(codicefiscale.charAt(12))
        {
            case 'A': 
                break; 
            case 'B': 
                break;
            case 'C': 
                break;
            case 'D': 
                break; 
        }
        return mese;
    }
}
