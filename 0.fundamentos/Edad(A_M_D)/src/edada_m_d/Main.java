/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edada_m_d;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int diaN,mesN,añoN,diaA,mesA,añoA,diaE,mesE,añoE;
        System.out.println("Ingresar la fecha de nacimiento:");
        diaN = leer.nextInt();
        mesN = leer.nextInt();
        añoN = leer.nextInt();
        System.out.println("Ingresar la fecha actual:");
        diaA = leer.nextInt();
        mesA = leer.nextInt();
        añoA = leer.nextInt();
        if(diaA<diaN){
            diaE = (diaA+30)-diaN;
            mesN += 1;
        }
        else{
            diaE = diaA-diaN;
        }
        if(mesA<mesN){
            mesE = (mesA+12)-mesN;
            añoN += 1;
        }
        else{
            mesE = mesA-mesN;
        }
        añoE = añoA-añoN;
        System.out.println("Su edad es: " + diaE + "/" + mesE + "/" + añoE);
    }

}
