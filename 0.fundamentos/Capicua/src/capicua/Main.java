/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package capicua;

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
        int N, aux,s = 0,u,c = 0,i = 0,cp = 0,ci = 0;
        System.out.println("Caracteristicas de un numero\nIngresar el numero");
        N = leer.nextInt();
        aux = N;
        while(aux!=0){
             u = aux%10;
             i = i*10 + u;
             aux /= 10;
             c += 1;
             s += u;
             if(u%2==0)
               cp += 1;
            else
               ci += 1;
        }
        System.out.println("El numero es: " + N);
        System.out.print("El numero con las cifras invertidas es: " + i + "\n");
        System.out.print("El numero de cifras del numero es: " + c + "\n");
        System.out.print("La sumatoria de las cifras del numero es: " + s + "\n");
        System.out.print("Las cifras pares: " + cp + "\n");
        System.out.print("Las cifras impares: " + ci + "\n");
        if(N==i)
             System.out.print("El numero es capicua"+ "\n");
        else
            System.out.print("El numero no es capicua" + "\n");
    }

}
