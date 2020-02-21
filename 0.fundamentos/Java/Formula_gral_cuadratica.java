/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Formula_gral_cuadratica {
    public static void main(String[] args) {
        
        //Declarar variables
          int a, b, c, x;
          
        //Leer datos
          a=1;
          b=5;
          c=2;
          
        //Procesos o calculos 
          x = ((b * b)-(a * 4 * c)) / (2*a);
          
        //Impresion de los datos
          System.out.println( "El resultado es:" + x );
          
          
    }
}
