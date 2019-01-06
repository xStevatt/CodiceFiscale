package GeneratoreGrafica;
import java.awt.*; 
import javax.swing.JFrame;

/**
 * @author xStevatt
 */

public class CodiceFiscale 
{
    public static void main(String[] args) 
    {   
        Schermata1 gui = new Schermata1(); 
        
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 350);
        gui.centreWindow(gui);
        gui.setResizable(false);
        gui.setTitle("CodiceFiscale | Stefano Valloncini | 4CI - 2018/2019");
        gui.setVisible(true);
    }
}
