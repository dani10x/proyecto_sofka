package preguntas.y.respuestas.clases;

/**
 *
 * @author Daniel Alzate
 */
public class Premio {
    private int dinero;

    public Premio() {
        dinero=0;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(Ronda r) {
        switch(r.getNumRonda()){
            case 1: dinero=0;
                break;
            case 2: dinero=100;
                break;
            default: dinero=500*(r.getNumRonda()-2);
        }
    }
    
    public void reset(){
        dinero=0;
    }
    
    public void setDinero(String dinero){
        this.dinero = Integer.parseInt(dinero);
    }
    
    public void setMaximo(){
        dinero=2000;
    }
}
