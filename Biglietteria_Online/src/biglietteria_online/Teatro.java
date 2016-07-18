package biglietteria_online;

/**
 * @author Davide Russo
 */
public class Teatro 
{
    
    private String codTeatro;
    private String nome;
    private String indirizzo;
    private String citta;
    private String provincia;
    private String telefono;
    private int posti;

    public Teatro() 
    {
        this.codTeatro = "";
        this.nome = "";
        this.indirizzo = "";
        this.citta = "";
        this.provincia = "";
        this.telefono = "";
        this.posti = 0;
    }

    public Teatro(String codTeatro, String nome, String indirizzo, String citta, String provincia, String telefono, int posti) 
    {
        this.codTeatro = codTeatro;
        this.nome = nome;
        this.indirizzo = this.indirizzo;
        this.citta = citta;
        this.provincia = provincia;
        this.telefono = telefono;
        this.posti = posti;
    }

    public String getCodTeatro() 
    {
        return codTeatro;
    }

    public void setCodTeatro(String codTeatro) 
    {
        this.codTeatro = codTeatro;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getIndirizzo() 
    {
        return indirizzo;
    }

    public void setIndirirzzo(String indirizzo) 
    {
        this.indirizzo = indirizzo;
    }

    public String getCitta() 
    {
        return citta;
    }

    public void setCitta(String citta) 
    {
        this.citta = citta;
    }

    public String getProvincia() 
    {
        return provincia;
    }

    public void setProvincia(String provincia) 
    {
        this.provincia = provincia;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public int getPosti() 
    {
        return posti;
    }

    public void setPosti(int posti) 
    {
        this.posti = posti;
    }
    
    
    
}
