/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package janitestaprdefesa;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, fib, fat;
        
        int fAux1 = 1, fAux2 = 1;
        n = 12;
        for ( int i = 2; i <= n; i++ ){
            fib = fAux1 + fAux2;
            fAux1 = fAux2;
            fAux2 = fib;
        }

        int i = n + 1;
        fat = 1;
        while ( --i >= 2 )
            fat *= i;

        
        //System.out.println(fib+" - "+fat);
     }
     
}
