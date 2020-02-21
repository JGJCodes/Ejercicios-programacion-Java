/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit.celsius;

/**
 *
 * @author jorge
 */
public class FahrenheitCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        float F, C;
        
        //Lectura de datos
        System.out.println("Ingresar temperatura en Fahrenheit");
        F = Leer.datoFloat();
        
        //Procesos
        C = (float)((5.0/9.0) * (F - 32));
        
        //Impresion de resultados
        System.out.println(F + "F=" + C + "C");
    }
}
