package preguntas.y.respuestas.clases;

/**
 *
 * @author Daniel Alzate
 */
public class Juego {
    private final Jugador jugador;
    private final Premio premio;
    private Ronda ronda;
    private Pregunta pregunta;
    private Categoria categoria;
    private DAOS daos;

    public Juego(Jugador jugador, DAOS daos) {
        this.jugador = jugador;
        premio = new Premio();
        this.daos=daos;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Premio getPremio() {
        return premio;
    }
    
    public void nuevaPregunta(){
        pregunta= daos.getPregunta(categoria);
    }

}
