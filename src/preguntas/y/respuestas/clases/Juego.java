package preguntas.y.respuestas.clases;

/**
 *
 * @author Daniel Alzate
 */
public class Juego {
    private final Jugador jugador;
    private final Ronda ronda;
    private final Premio premio;
    private DAOS daos;

    public Juego(Jugador jugador, DAOS daos) {
        this.jugador = jugador;
        ronda= new Ronda();
        premio = new Premio();
        this.daos=daos;
        
//        ronda.setPregunta(daos.getPregunta(ronda.getNumRonda()));
    }
    
    
    
    
    
    
}
