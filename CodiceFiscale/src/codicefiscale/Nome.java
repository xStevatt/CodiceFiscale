package codicefiscale;
import java.util.Scanner; 

/**
 *
 * @author Stefano Valloncini
 */
public class Nome 
{   
    Scanner sc = new Scanner(System.in); 
    
    private String nome = ""; 
    
    private final char[] consonantinome = new char[100];     
    private final char[] vocalinome = new char[100];
    private final char[] codicefiscale = new char[3]; 
    private int sizeconsonantinome = 0; 
    private int sizevocalinome = 0; 
    private int sizecodice = 0; 
    
    private final String cifrenome = "";    
    
    public String doStuff()
    {
        askNome();
        workOnNome();
        
        return getCifre(); 
    }
    
    public String getCifre()
    {
        String cifrenome = String.copyValueOf(codicefiscale);
        
        return cifrenome; 
    }

    public String getNome() {
        return nome;
    }
    
    public void askNome()
    {   
        System.out.print("Inserire il nome: ");
        do
        {
            nome = sc.nextLine(); 
            nome = nome.toUpperCase(); 
            nome = nome.replaceAll("\\s+","");
                if(nome.length() <= 0)
                    System.out.println("Inserire un nome valido: ");
        }while(nome.length() <= 0);
    }
    
    public void workOnNome()
    {
        for(int i = 0; i < nome.length(); i++)
        {
            if(nome.charAt(i) != 'A' && nome.charAt(i) != 'E' && nome.charAt(i) != 'I' && nome.charAt(i) != 'O' && nome.charAt(i) != 'U')
            {   
                consonantinome[sizeconsonantinome] = nome.charAt(i); 
                ++sizeconsonantinome;
            }
            else
            {
                vocalinome[sizevocalinome] = nome.charAt(i); 
                ++sizevocalinome; 
            }
        }
        
        if(sizeconsonantinome >= 4)
        {
            codicefiscale[sizecodice] = consonantinome[0]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = consonantinome[2]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = consonantinome[3]; 
            ++sizecodice; 
        }
        
        if(sizeconsonantinome == 3)
        {
            codicefiscale[sizecodice] = consonantinome[0]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = consonantinome[1]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = consonantinome[2]; 
            ++sizecodice; 
        }
        
        else if(sizeconsonantinome == 2 && sizevocalinome >= 1)
        {
            codicefiscale[sizecodice] = consonantinome[0]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = consonantinome[1]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = vocalinome[0]; 
            ++sizecodice; 
        }
        
        else if(sizeconsonantinome == 2 && sizevocalinome == 0)
        {
            codicefiscale[sizecodice] = consonantinome[0]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = consonantinome[1]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = 'X';  
            ++sizecodice; 
        }
        
        else if(sizeconsonantinome == 1 && sizevocalinome == 0)
        {
            codicefiscale[sizecodice] = consonantinome[0]; 
            ++sizecodice; 
            codicefiscale[sizecodice] = 'X';  
            ++sizecodice; 
            codicefiscale[sizecodice] = 'X';  
            ++sizecodice; 
        }
        
        else if(sizeconsonantinome == 0 && sizevocalinome == 3)
        {
            codicefiscale[sizecodice] = vocalinome[0]; 
            ++sizecodice;
            codicefiscale[sizecodice] = vocalinome[1]; 
            ++sizecodice;
            codicefiscale[sizecodice] = vocalinome[2]; 
            ++sizecodice;
        }
        
        else if(sizeconsonantinome == 1 && sizevocalinome == 1)
        {
            codicefiscale[sizecodice] = consonantinome[0]; 
            ++sizecodice;
            codicefiscale[sizecodice] = vocalinome[0];  
            ++sizecodice;
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice;
        }
        
        else if(sizeconsonantinome == 0 && sizevocalinome == 2)
        {
            codicefiscale[sizecodice] = vocalinome[0]; 
            ++sizecodice;
            codicefiscale[sizecodice] = vocalinome[1];
            ++sizecodice;
            codicefiscale[sizecodice] = 'X'; 
            ++sizecodice;
        }
    }   
}
