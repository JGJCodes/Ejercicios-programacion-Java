/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

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
        int N,x,i;
        float suma = 0;
        System.out.println("Ingresar N");
        N = leer.nextInt();
        System.out.println("Ingresar X");
        x = leer.nextInt();
        for(i=0;i<N;i++){
            suma += (float)(Math.pow(x, i)/ Main.Factorial(i));
        }
        System.out.println("La serie con los valores X= " + x + " y " + N + " es " + suma);
    }

    public static int Factorial(int n)
    {
        int fact=1,i=0;
        for(i=n;i>=1;i--){
            fact *= i;
        }
        return fact;
    }

}
