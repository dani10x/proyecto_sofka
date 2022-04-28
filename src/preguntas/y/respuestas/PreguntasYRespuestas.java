package preguntas.y.respuestas;

import java.sql.SQLException;
import preguntas.y.respuestas.clases.DAOS;
import vista.inicio;

/**
 *
 * @author Daniel Alzate
 */
public class PreguntasYRespuestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//        inicio i = new inicio();
//        i.setVisible(true);
//        configuracion c = new configuracion();
//        c.setVisible(true);
//        puntuaciones p = new puntuaciones();
//        p.setVisible(true);
//        pantalla_de_juego.main(args);
        DAOS daos = new DAOS();
        daos.iniciar();
        inicio.main(daos);
    }
    
}
