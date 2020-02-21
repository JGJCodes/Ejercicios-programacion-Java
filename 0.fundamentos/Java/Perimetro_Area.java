/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Perimetro_Area {
        public static void main(String[] args) {

           //Declarar variables
           int base, altura, perimetro;
           float area;
           
           //Leer datos
           base = 5;
           altura = 2;

           //Procesos
           perimetro = 3 * base;
           area= (altura * base)/2;

           //Impresion de datos
           System.out.println("El perimetro es:"+ perimetro);
           System.out.println("El area es:"+ area);

    }
}
