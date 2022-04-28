package sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import preguntas.y.respuestas.clases.Categoria;
import preguntas.y.respuestas.clases.Juego;
import preguntas.y.respuestas.clases.Pregunta;
import preguntas.y.respuestas.clases.Respuesta;

/**
 *
 * @author Daniel Alzate
 */
public class consultas {
    public static ArrayList<Pregunta> getPreguntas() throws SQLException{
       
        ArrayList <Pregunta> preguntas = new ArrayList();
        
        Connection cnx = conexion.getConexion();
        
        Statement  st = cnx.createStatement();

        String consulta = "SELECT * FROM PREGUNTAS";

        ResultSet res = st.executeQuery(consulta);

        while(res.next()){
            ArrayList<String> respuestas = new ArrayList<>();
            respuestas.add(res.getString("RESPUESTAS_RESPUESTA1"));
            respuestas.add(res.getString("RESPUESTAS_RESPUESTA2"));
            respuestas.add(res.getString("RESPUESTAS_RESPUESTA3"));
            respuestas.add(res.getString("RESPUESTAS_RESPUESTA4"));
            Pregunta pregunta = new Pregunta(res.getString("CATEGORIAS_ID_CATEGORIA"), res.getString("PREGUNTA"), respuestas);
            
            preguntas.add(pregunta);
        } 
        return preguntas;
    }
    
    public static ArrayList<Respuesta> getRespuestas() throws SQLException{
        ArrayList<Respuesta> respuestas = new ArrayList<>();
        
        Connection cnx = conexion.getConexion();
        
        Statement st = cnx.createStatement();
        
        String consulta = "SELECT * FROM RESPUESTAS";
        
        ResultSet res = st.executeQuery(consulta);
        
        while(res.next()){
            boolean correcta = res.getInt("CORRECTA")==1;
            Respuesta respuesta = new Respuesta(res.getString("ID_RESPUESTA"), res.getString("RESPUESTA"), correcta);
            respuestas.add(respuesta);
        }
        return respuestas;
    }
    
    public static ArrayList<Categoria> getCategoria() throws SQLException{
        ArrayList<Categoria> categorias = new ArrayList<>();
        
        Connection cnx = conexion.getConexion();
        
        Statement st = cnx.createStatement();
        
        String consulta = "SELECT * FROM CATEGORIAS";
        
        ResultSet res = st.executeQuery(consulta);
        
        while(res.next()){
            Categoria categoria = new Categoria(res.getString("ID_CATEGORIA"), res.getInt("NUMERO"));
            categorias.add(categoria);
        }
        
        return categorias;
    }
    
    public static String getId_Jugador(String nombre) throws SQLException{
        String id="";
        Connection cnx = conexion.getConexion();
        
        Statement st = cnx.createStatement();
        
        String consulta = "SELECT ID_JUGADOR FROM JUGADORES WHERE nombre = '"+nombre+"' " ;
        
        ResultSet res = st.executeQuery(consulta);
        while(res.next()){
            id=res.getString("id_jugador");
        }
        
        return id;
    }
    
    public static ArrayList<Juego> getPuntuaciones() throws SQLException{
        ArrayList<Juego> juegos = new ArrayList<>();
        
        Connection cnx = conexion.getConexion();
        
        Statement st = cnx.createStatement();
        
        String consulta = "select nombre, dinero from juegos inner join JUGADORES on JUGADORES_ID_JUGADOR=ID_JUGADOR order by dinero desc";
        
        ResultSet res = st.executeQuery(consulta);
        
        while(res.next()){
            Juego juego = new Juego(res.getString("nombre"), res.getString("dinero"));
            juegos.add(juego);
        }
        
        return juegos;
    }
}
