/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla.multiplicar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        System.out.print("Ingresar la tabla deseada: ");
        x=Leer.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i + "x"+ x + " = " + (i*x));
        }
    }
}
