/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadromagico;

/**
 *
 * @author jorge
 */
public class CCuadroMagico {
   
   static int[][] x;

    public static void GeneralCM(int n)
    {
        x = new int [n][n];
        int F=0,C=n/2,i=1;
        System.out.println(" Fila | Columna | i ");
        System.out.println("   " + F + "      " + C + "       " + i);
        x[F][C]=i;
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
            x[F][C]=i;
        }
    }

    public static void ImprimirCM(int n)
    {
        int i,j;
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                System.out.print(x[i][j]+"   ");
            }
            System.out.println("");
        }
    }
}
