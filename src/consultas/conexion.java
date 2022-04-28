package consultas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Daniel Alzate
 */
public class conexion {
    public static  Connection getConexion()
            {
                try
                    {
                        Class.forName("oracle.jdbc.OracleDriver");
               
                        String myDB="jdbc:oracle:thin:@localhost:1522:XE";
                        Connection cnx = DriverManager.getConnection(myDB,"juego_admin","sofka");                    
                        return cnx;
                        
                    }
                catch(SQLException ex)
                        {
                            System.out.println(ex.getMessage());
                            System.out.println("No se pudo conectar");
                        }
                catch (ClassNotFoundException ex) {
                     Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
                      System.out.println("Error");
                     }

                    return null;
                
                
            }
}
