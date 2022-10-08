/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package appjanicompiler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Control c = new Control();
        c.setVisible(true);
        
        try {
            // TODO code application logic here
            Process p = Runtime.getRuntime().exec("C:/Users/hp/Documents/Mestrado/loop.exe > testeLoop.txt");
            System.out.println("Processo em execução...");
            InputStream is = p.getInputStream();    // saída do processo
            OutputStream os = p.getOutputStream();  // entrada do processo
            
            p.getOutputStream().write('4');
            p.getOutputStream().write('5');
            p.getOutputStream().write('3');
            p.getOutputStream().write('\n');
            p.getOutputStream().flush();
            
            byte[] bytes;
            bytes = new byte[10];
            p.getInputStream().read(bytes);
            for ( int i = 0; i < 10 && bytes[i] != 0; i++ )
                System.out.print((char)bytes[i]);
            //System.out.println();
            
            p.waitFor();
            System.out.println("Terminou com valor "+p.exitValue());
        } catch (InterruptedException ex) {
            System.out.println("Fudeu!");
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Fudeu!");
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
