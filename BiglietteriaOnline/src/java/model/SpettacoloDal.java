package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Davide Russo
 */
public class SpettacoloDal
{
    
     /**
     * 
     * @return lista Spettacolo
     */
    
    public ArrayList<Spettacolo> getAllSpettacolo()
    {
        
        ArrayList<Spettacolo> lista= new ArrayList<>();
        
        try{
            Class.forName(Connectdb.driverDB);
            Connection c= DriverManager.getConnection(Connectdb.urlDB, Connectdb.userDB, Connectdb.pwDB);
            
            
            String sql="Select * from Spettacoli";
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
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return lista;
        
    }
    
}
