package GeneratoreGrafica;
import java.awt.*; 
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*; 
import java.util.Scanner; 
/**
 *
 * @author xStevatt
 */
public class Lista extends JFrame
{   
    private JTextArea text; 
    
    public static void centreWindow(Window frame)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }  
    
    public Lista() throws FileNotFoundException
    {   
        JPanel pannelloprincipale = new JPanel(new BorderLayout()); 
        pannelloprincipale.setBackground(new Color(238, 130, 238));
        
        JPanel descrizione = new JPanel(); 
        descrizione.setBackground(new Color(238, 130, 238));
        
        JPanel lista = new JPanel(); 
        lista.setBackground(new Color(238, 130, 238));
        
        JLabel titolo = new JLabel("Lista dei codici fiscali: "); 
        titolo.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 30));
        descrizione.add(titolo); 
        
        text = new JTextArea(); 
        text.setEditable(false);
        text.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 15));
        text.setBackground(new Color(238, 130, 238));
        mostraLista();
        
        lista.add(text); 
        
        pannelloprincipale.add(descrizione, BorderLayout.NORTH); 
        pannelloprincipale.add(lista, BorderLayout.CENTER);
        add(pannelloprincipale);
    }
    
    public void mostraLista() throws FileNotFoundException
    {
        Scanner reader = new Scanner(new File("codicifiscali.txt")); 
        
        String line = ""; 
        
        while(reader.hasNext())
        {
            line = reader.nextLine(); 
            text.append(line + "\n");
        }
    }
}
