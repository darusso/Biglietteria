package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Davide Russo
 */
public class ReplicaDal 
{
    
    public ArrayList<Replica> getAllReplicaByCodSpettacolo(String _codSpettacolo)
    {
        
        ArrayList<Replica> lista= new ArrayList<>();
        
        try{
            Class.forName(Connectdb.driverDB);
            Connection c= DriverManager.getConnection(Connectdb.urlDB, Connectdb.userDB, Connectdb.pwDB);
                        
            String sql="Select * from repliche where COD_SPETTACOLO= '"+_codSpettacolo+"'";
            PreparedStatement st=c.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                GregorianCalendar cal = new GregorianCalendar();
                cal.setTime(rs.getDate("DATA_REPLICA"));
                lista.add(new Replica(rs.getString("COD_REPLICA"),rs.getString("COD_SPETTACOLO"), cal ));
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
