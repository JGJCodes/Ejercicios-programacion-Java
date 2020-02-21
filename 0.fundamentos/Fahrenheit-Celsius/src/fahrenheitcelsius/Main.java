/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fahrenheitcelsius;

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

        float F, C;
        System.out.println("Ingresar temperatura en Fahrenheit");
        F = Leer.datoFloat();
        C = (float)((5.0/9.0) * (F - 32));
        System.out.println(F + "F=" + C + "C");
    }

}
