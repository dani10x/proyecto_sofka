package preguntas.y.respuestas.clases;

/**
 *
 * @author Daniel Alzate 
 */
public final class Jugador {
    private final int Id_Jugador;
    private final String Nombre;

    public Jugador(int Id_Jugador, String Nombre) {
        this.Id_Jugador = Id_Jugador;
        this.Nombre = Nombre;
    }

    public int getId_Jugador() {
        return Id_Jugador;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
