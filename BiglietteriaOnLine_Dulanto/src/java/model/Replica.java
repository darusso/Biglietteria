/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.GregorianCalendar;

/**
 *
 * @author javamdl
 */
public class Replica {
    private String cod_Replica;
    private String cod_Spettaoolo;
    private GregorianCalendar dataReplica;

    public Replica() {
            this.cod_Replica = "";
        this.cod_Spettaoolo = "";
        this.dataReplica = new GregorianCalendar();

    }

    public Replica(String cod_Replica, String cod_Spettaoolo, GregorianCalendar dataReplica) {
        this.cod_Replica = cod_Replica;
        this.cod_Spettaoolo = cod_Spettaoolo;
        this.dataReplica = dataReplica;
    }

    public String getCod_Replica() {
        return cod_Replica;
    }

    public void setCod_Replica(String cod_Replica) {
        this.cod_Replica = cod_Replica;
    }

    public String getCod_Spettaoolo() {
        return cod_Spettaoolo;
    }

    public void setCod_Spettaoolo(String cod_Spettaoolo) {
        this.cod_Spettaoolo = cod_Spettaoolo;
    }

    public GregorianCalendar getDataReplica() {
        return dataReplica;
    }

    public void setDataReplica(GregorianCalendar dataReplica) {
        this.dataReplica = dataReplica;
    }
    
    
    
    
    
}
