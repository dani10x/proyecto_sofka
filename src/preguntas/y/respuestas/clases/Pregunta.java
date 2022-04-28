package preguntas.y.respuestas.clases;

import java.util.ArrayList;

/**
 *
 * @author Daniel Alzate
 */
public final class Pregunta {
    private String id_categoria;
    private String pregunta;
    private ArrayList<String> respuestas;

    public Pregunta(String id_categoria, String pregunta, ArrayList<String> respuestas) {
        this.id_categoria=id_categoria;
        this.pregunta = pregunta;
        this.respuestas=respuestas;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
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
    
//    public void mezclarRespuestas(){
//        if(respuestas!=null){
//            for(int i=0; i<4; i++){
//                int random1=(int) Math.floor(Math.random()*(4)+1);
//                int random2=0;
//                do{
//                    random2=(int) Math.floor(Math.random()*(4)+1);
//                }while(random2==random1);
//                
//                Respuesta aux = new Respuesta(respuestas.get(random2));
//                respuestas.set(random2, respuestas.get(random1));
//                respuestas.set(random1, aux);
//            }
//        }
//    }
    
    public void nuevaPregunta(int categoria){
        
    }
}
