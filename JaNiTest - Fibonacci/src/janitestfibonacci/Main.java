/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package janitestfibonacci;

/**
 * Aplicativo para teste do compilador JaNi:
 * - declaração de variáveis inteiras;
 * - inicialização dessas variáveis na linha de declaração;
 * - declaração de variável short;
 * - estrutura de iteração 'for' com declaração da var. iteradora;
 * - declaração de variável antes do 'for';
 * - alteração de duas variáveis;
 * - o valor de saída do programa estará na variável 'f2'.
 * 
 * @author Willian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaração de variáveis
        int f1 = 1, f2 = 1;
        short c;
        
        // inicialização da variável de controle do loop
        c = 12;
        
        // computação da seqüência de Fibonacci para o número de termos
        // escolhidos na variável 'c'
        int aux;
        for ( int i = 2; i < c; i++ ){
            aux = f1;
            f1 = f2;
            f2 = aux + f1;
        }
        
        // exibição do resultado para teste
        System.out.println(f2);   // teste OK
    }

}
