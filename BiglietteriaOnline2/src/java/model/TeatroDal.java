
package biglietteria_online;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author javamdl
 */
public class TeatroDal 
{
      /**     
     * @return lista Teatri
     */
    
    public ArrayList<Teatro> getAll()
    {
        
        ArrayList<Teatro> lista= new ArrayList<Teatro>();
        
        try
        {
            Class.forName(Connectdb.driverDB);
            Connection c= DriverManager.getConnection(Connectdb.urlDB, Connectdb.userDB, Connectdb.pwDB);
            
            
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
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return lista;
        
    }//getAll

    
}