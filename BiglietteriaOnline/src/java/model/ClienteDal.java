package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author javamdl
 */
public class ClienteDal 
{
        public  Cliente LoginWithCodCliente(String codCliente)
        {
        
        Cliente client= null;
        
        try{
            Class.forName(Connectdb.driverDB);
            Connection c= DriverManager.getConnection(Connectdb.urlDB, Connectdb.userDB, Connectdb.pwDB);
            
            
            String sql="Select * from clienti where COD_CLIENTE = "+codCliente ;
            PreparedStatement st=c.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
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
