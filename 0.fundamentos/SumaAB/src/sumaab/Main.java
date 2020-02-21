/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sumaab;

import java.util.Scanner;

/**
 *
 * @author android
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int A,B,C;
        System.out.println("Ingresar primer numero");
        A = leer.nextInt();
        System.out.println("Ingresar segundo numero");
        B = leer.nextInt();
        C = A+B;
        System.out.println("El resultado de la operacion es: " + A + " + " + B + " = " + C);
    }

}
