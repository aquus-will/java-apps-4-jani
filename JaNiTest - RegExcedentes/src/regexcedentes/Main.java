/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package regexcedentes;

/**
 * Aplicativo para teste do compilador JaNi:
 * - não executa nada de específico, apenas possui alto número de registradores;
 * - o número de variáveis usadas excederá a quantidade de registradores
 * disponíveis no Nios II, forçando o uso da política de alocação de registradores.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaração da variável para armazenamento do resultado
        int resTotal = -900;
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
        
        // algumas operações envolvendo as variáveis
        v01 = 2 * v01 - v21 + v11 / v01;
        v02 = 2 * v02 - v22 + v12 / v02;
        v03 = 2 * v03 - v23 + v13 / v03;
        v04 = 2 * v04 - v24 + v14 / v04;
        v05 = 2 * v05 - v25 + v15 / v05;
        v06 = 2 * v06 - v26 + v16 / v06;
        v07 = 2 * v07 - v27 + v17 / v07;
        v08 = 2 * v08 - v28 + v18 / v08;
        v09 = 2 * v09 - v29 + v19 / v09;
        v10 = 2 * v10 - v30 + v20 / v10;
        
        // expressão com todas as variáveis para fazer com que todas as
        // variáveis tenham que existir mutuamente, ao menos no código de alto nível
        resTotal += resTotal;
        resTotal = v01 + v02 + v03 - v04 + v05 - v06 + v07 - v08 + v09 - v10
                 + v11 + v12 + v13 - v14 + v15 - v16 + v17 - v18 + v19 - v20
                 + v21 + v22 + v23 - v24 + v25 - v26 + v27 - v28 + v29 - v30;
        
        int teste = resTotal + 1;
        v01 = v01 + teste;
        // para teste do aplicativo construído:
        System.out.println(resTotal);
        System.out.println(teste);
        System.out.println(v01);
    }

}
