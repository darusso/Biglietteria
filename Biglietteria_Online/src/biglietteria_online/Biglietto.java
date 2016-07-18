package biglietteria_online;

import java.util.GregorianCalendar;

/**
 *
 * @author javamdl
 */
public class Biglietto 
{
    private int cod_Operazione;
    private String cod_Cliente;
    private String cod_Replica;
    private GregorianCalendar dataOra;
    private String tipoPagamento;
    private int quantita;

    public Biglietto() 
    {
        this.cod_Operazione = -1;
        this.cod_Cliente = "";
        this.cod_Replica = "";
        this.dataOra = new GregorianCalendar();
        this.tipoPagamento = "";
        this.quantita = -1;
    }

    public Biglietto(int cod_Operazione, String cod_Cliente, String cod_Replica, GregorianCalendar dataOra, String tipoPagamento, int quantita) 
    {
        this.cod_Operazione = cod_Operazione;
        this.cod_Cliente = cod_Cliente;
        this.cod_Replica = cod_Replica;
        this.dataOra = dataOra;
        this.tipoPagamento = tipoPagamento;
        this.quantita = quantita;
    }

    public int getCod_Operazione() 
    {
        return cod_Operazione;
    }

    public void setCod_Operazione(int cod_Operazione) 
    {
        this.cod_Operazione = cod_Operazione;
    }

    public String getCod_Cliente() 
    {
        return cod_Cliente;
    }

    public void setCod_Cliente(String cod_Cliente) 
    {
        this.cod_Cliente = cod_Cliente;
    }

    public String getCod_Replica() 
    {
        return cod_Replica;
    }

    public void setCod_Replica(String cod_Replica) 
    {
        this.cod_Replica = cod_Replica;
    }

    public GregorianCalendar getDataOra() 
    {
        return dataOra;
    }

    public void setDataOra(GregorianCalendar dataOra) 
    {
        this.dataOra = dataOra;
    }

    public String getTipoPagamento() 
    {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) 
    {
        this.tipoPagamento = tipoPagamento;
    }

    public int getQuantita() 
    {
        return quantita;
    }

    public void setQuantita(int quantita) 
    {
        this.quantita = quantita;
    }
    
    
    
}
