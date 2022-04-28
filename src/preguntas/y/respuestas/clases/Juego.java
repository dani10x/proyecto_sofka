package preguntas.y.respuestas.clases;

import java.sql.SQLException;

/**
 *
 * @author Daniel Alzate
 */
public class Juego {
    private final Jugador jugador;
    private final Premio premio;

    public Juego(Jugador jugador, Premio premio) throws SQLException {
        this.jugador = jugador;
        this.premio=premio;
        this.jugador.setId_Jugador();
    }
    
    public Juego(String jugador, String premio){
        this.jugador= new Jugador(jugador);
        this.premio = new Premio();
        this.premio.setDinero(premio);
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Premio getPremio() {
        return premio;
    }
}
