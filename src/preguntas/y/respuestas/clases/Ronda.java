package preguntas.y.respuestas.clases;

/**
 *
 * @author Daniel Alzate
 */
public class Ronda {
    private int numRonda;
    private Pregunta pregunta;

    public Ronda() {
        numRonda=1;
    }

    public int getNumRonda() {
        return numRonda;
    }

    public void avanzarRonda(){
        if(numRonda<5){
            numRonda++;
            pregunta.nuevaPregunta(numRonda);
        }
    }
    
    public void resetRonda(){
        numRonda=1;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    
    
}
