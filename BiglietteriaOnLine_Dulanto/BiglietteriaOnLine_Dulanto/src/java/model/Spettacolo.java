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
public class Spettacolo {
    private String codSpettacolo;
    private String titolo;
    private String autore;
    private String regista;
    private double prezzo;
    private String codTeatro;

    public Spettacolo() {
                this.codSpettacolo = "";
        this.titolo = "";
        this.autore = "";
        this.regista = "";
        this.prezzo = 0.00;
        this.codTeatro = "";

    }

    public Spettacolo(String codSpettacolo, String titolo, String autore, String regista, double prezzo, String codTeatro) {
        this.codSpettacolo = codSpettacolo;
        this.titolo = titolo;
        this.autore = autore;
        this.regista = regista;
        this.prezzo = prezzo;
        this.codTeatro = codTeatro;
    }

    public String getCodSpettacolo() {
        return codSpettacolo;
    }

    public void setCodSpettacolo(String codSpettacolo) {
        this.codSpettacolo = codSpettacolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getCodTeatro() {
        return codTeatro;
    }

    public void setCodTeatro(String codTeatro) {
        this.codTeatro = codTeatro;
    }
    
    

}
