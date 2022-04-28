package preguntas.y.respuestas.clases;

import sql.consultas;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author Daniel Alzate 
 */
public class DAOS {
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Respuesta> respuestas;
    private ArrayList<Categoria> categorias;
    private Juego juego;
    private Jugador jugador;

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
    
    public Categoria getCategoria(int numRonda){
        for(int i=0; i<categorias.size(); i++){
            if(numRonda==categorias.get(i).getNumCategoria()){
                return categorias.get(i);
            }
        }
        return null;
    }
    
    public Pregunta getPregunta(Categoria categoria){
        int random=(int) Math.floor(Math.random()*(5)+1);
        System.out.println(random);
        for(int i=0; i<preguntas.size(); i++){
            System.out.println("--");
            if(preguntas.get(i).getId_categoria().equals(categoria.getId_Categoria())){
                if(random==1){
                    return preguntas.get(i);
                }
                random--;
            }
        }
        return null;
    }
    
    public ArrayList<Respuesta> getRespuestas(ArrayList<String> id_preguntas){
        ArrayList<Respuesta> respuestas = new ArrayList<>();
        for(int i=0; i<id_preguntas.size(); i++){
            respuestas.add(getRespuestas(id_preguntas.get(i)));
        }
        
        return respuestas;
    }
    
    private Respuesta getRespuestas(String id_respuesta){
        for(int i=0; i<respuestas.size(); i++){
            if(respuestas.get(i).getId_Respuesta().equals(id_respuesta)){
                return respuestas.get(i);
            }
        }
        return null;
    }
}
