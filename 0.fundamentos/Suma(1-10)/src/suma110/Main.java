/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package suma110;

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

        int Suma, X;
        Suma=0;
        for (X=1; X<11; X+=1) {
            Suma+=X;
        }
        System.out.println("Suma = " + Suma);
    }

}
