/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author javamdl
 */
public class TeatroDAL {
        /**
     * 
     * @return lista Teatri
     */
    public ArrayList<Teatro> getAllTeatro(){
        
        ArrayList<Teatro> lista= new ArrayList<Teatro>();
        
        try{
            Class.forName(ConnectDB.driverDB);
            Connection c= DriverManager.getConnection(ConnectDB.urlDB, ConnectDB.userDB, ConnectDB.pwDB);
            //Statement st=c.createStatement();
            
            String sql="Select * from teatri";
            PreparedStatement st=c.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                lista.add(new Teatro(rs.getString("COD_TEATRO"),rs.getString("NOME"),rs.getString("INDIRIZZO"),rs.getString("CITTA"),rs.getString("PROVINCIA"), rs.getString("TELEFONO"), rs.getInt("POSTI") ));
            }
            rs=null;
            st.close();
            st=null;
            c.close();
            c=null;
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
        
    }//getAll

    
}
