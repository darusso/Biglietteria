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
public class SpettacoloDAL {
    
     /**
     * 
     * @return lista Spettacolo
     */
    public ArrayList<Spettacolo> getAllSpettacolo(){
        
        ArrayList<Spettacolo> lista= new ArrayList<Spettacolo>();
        
        try{
            Class.forName(ConnectDB.driverDB);
            Connection c= DriverManager.getConnection(ConnectDB.urlDB, ConnectDB.userDB, ConnectDB.pwDB);
            //Statement st=c.createStatement();
            
            String sql="Select * from spettacoli";
            PreparedStatement st=c.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                lista.add(new Spettacolo(rs.getString("COD_SPETTACOLO"),rs.getString("TITOLO"),rs.getString("AUTORE"),rs.getString("REGISTA"),rs.getDouble("PREZZO"), rs.getString("COD_TEATRO") ));
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
    
         public  Spettacolo getSpettacoloById(String _codSpettacolo){
        
        Spettacolo spett= null;
        
        try{
            Class.forName(ConnectDB.driverDB);
            Connection c= DriverManager.getConnection(ConnectDB.urlDB, ConnectDB.userDB, ConnectDB.pwDB);
            //Statement st=c.createStatement();
            
            String sql="Select * from spettacoli where COD_SPETTACOLO = '"+_codSpettacolo+"'" ;
            PreparedStatement st=c.prepareStatement(sql);
            //st.setString(1, codCliente);
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                //GregorianCalendar data=new GregorianCalendar();
                //data.setTime(rs.getDate("data"));
                spett=new Spettacolo(rs.getString("COD_SPETTACOLO"),rs.getString("TITOLO"),rs.getString("AUTORE"),rs.getString("REGISTA"),rs.getDouble("PREZZO"), rs.getString("COD_TEATRO"));
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
        
        return spett;
        
    }//getByID
}
