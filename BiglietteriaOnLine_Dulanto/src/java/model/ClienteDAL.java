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

/**
 *
 * @author javamdl
 */
public class ClienteDAL {
        public  Cliente LoginWithCodCliente(String codCliente){
        
        Cliente client= null;
        
        try{
            Class.forName(ConnectDB.driverDB);
            Connection c= DriverManager.getConnection(ConnectDB.urlDB, ConnectDB.userDB, ConnectDB.pwDB);
            //Statement st=c.createStatement();
            
            String sql="Select * from clienti where COD_CLIENTE = "+codCliente ;
            PreparedStatement st=c.prepareStatement(sql);
            //st.setString(1, codCliente);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                //GregorianCalendar data=new GregorianCalendar();
                //data.setTime(rs.getDate("data"));
                client=new Cliente(rs.getString("COD_CLIENTE"),rs.getString("COGNOME"),rs.getString("NOME"),rs.getString("TELEFONO"),rs.getString("EMAIL"));
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
        
        return client;
        
    }//getByID

}
