/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package positivos;

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

        int Positivos = 0;
        float Numero;
        do{
           System.out.println("Proporcionar numero");
            Numero = Leer.datoFloat();
            if(Numero>0) {
                Positivos += 1;
            }
        }while(Numero!=0);
        System.out.println("La cantidad de numeros positivos es:" + Positivos);
    }

}
