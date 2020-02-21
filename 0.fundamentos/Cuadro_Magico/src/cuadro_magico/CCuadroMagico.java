/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadro_magico;

/**
 *
 * @author jorge
 */
public class CCuadroMagico {
   
   public static void GeneralCM(int n)
    {
        int F=0,C=n/2,i=1;
        System.out.println(" Fila | Columna | i ");
        System.out.println("   " + F + "      " + C + "       " + i);
        for(i=2;i<=Math.pow(n, 2);i++){
            if((i-1)%n==0){
                F+=1;
            }
            else{
                if (F==0){
                    F = n - 1;
                }
                else{
                    F -= 1;
                }
                if(C==n-1){
                    C=0;
                }
                else{
                    C += 1;
                }
            }
            System.out.println("   " + F + "      " + C + "       " + i);
        }
    }
   
}
