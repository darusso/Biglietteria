/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Javamdl
 */
public class Cliente {
        private String cod_Cliente;
        private String cognome;
        private String nome;
        private String Telefono;
        private String email;

    public Cliente() {
            this.cod_Cliente = "";
        this.cognome = "";
        this.nome = "";
        this.Telefono = "";
        this.email = "";

    }
        
        
    public Cliente(String cod_Cliente, String cognome, String nome, String Telefono, String email) {
        this.cod_Cliente = cod_Cliente;
        this.cognome = cognome;
        this.nome = nome;
        this.Telefono = Telefono;
        this.email = email;
    }

    public String getCod_Cliente() {
        return cod_Cliente;
    }

    public void setCod_Cliente(String cod_Cliente) {
        this.cod_Cliente = cod_Cliente;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
        
    
}
