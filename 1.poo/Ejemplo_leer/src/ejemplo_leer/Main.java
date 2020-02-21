/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo_leer;

import Leer.Leer;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        System.out.println("Nombre=?");
        Nombre=Leer.dato();
        System.out.println("\n"+Nombre);
    }

}
