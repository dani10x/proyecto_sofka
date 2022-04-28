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
            default: dinero=500*(r.getNumRonda());
        }
    }
    
    public void reset(){
        dinero=0;
    }
    
    
}
