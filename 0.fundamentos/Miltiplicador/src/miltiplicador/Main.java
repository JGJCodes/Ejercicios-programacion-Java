/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package miltiplicador;

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
        int op1,op2,resultado=0,r;
        op1 = (int) (Math.random()*100);
        op2 = (int) (Math.random()*100);
        System.out.print("¿Cual esesultado de la siguiente operacion? " + op1 + " * " + op2 + " = " );
        r = leer.nextInt();
        resultado = op1*op2;
        while(resultado!=r){
            System.out.println("Incorrecto, vuelvelo a intentar");
            System.out.print("¿Cual es resultado de la siguiente operacion? " + op1 + " * " + op2 + " = " );
            r = leer.nextInt();
            resultado = op1*op2;
        }
        System.out.println("Corrrecto. !Bien hecho¡ ");
    }
    
 

}
