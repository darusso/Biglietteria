package model;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Davide Russo
 */
public class Replica 
{
    private String cod_Replica;
    private String cod_Spettacolo;
    private GregorianCalendar dataReplica;

    public Replica() 
    {
        this.cod_Replica = "";
        this.cod_Spettacolo = "";
        this.dataReplica = new GregorianCalendar();
    }

    public Replica(String cod_Replica, String cod_Spettacolo, GregorianCalendar dataReplica) 
    {
        this.cod_Replica = cod_Replica;
        this.cod_Spettacolo = cod_Spettacolo;
        this.dataReplica = dataReplica;
    }
    
    public String getGiornoReplica() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(dataReplica);
        String dateFormatted = fmt.format(dataReplica.getTime());
        return dateFormatted;

    }

    public String getCod_Replica() 
    {
        return cod_Replica;
    }

    public void setCod_Replica(String cod_Replica) 
    {
        this.cod_Replica = cod_Replica;
    }

    public String getCod_Spettacolo() 
    {
        return cod_Spettacolo;
    }

    public void setCod_Spettacolo(String cod_Spettacolo) 
    {
        this.cod_Spettacolo = cod_Spettacolo;
    }

    public GregorianCalendar getDataReplica() 
    {
        return dataReplica;
    }

    public void setDataReplica(GregorianCalendar dataReplica) 
    {
        this.dataReplica = dataReplica;
    }    
    
    
}
