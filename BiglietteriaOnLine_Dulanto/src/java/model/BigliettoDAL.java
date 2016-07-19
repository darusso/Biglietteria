/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.GregorianCalendar;
import javafx.scene.chart.PieChart;

/**
 *
 * @author javamdl
 */
public class BigliettoDAL {
    
    public void PrenotaBiglietto(String cod_Cliente, String cod_Replica, String tipoPagamento, int quantita){
        try{
            Class.forName(ConnectDB.driverDB);
            Connection c= DriverManager.getConnection(ConnectDB.urlDB, ConnectDB.userDB, ConnectDB.pwDB);
            //Statement st=c.createStatement();            
            //String sql="Insert into accounts(email,password,data,id_ruolo) values('"+email+"','"+password+"',current_timestamp,2)";
            String sql="Insert into biglietti(COD_OPERAZIONE,COD_CLIENTE,COD_REPLICA, DATA_ORA, TIPO_PAGAMENTO,"
                    + "QUANTITA) values(NULL,'"+cod_Cliente+"','"+cod_Replica+"',current_timestamp,'"+tipoPagamento+"',"+quantita+")";
            PreparedStatement st=c.prepareStatement(sql);
            //st.setString(1, email);
            //st.setString(2, password);            
            int rows = st.executeUpdate();
            if(rows!=1)
                throw new Exception("Inserimento account fallito");
            
            
            st.close();
            st=null;
            c.close();
            c=null;
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//add
    
}
