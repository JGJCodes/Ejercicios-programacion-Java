/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package perimetro_area;

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

        Scanner leer  = new Scanner(System.in);
        int base, altura, perimetro;
        float area;
        System.out.println("Ingresar base del rectangulo");
        base = leer.nextInt();
        System.out.println("Ingresar altura del rectangulo");
        altura = leer.nextInt();
        perimetro = 3 * base;
        area= (altura * base)/2;
        System.out.println("El perimetro es:"+ perimetro);
        System.out.println("El area es:"+ area);
    }

}
