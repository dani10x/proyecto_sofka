package sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import preguntas.y.respuestas.clases.Jugador;

/**
 *
 * @author Daniel Alzate
 */
public class inserciones {
    public static void insertarJugador(Jugador jugador) throws SQLException{
        System.out.println(jugador.getNombre());
        Connection cnx = conexion.getConexion();
               
        Statement  st = cnx.createStatement();
        

        String insertar = "INSERT INTO JUGADORES VALUES (To_Char(jugador_secuencia.NextVal), '"+jugador.getNombre()+"')";
        
        st.executeUpdate(insertar);
    }
}
