/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package numero_texto;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<=Integer.MAX_VALUE; i += (int) (Math.random()*10000))
        System.out.println(Numero_Letra.Transformar(i));
    }

}
