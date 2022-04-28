package preguntas.y.respuestas.clases;

import java.util.ArrayList;
import vista.inicio;

/**
 *
 * @author Daniel Alzate 
 */
public class DAOS {
    private inicio inicial;
    private ArrayList<Pregunta> preguntas;

    public DAOS() {
        preguntas = new ArrayList<>();
    }
    
    public void iniciar(){
        cargarArrays();
    }
    
    
    private void cargarArrays(){
        //consulta preguntas
    }
    
    public Pregunta getPregunta(int categoria){
        int random = (int) Math.floor(Math.random()*(5)+1);
        int aux=1;
        for(int i=0; i<preguntas.size(); i++){
            if(preguntas.get(i).getCategoria().getNumCategoria()==categoria){
                if(aux==random){
                    return preguntas.get(i);
                }
                else{
                    aux++;
                }
            }
        }
        return null;
    }
    
}
