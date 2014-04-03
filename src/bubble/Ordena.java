/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;

/**
 *
 * @author Jeferson
 */
public class Ordena {
    
    public void troca(int array[], int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public  void bublesort(int array[]) {
        int troca = 1; //1-Acontece a troca 0-Não troca
        for (int i = 0; ((i < array.length)&&(troca == 1)); i++) {
            troca = 0;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[i]) {
                    troca(array, i, j);
                    troca = 1;
                }
                System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]+" "+array[5]+" ");
            }
        }
    }
}
