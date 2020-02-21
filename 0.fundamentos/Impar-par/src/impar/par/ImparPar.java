/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impar.par;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ImparPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Numeros Pares-Impares");
        System.out.print("Ingresar un numero: ");
        x=Leer.nextInt();
        if(x%2==0)
            System.out.println("\nEl numero es par");
        else
            System.out.println("\nEl numero es impar");
    }
}
