/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package promedio;

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
		int Calif1,Calif2,Calif3,Promedio;
		System.out.print("Calificacion 1:");
		Calif1 = leer.nextInt();
		System.out.print("\nCalificacion 2:");
		Calif2 = leer.nextInt();
		System.out.print("\nCalificacion 3:");
		Calif3 = leer.nextInt();
		Promedio = (Calif1+Calif2+Calif3)/3;
		System.out.println("\nTu promedio es:" + Promedio);
    }

}
