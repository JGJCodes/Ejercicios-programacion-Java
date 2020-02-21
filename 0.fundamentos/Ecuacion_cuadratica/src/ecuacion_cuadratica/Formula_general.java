/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion_cuadratica;

/**
 *
 * @author jorge
 */
public class Formula_general {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        int A, B, C, D, E;
        float X1, X2;
        
        //Lectura de datos 
        System.out.println("Ingresar a");
        A = Leer.datoInt();
        System.out.println("Ingresar b");
        B = Leer.datoInt();
        System.out.println("Ingresar c");
        C = Leer.datoInt();
        
        //Procesos
        D = (int) Math.pow(B, 2);
        E = 4*A*C;
        
        if(E<D && A!=0)
        {
            X1 = (float)(-B + Math.sqrt(D-E)/(2*A));
            X2 = (float)(-B - Math.sqrt(D-E)/(2*A));
            System.out.println("El valor de X1 es:" + X1 + " El valor de X2 es:" + X2);
        } 
        else {
            System.out.println("No se puede resolver");
        }
    }
}
