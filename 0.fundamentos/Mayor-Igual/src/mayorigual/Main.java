/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mayorigual;

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

        int A,B;
         System.out.println("Proporcionar el primer numero");
         A = Leer.datoInt();
         System.out.println("Proporcionar el segundo numero");
         B = Leer.datoInt();
         if(A>B)
            System.out.println("El mayor es:" + A);
         else{
            if(A==B)
               System.out.println(A + "=" + B);
             else
                System.out.println("El mayor es:" + B);
         }
    }

}
