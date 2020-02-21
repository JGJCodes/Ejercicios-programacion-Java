/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

/**
 *
 * @author jorge
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        int Suma, X;
        Suma=0;
        
        //Procesos
        for (X=1; X<11; X+=1) {
            Suma+=X;
        }
        
        //Imprecion de resultados
        System.out.println("Suma=" + Suma);
    }
}
