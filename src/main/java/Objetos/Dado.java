package Objetos;
import com.sun.glass.ui.SystemClipboard;
import java.util.Random;

public class Dado {
    Random n=new Random(System.currentTimeMillis());
    
    private int cara;

    /** retorna un numero aleatorio entre 1 y 6
     *
     * @return resultado
     */
    public int lanzarDado(){
    cara=n.nextInt(7)+1;
    return cara;
    }  
}
