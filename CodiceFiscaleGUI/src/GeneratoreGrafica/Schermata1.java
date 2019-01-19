package GeneratoreGrafica;
import codicefiscale.CodiceGenerator;
import java.awt.*; 
import java.io.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.logging.*;

/**
 *
 * @author Stefano Valloncini
 */

public class Schermata1 extends JFrame
{   
    
    private JLabel labelNome, labelCognome, labelSesso, labelGiorno, labelMese, labelAnno, labelProvincia; 
    private JTextField fieldNome, fieldCognome, fieldGiorno, fieldAnno, fieldCodice, fieldProvincia;
    private JComboBox mesiTendina, sessoTendina;
    private JButton button1, bottonePulizia; 
    
    String[] mesi = {"", "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
    String[] sessi = {"", "M", "F"};
    
    // centra la finestra al momento dell'avvio
    
    public static void centreWindow(Window frame)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }   
    
    // costruttore, crea l'interfaccia del
    
    public Schermata1()
    {   
        // pannello principale (sottostante)
        JPanel pannello = new JPanel(new BorderLayout()); 
        pannello.setBackground(Color.WHITE);
        
        // Crazione del PannelloDescrizione
        JPanel pannelloDescrizione = new JPanel();
        pannelloDescrizione.setBackground(Color.WHITE);
        JLabel descrizione = new JLabel("Benvenuto nel calcolatore del Codice Fiscale!"); 
        descrizione.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
        descrizione.setForeground(new Color(238, 130, 238));
        pannelloDescrizione.add(descrizione);
        
        // Crazione del PannelloCentrale
        JPanel griglia1 = new JPanel();
        griglia1.setBackground(Color.WHITE);
        JPanel griglia = new JPanel(new GridLayout(8, 2, 0, 5));
        griglia.setBackground(Color.WHITE); 
        
        // Creazione del PannelloSottostante
        JPanel fondo1 = new JPanel();
        fondo1.setBackground(Color.WHITE);
        JPanel fondo = new JPanel(new GridLayout(2, 2)); 
        fondo.setBackground(Color.WHITE);
        
        // inserimento nome
        labelNome = new JLabel("                Nome:"); 
        labelNome.setForeground(Color.black);
        griglia.add(labelNome);
        
        fieldNome = new JTextField(15); 
        griglia.add(fieldNome); 
        
        // inserimento cognome
        labelCognome = new JLabel("                Cognome:"); 
        labelCognome.setForeground(Color.black);
        griglia.add(labelCognome);
        
        fieldCognome = new JTextField(15); 
        griglia.add(fieldCognome);
        
        // inserimento sesso
        labelSesso = new JLabel("                Sesso: "); 
        labelSesso.setForeground(Color.black);
        griglia.add(labelSesso);
        
        sessoTendina = new JComboBox(sessi);
        griglia.add(sessoTendina);
        
        // inserimento provincia
        labelProvincia = new JLabel("                Comune: "); 
        labelProvincia.setForeground(Color.black);
        griglia.add(labelProvincia); 
        fieldProvincia = new JTextField(15); 
        griglia.add(fieldProvincia);
        
        // inserimento giorno
        labelGiorno = new JLabel("                Giorno: "); 
        labelGiorno.setForeground(Color.black);
        griglia.add(labelGiorno); 
        
        fieldGiorno = new JTextField(15); 
        griglia.add(fieldGiorno);
        
        // inserimento mese
        labelMese = new JLabel("                Mese: "); 
        griglia.add(labelMese); 
        labelMese.setForeground(Color.black);
        
        mesiTendina = new JComboBox(mesi);
        griglia.add(mesiTendina);
        
        // inserimento anno
        labelAnno = new JLabel("                Anno: "); 
        griglia.add(labelAnno); 
        labelAnno.setForeground(Color.black);
        
        fieldAnno = new JTextField(15); 
        griglia.add(fieldAnno);
        
        // bottone per l'ottenimento del codice
        button1 = new JButton("Calcola il codice fiscale!"); 
       
        // codice fiscale
        fieldCodice = new JTextField(20);
        fieldCodice.setEditable(false); 
        
        bottonePulizia = new JButton("Pulisci"); 
        
        
        griglia1.add(griglia); 
        
        // ------------------------> Fine Griglia
        
        /*
        Evento: è in continua attesa che il pulsante venga premuto, in tal momento
                esso svolge una serie di azioni (genera il codice fiscale).
        */
        event e1 = new event(); 
        button1.addActionListener(e1);
        
        pulizia e2 = new pulizia(); 
        bottonePulizia.addActionListener(e2);
        
        /*
        Evento: è in continua attesa che il pulsante venga premuto, in tal momento
                esso svolge una serie di azioni (pulisce i campi di testo).
        */
        
        fondo.add(fieldCodice);
        fondo.add(button1); 
        fondo1.add(bottonePulizia); 
        fondo1.add(fondo);
    
        pannello.add(pannelloDescrizione,BorderLayout.NORTH);
        pannello.add(griglia1,BorderLayout.CENTER);
        pannello.add(fondo1, BorderLayout.SOUTH);
        add(pannello);
  
    }
    
    public class pulizia implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            fieldNome.setText("");
            fieldCognome.setText("");
            fieldProvincia.setText(""); 
            fieldGiorno.setText("");
            fieldAnno.setText("");
            fieldCodice.setText("");
            sessoTendina.setSelectedIndex(0);
            mesiTendina.setSelectedIndex(0);
        }
    }
    
    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {   
            CodiceGenerator CODICEFISCALE = new CodiceGenerator(); 
            
            
            // prende i dati dalle caselle di testo
            String nome = fieldNome.getText(); 
            String cognome = fieldCognome.getText(); 
            String giorno = fieldGiorno.getText();
            String mese = (String) mesiTendina.getSelectedItem(); 
            String anno = fieldAnno.getText(); 
            String provincia = fieldProvincia.getText(); 
            String sesso = (String) sessoTendina.getSelectedItem();
            
            if(nome.length() > 0 && cognome.length() > 0 && giorno.length() > 0 && mese.length() > 0 && anno.length() > 0 && sesso.length() > 0)
            {
                try 
                {   
                    String codicefiscale = CODICEFISCALE.creaOggetti(nome, cognome, giorno, mese, anno, provincia, sesso);
                    BufferedWriter writer = new BufferedWriter(new FileWriter("codicifiscali.txt", true)); // con true non elimina il contenuto ogni volta che viene aggiunto qualcosa
                    
                    String nome_temp = nome.toUpperCase(); 
                    nome = nome_temp.substring(0, 1) + nome.substring(1);
                    
                    String cognome_temp = cognome.toUpperCase(); 
                    cognome = cognome_temp.substring(0, 1) + cognome.substring(1); 
                    
                    writer.write(nome + " " + cognome + ": " + codicefiscale);
                    writer.newLine();
                    
                    fieldCodice.setHorizontalAlignment(JTextField.CENTER);
                    fieldCodice.setText(codicefiscale); 
                    fieldCodice.setBackground(new Color(238, 130, 238));
                    
                    writer.close(); 
                } 
                catch (IOException ex)
                {
                    Logger.getLogger(Schermata1.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
}
