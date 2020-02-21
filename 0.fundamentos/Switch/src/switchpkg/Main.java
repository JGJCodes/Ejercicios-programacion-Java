/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package switchpkg;

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
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        byte opcion;
        System.out.println("Semaforo");
        opcion = leer.nextByte();
        switch(opcion){
            case 1:System.out.println("verde");
                   break;
            case 2:System.out.println("amarillo");
                   break;
            case 3:System.out.println("rojo");
                   break;
            default:System.out.println("el numero ingresado no esta en la escala del semaforo");
        }
    }

}
