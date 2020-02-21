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


    static int T=5;

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float promedio=0;
      int []C = new int[T];
      Main.Capturarycalcular(promedio,C);
    }

    public static void Capturarycalcular(float p,int []x){
        for(int i=0;i<T;i++){
            System.out.print("C["+i+"]=");
            x[i]=leer.nextInt();
            p+=x[i];
        }
        p/=T;
        System.out.println("El promedio es: " + p);
    }
}
