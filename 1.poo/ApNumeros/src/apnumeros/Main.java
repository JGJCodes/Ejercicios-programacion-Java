/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apnumeros;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.print("¿Cuál es el tamaño del arreglo?");
        n = Leer.datoInt();
        Numeros Num = new Numeros(n);
        Num.Genera();
        Num.Muestra();
        Num.Ordena();
        System.out.println();
        Num.Muestra();
    }

}
