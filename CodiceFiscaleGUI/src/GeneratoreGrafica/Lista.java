package GeneratoreGrafica;

import java.awt.*; 
import java.awt.event.*;
import java.io.*;
import javax.swing.*; 
import java.util.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author xStevatt
 */
public class Lista extends JFrame
{   
    private JTextArea text; 
    private String linguaProgramma = ""; 
    private JLabel titolo; 
    
    public static void centreWindow(Window frame)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }  
    
    public Lista(String linguaProgramma) throws FileNotFoundException
    {   
        this.linguaProgramma = linguaProgramma; 
        
        JPanel pannelloprincipale = new JPanel(new BorderLayout()); 
        pannelloprincipale.setBackground(new Color(238, 130, 238));
        
        JPanel descrizione = new JPanel(); 
        descrizione.setBackground(new Color(238, 130, 238));
        
        JPanel lista = new JPanel(new BorderLayout()); 
        lista.setBackground(new Color(238, 130, 238));
        
        titolo = new JLabel("Lista dei codici fiscali: "); 
        titolo.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 30));
        descrizione.add(titolo); 
        
        JButton bottonePulizia = new JButton("Canc"); 
        
        bottonePulizia.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
              PrintWriter writer = null; 
                try {
                    writer = new PrintWriter(new File("codicifiscali.txt"));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Lista.class.getName()).log(Level.SEVERE, null, ex);
                }
                
              writer.write("I codici verrano salvati qui: \n");
            }
        });
        
        lista.add(bottonePulizia, BorderLayout.SOUTH);
        
        text = new JTextArea(); 
        text.setEditable(false);
        text.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 15));
        text.setBackground(new Color(238, 130, 238));
        mostraLista();
        
        lista.add(text); 
        
        pannelloprincipale.add(descrizione, BorderLayout.NORTH); 
        pannelloprincipale.add(lista, BorderLayout.CENTER);
        add(pannelloprincipale);
        
        setLabels();
    }
    
    public void setLabels()
    {
        if(linguaProgramma.equalsIgnoreCase("italian"))
            titolo.setText("Lista dei codici fiscali: ");
        if(linguaProgramma.equalsIgnoreCase("english"))
            titolo.setText("List of the Fiscal Codes: ");
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
