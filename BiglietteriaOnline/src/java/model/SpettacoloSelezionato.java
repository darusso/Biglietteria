package model;

import java.util.Vector;

/**
 *
 * @author Davide Russo
 */

public class SpettacoloSelezionato extends Spettacolo 
{
    private String codSpettacolo;
    private String titolo;
    private String autore;
    private String regista;
    private double prezzo;
    private String codTeatro;
    
    Vector righe;

    SpettacoloSelezionato(String codSpettacolo, String titolo, String autore, String regista, double prezzo, String codTeatro) 
    {
        throw new UnsupportedOperationException("Riga non aggiunta"); //To change body of generated methods, choose Tools | Templates.
    }
      
    public int NumeroRIghe()
    {
        return righe.size();
    }   
    
}   
