/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package ejemplo_herencia;

import Utilerias.Profesor;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor ("Juan", "Hernandez Garcia", 33);
        profesor1.setIdProfesor("Prof 22-387-11");
        profesor1.mostrarNombreApellidosYCarnet();
    }

}
