/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package janitestcrucial;

/**
 * Teste principal para o JaNi, devendo envolver todo as estruturas de
 * programação de quais os bytecodes são suportados pelo compilador.
 * 
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaração de algumas variáveis
        short entr01, entr02;   // tipo short
        int a, b, c;    // tipo int
        char ch1, ch2;  // tipo char
        boolean flag;   // tipo boolean
        
        // declaração do array
        int [] array;  // tipo byte
        
        // inicializações
        entr01 = -34;
        entr02 = (short) ( entr01 + 75 );
        a = 0;
        b = 236;
        flag = false;
        array = new int[13];
        
        // estruturas de decisão
        if ( b >= 230 && a == 0 )
            ch1 = 'X';
        else ch1 = 'Y';
        
        ch2 = 'L';
        if ( entr01 > 0 || entr02 < 0 ){
            entr01 *= -1;
            ch2 = 'W';
        }else{
            if ( ch1 != 'X' )
                ch2 = 'I';
            entr01 /= 2;
        }
        
        // estruturas de repetição
        c = 13;
        while ( --c > -1 )
            array[c] = -c;
        
        do{
            b++;
            for ( int i = 0; i < 13; i++ ){
                if ( flag )
                    array[i] += b / 5;
                flag = !flag;
            }
            if ( entr01 > 0 ) entr01--;
            else entr01++;
        }while ( entr01 != 0 );
        
        
        // exibição de todas as variáveis, para teste
        System.out.println("entr01 = " + entr01 + ", entr02 = " + entr02);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("ch1 = " + (int) ch1 + ", ch2 = " + (int) ch2);
        System.out.println("flag = " + flag);
        for ( int i = 0; i < 13; i++ )
            System.out.print(array[i] + "  ");
        System.out.println();
        
    }

}
