/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Salario {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int H,Ph,S,He,Pe;
        System.out.println("Ingresar numero de horas trabajadas");
        H = leer.nextInt();
        System.out.println("Ingresar pago por hora");
        Ph = leer.nextInt();
        S = H*Ph;
        if(H>40){
             He = H-40;
             Pe = (int) ((He*Ph)*0.10);
             S += Pe;
        }
        System.out.println("El salario es: $" + S +".00" );
   }
}
