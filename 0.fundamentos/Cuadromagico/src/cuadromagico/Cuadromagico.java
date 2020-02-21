/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadromagico;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Cuadromagico {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner leer = new Scanner (System.in);
        int N=0;
        System.out.println("Ingresar el valor de N");
        N = leer.nextInt();
        if(N%2==0 || N<3){
            System.out.println("N debe ser impar y mayor que dos");
        }
        else{
           CCuadroMagico.GeneralCM(N);
           System.out.println("");
           CCuadroMagico.ImprimirCM(N);
        }
   }
}
