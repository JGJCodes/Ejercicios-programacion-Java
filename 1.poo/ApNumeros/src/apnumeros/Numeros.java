/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package apnumeros;

/**
 *
 * @author Usuario
 */
public class Numeros {

    private int N;

    private int []X;

    public Numeros(int n)
    {
        N = n;
        X = new int [N];
    }

    public void Genera()
    {
        for(int i=0;i<=N-1;i++){
            X[i] = (int)(Math.random()*100);
        }
    }

    public void Muestra()
    {
        for(int i=0;i<=N-1;i++){
            System.out.println(X[i]);
        }
    }

    public void Ordena()
    {
        int aux=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<=N-1;j++){
                if(X[i]>X[j]){
                    aux = X[i];
                    X[i]=X[j];
                    X[j]= aux;
                }
            }
        }
    }

}
