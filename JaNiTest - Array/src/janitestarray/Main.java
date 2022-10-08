/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package janitestarray;

/**
 * Para testar array de maneira bem simples.
 * 
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaração do array
        int[] array;
        
        // Instanciação
        array = new int[15];
        
        // Uso
        array[0] = 55;
        for ( int i = 1; i < 15; i++ )
            array[i] = -i;
        
    }

}
