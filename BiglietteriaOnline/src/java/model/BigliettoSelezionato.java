package model;

import java.util.GregorianCalendar;

/**
 *
 * @ Davide Russo
 */

public class BigliettoSelezionato extends Biglietto
{
     public int quantitaSelezionata;

    public BigliettoSelezionato(int cod_Operazione, String cod_Cliente, String cod_Replica, GregorianCalendar dataOra, String tipoPagamento, int quantita) 
    {
        super(cod_Operazione, cod_Cliente, cod_Replica, dataOra, tipoPagamento, quantita);
         int qS = 0;
        this.quantitaSelezionata = qS;
    }
    
}
    
    
