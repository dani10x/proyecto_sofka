package preguntas.y.respuestas.clases;

import java.util.ArrayList;
import vista.inicio;
import consultas.*;
import java.sql.SQLException;

/**
 *
 * @author Daniel Alzate 
 */
public class DAOS {
    private inicio inicial;
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Respuesta> respuestas;
    private ArrayList<Categoria> categorias;

    public DAOS() {
        
    }
    
    public void iniciar() throws SQLException{
        cargarArrays();
    }
    
    
    private void cargarArrays() throws SQLException{
        preguntas = consultas.getPreguntas();
        respuestas = consultas.getRespuestas();
        categorias = consultas.getCategoria();
    }
    
    public void print(){
        preguntas.forEach(pregunta ->{
            System.out.println(pregunta.getPregunta());
        });
        
        System.out.println("---");
        respuestas.forEach(respuesta ->{
            System.out.println(respuesta.getRespuesta());
        });
        
        System.out.println("-----");
        
        System.out.println("---");
        categorias.forEach(categoria ->{
            System.out.println(categoria.getNumCategoria());
        });
    }
    
//    public Pregunta getPregunta(int categoria){
//        int random = (int) Math.floor(Math.random()*(5)+1);
//        int aux=1;
//        for(int i=0; i<preguntas.size(); i++){
//            if(preguntas.get(i).getCategoria().getNumCategoria()==categoria){
//                if(aux==random){
//                    return preguntas.get(i);
//                }
//                else{
//                    aux++;
//                }
//            }
//        }
//        return null;
//    }
    
}
