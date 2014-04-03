package bubble;

/**
 *
 * @author Jeferson
 */
public class Bubble {

    public static void main(String[] args) {
        //int v[] = {10,20,30,40,50,60};
        //int v[] = {60,50,40,30,20,10};
        int v[] = {40,60,30,20,50,10};
        Ordena ordena = new Ordena();
        ordena.bublesort(v);
        
    }
}
