/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package janitestregexcnospillcode;

/**
 * Aplicativo para teste do compilador JaNi:
 * - não executa nada de específico, apenas possui alto número de registradores;
 * - o número de variáveis usadas excederá a quantidade de registradores
 * disponíveis no Nios II, forçando o uso da política de alocação de registradores.
 * Porém, não será necessário gerar spill code, pois será possível alocar todas
 * as variáveis nos registradores do Nios II.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaração de 30 variáveis
        int v01, v02, v03, v04, v05, v06, v07, v08, v09, v10;
        int v11, v12, v13, v14, v15, v16, v17, v18, v19, v20;
        int v21, v22, v23, v24, v25, v26, v27, v28, v29, v30;
        
        // atribuição de valores em todas elas para tentar forçar a existência
        // de todas num mesmo momento
        v01 = 101;
        v02 = 102;
        v03 = 103;
        v04 = 104;
        v05 = 105;
        v06 = 106;
        v07 = 107;
        v08 = 108;
        v09 = 109;
        v10 = 110;
        
        v11 = 111;
        v12 = 112;
        v13 = 113;
        v14 = 114;
        v15 = 115;
        v16 = 116;
        v17 = 117;
        v18 = 118;
        v19 = 119;
        v20 = 120;
        
        v21 = 121;
        v22 = 122;
        v23 = 123;
        v24 = 124;
        v25 = 125;
        v26 = 126;
        v27 = 127;
        v28 = 128;
        v29 = 129;
        v30 = 130;
        
        // algumas operações envolvendo as variáveis - apenas 18 usadas!
        // uso a partir da variável v13
        v15 = 2 * v15 - v13 + v14 / v15;
        v18 = 2 * v18 - v16 + v17 / v18;
        v21 = 2 * v21 - v19 + v20 / v21;
        v24 = 2 * v24 - v22 + v23 / v24;
        v27 = 2 * v27 - v25 + v26 / v27;
        v30 = 2 * v30 - v28 + v29 / v30;
        
        // para teste do aplicativo construído:
        System.out.println(v15);
        System.out.println(v18);
        System.out.println(v21);
        System.out.println(v24);
        System.out.println(v27);
        System.out.println(v30);
    }

}
