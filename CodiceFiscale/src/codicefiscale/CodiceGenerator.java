package codicefiscale;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author xStevatt
 */
public class CodiceGenerator
{   
    String cognomeText, nomeText, annoText, meseText, giornoText, sessoText, provinciaText; 
    String codicefiscale; 
    
    public void creaOggetti() throws FileNotFoundException, IOException 
    {   
        // questo metodo crea gli oggetti, ognuno dei quali rappresenta una parte del codice fiscale
        // salva in una variabile nome, cognome ecc., che poi verrano salvati su file su richiesta
        
        Cognome cognome = new Cognome(); // calcolo cifre cognome
        String $1 = cognome.doStuff(); 
        cognomeText = cognome.getCognome(); 
        
        
        Nome nome = new Nome(); // calcolo cifre nome
        String $2 = nome.doStuff();
        nomeText = nome.getNome(); 
        
        AnnoNascita anno = new AnnoNascita(); // calcolo cifre anno nascita
        String $3 = anno.doStuff(); 
        annoText = anno.getAnno(); 
        
        MeseNascita mese = new MeseNascita(); // calcolo cifre mese nascita
        String $4 = mese.doStuff(); 
        meseText = mese.getMesenascita(); 
        
        GiornoNascita giorno = new GiornoNascita(); // calcolo cifre giorno nascita
        String $5 = giorno.doStuff(); 
        giornoText = giorno.getGiornonascita(); 
        
        CodiceComune comune = new CodiceComune(); // calcolo cifre comune nascita
        String $6 = comune.doStuff(); 
        
        CifraControllo cf = new CifraControllo(); // calcolo cifra fi controllo
        String $7 = cf.calcCodice($1 + $2 + $3 + $4 + $5 + $6); 
        
        codicefiscale = ($1 + $2 + $3 + $4 + $5 + $6 + $7).replaceAll("\\s+",""); 
        
        System.out.print("\nCodice Fiscale: ");
        System.out.println(codicefiscale);
               
        } 
        
    public String getCognomeText() {
        return cognomeText;
    }

    public void setCognomeText(String cognomeText) {
        this.cognomeText = cognomeText;
    }

    public String getNomeText() {
        return nomeText;
    }

    public void setNomeText(String nomeText) {
        this.nomeText = nomeText;
    }

    public String getAnnoText() {
        return annoText;
    }

    public void setAnnoText(String annoText) {
        this.annoText = annoText;
    }

    public String getMeseText() {
        return meseText;
    }

    public void setMeseText(String meseText) {
        this.meseText = meseText;
    }

    public String getGiornoText() {
        return giornoText;
    }

    public void setGiornoText(String giornoText) {
        this.giornoText = giornoText;
    }

    public String getSessoText() {
        return sessoText;
    }

    public void setSessoText(String sessoText) {
        this.sessoText = sessoText;
    }

    public String getProvinciaText() {
        return provinciaText;
    }

    public void setProvinciaText(String provinciaText) {
        this.provinciaText = provinciaText;
    }

    public String getCodicefiscale() {
        return codicefiscale;
    }

    public void setCodicefiscale(String codicefiscale) {
        this.codicefiscale = codicefiscale;
    }
    
}
