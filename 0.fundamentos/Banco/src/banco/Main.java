/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

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
        int saldo,retiro,deposito,opcion;
        saldo = 500;
        System.out.println("Selecciona una opcion:\n1.-Consultar\n2.-Retirar\n3.-Depositar\n4.-Salir");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:System.out.println("El saldo es: " + saldo);
                   break;
            case 2:System.out.println("¿Cuánto desea retirar?");
                   retiro = leer.nextInt();
                   if (retiro>saldo) {
                       System.out.println("No se puede realizar la operacion");
                   }
                   else{
                       System.out.println("Su saldo actual es de: " + (saldo-retiro));
                   }
                   break;
            case 3:System.out.println("¿Cuánto deseas depositar?");
                   deposito = leer.nextInt();
                   System.out.println("Su saldo actual es: " + (saldo+deposito));
                   break;
            case 4:System.exit(0);
                   break;
            default:System.out.println("Su operacion no se puede realizar");;
        }
    }

}
