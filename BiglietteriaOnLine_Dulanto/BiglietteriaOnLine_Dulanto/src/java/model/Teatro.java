/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author javamdl
 */
public class Teatro {
    
    private String codTeatro;
    private String nome;
    private String indirirzzo;
    private String citta;
    private String provincia;
    private String telefono;
    private int posti;

    public Teatro() {
                this.codTeatro = "";
        this.nome = "";
        this.indirirzzo = "";
        this.citta = "";
        this.provincia = "";
        this.telefono = "";
        this.posti = 0;

    }

    public Teatro(String codTeatro, String nome, String indirirzzo, String citta, String provincia, String telefono, int posti) {
        this.codTeatro = codTeatro;
        this.nome = nome;
        this.indirirzzo = indirirzzo;
        this.citta = citta;
        this.provincia = provincia;
        this.telefono = telefono;
        this.posti = posti;
    }

    public String getCodTeatro() {
        return codTeatro;
    }

    public void setCodTeatro(String codTeatro) {
        this.codTeatro = codTeatro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirirzzo() {
        return indirirzzo;
    }

    public void setIndirirzzo(String indirirzzo) {
        this.indirirzzo = indirirzzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }
    
    
    
}
