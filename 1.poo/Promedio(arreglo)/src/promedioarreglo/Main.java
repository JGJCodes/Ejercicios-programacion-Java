/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package promedioarreglo;

import java.util.Scanner;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner leer = new Scanner(System.in);
      float promedio=0;
      int t=5;
      int []C = new int[t];
      for(int i=0;i<5;i++){
          System.out.println("C["+i+"]?");
          C[i]=leer.nextInt();
          promedio+=C[i];
      }
      promedio/=5;
      System.out.println("El promedio es: " + promedio);
    }

}
