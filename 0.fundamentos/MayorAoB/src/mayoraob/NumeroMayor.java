/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoraob;

/**
 *
 * @author jorge
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        int A,B;
        
        //Lectura de datos 
        System.out.println("Proporcionar el primer numero");
        A = Leer.datoInt();
        System.out.println("Proporcionar el segundo numero");
        B = Leer.datoInt();
        
        //Procesos
        if(A>B) {
              //Imprecion de resultados
            System.out.println("El mayor es:" + A);
        }
        else {
              //Imprecion de resultados
            System.out.println("El mayor es:" + B);
        }
    }
}
