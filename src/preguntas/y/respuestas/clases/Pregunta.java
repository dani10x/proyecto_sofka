package preguntas.y.respuestas.clases;

import java.util.ArrayList;

/**
 *
 * @author Daniel Alzate
 */
public final class Pregunta {
    private int categoria;
    private String pregunta;
    private ArrayList respuestas;

    public Pregunta(int categoria, String pregunta, ArrayList respuestas) {
        this.categoria=categoria;
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList respuestas) {
        this.respuestas = respuestas;
    }
    
    public void no(){
        
    }
}
