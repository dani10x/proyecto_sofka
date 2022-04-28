package preguntas.y.respuestas.clases;

import java.sql.SQLException;

/**
 *
 * @author Daniel Alzate 
 */
public final class Jugador {
    private String Id_Jugador;
    private String Nombre;

    public Jugador(String Id_Jugador, String Nombre) {
        this.Id_Jugador = Id_Jugador;
        this.Nombre = Nombre;
    }
    
    public Jugador(String Nombre){
        this.Nombre=Nombre;
    }

    public String getId_Jugador() {
        return Id_Jugador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setId_Jugador() throws SQLException {
        this.Id_Jugador=sql.consultas.getId_Jugador(Nombre);
    }
}
