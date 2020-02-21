/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package centtenario;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x,npares = 0,nimpares = 0,snumeros = 0,n_34 = 0,n35_70 = 0,n71_100 = 0,i;
        double promedio = 0;
        System.out.println("Cien numeros aleatorios");

        for(i=1;i<=100;i++){
            x = (int)((Math.random())*(100));
            if(x%2==0){
                npares += 1;
            }
            else{
                nimpares += 1;
            }
            snumeros += x;
            if(x>=1 && x<=34){
                n_34 += 1;
            }
            if(x>=35 && x<=70){
                n35_70 += 1;
            }
            if(x>=71 && x<=100){
                n71_100 += 1;
            }
            promedio = snumeros / 100;
            System.out.println("     " + x);
        }

        System.out.println("Numeros pares = " + npares);
        System.out.println("Numeros impares = " + nimpares);
        System.out.println("Suma de los numeros = " + snumeros);
        System.out.println("Numeros entre 1-34 " + n_34);
        System.out.println("Numeros entre 35-70 " + n35_70);
        System.out.println("Numeros entre 71-100 " + n71_100);
        System.out.println("Promedio " + promedio);
    }

}
