/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author jorge
 */
public class Producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        int X;
        long S;
        S=1;
        
        //Procesos
        for(X=10; X<=20; X+=2) {
            S*=X;
        }
          
        //Imprecion de resultados
        System.out.println("El resultado del producto es:" + S);
    }
}
