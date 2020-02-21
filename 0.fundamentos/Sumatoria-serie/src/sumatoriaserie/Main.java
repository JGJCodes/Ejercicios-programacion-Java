/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sumatoriaserie;

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

        int n;
        double S = 0;
        System.out.println("N=");
        n = Leer.datoInt();
        for (int i=1; i<=n; i++) {
            S+= (2*i-1.0)/(2*i);
        }
        System.out.println("La serie para los primeros "+n+" terminos es" + S);
    }

}
