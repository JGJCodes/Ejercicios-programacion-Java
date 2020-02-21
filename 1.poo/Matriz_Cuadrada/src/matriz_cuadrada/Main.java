/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz_cuadrada;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        System.out.print("Ingresar el tamaño de la matriz:");
        N=Leer.datoInt();
        N+=1;
        float MC[][] = new float[N][N];
        Main.GenerarValores(N,MC);
        Main.PromedioxFila(N,MC);
        Main.PromedioxColumna(N,MC);
        Main.MostrarResultados(N,MC);
    }

    public static void GenerarValores(int n, float M[][]){
        for(int f=0;f<n-1;f++){
            for(int c=0;c<n-1;c++){
                M[f][c]=(int)(Math.random()*100);
            }
        }
    }

    public static void PromedioxFila(int n, float M[][]){
        for(int f=0;f<n-1;f++){
            for(int c=0;c<n-1;c++){
                M[f][n-1]+=M[f][c];
            }
            M[f][n-1]/=(n-1);
        }
    }

    public static void PromedioxColumna(int n, float M[][]){
        for(int c=0;c<n-1;c++){
            for(int f=0;f<n-1;f++){
                M[n-1][c]+=M[f][c];
            }
            M[n-1][c]/=(n-1);
        }
    }

    public static void MostrarResultados(int n, float M[][]){
        System.out.println("\t\tMatriz Cuadrada");
        for(int f=0;f<n;f++){
            for(int c=0;c<n;c++){
                System.out.print(M[f][c]+"\t");
            }
            System.out.println();
        }
    }

}
