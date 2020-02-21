/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package producto1020;

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

        int X;
        long S;
        S=1;
        for(X=10; X<=20; X+=2) {
              S*=X;
        }
        System.out.println("El resultado del producto es:" + S);
    }

}
