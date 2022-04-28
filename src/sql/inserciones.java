package sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import preguntas.y.respuestas.clases.Juego;
import preguntas.y.respuestas.clases.Jugador;

/**
 *
 * @author Daniel Alzate
 */
public class inserciones {
    public static void insertarJugador(Jugador jugador) throws SQLException{
        Connection cnx = conexion.getConexion();
               
        Statement  st = cnx.createStatement();
        

        String insertar = "INSERT INTO JUGADORES VALUES (To_Char(jugador_secuencia.NextVal), '"+jugador.getNombre()+"')";
        
        st.executeUpdate(insertar);
    }
    
    public static void insertarJuego(Juego juego) throws SQLException{
        Connection cnx = conexion.getConexion();
               
        Statement  st = cnx.createStatement();
        

        String insertar = "INSERT INTO JUEGOS VALUES (To_Char(juego_secuencia.NextVal), '"+juego.getJugador().getId_Jugador()+"', '"+juego.getPremio().getDinero()+"')";
        
        st.executeUpdate(insertar);
    }
}
