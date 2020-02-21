/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inventario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;


/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File ArchivoVentas;
        FileReader Fr;
        BufferedReader Br;
        try{
            ArchivoVentas = new File ("Ventas.txt");
            Fr=new FileReader(ArchivoVentas);
            Br=new BufferedReader(Fr);
            float Ventas[][]=new float [6][8];
            Main.CapturarVentas(Ventas,Br);
            Main.TotalVentasxSuc(Ventas);
            Main.TotalVentasxDia(Ventas);
            Main.TotalVentas(Ventas);
            Main.DesplegarVentas(Ventas);
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }

    }

    public static void CapturarVentas(float [][]V,BufferedReader Br ){
      StringTokenizer token;
      String entrada;
      for(int s=0;s<5;s++){
          try{
              entrada = Br.readLine();
              token = new StringTokenizer(entrada);
              for(int d=0;d<7;d++){
                  V[s][d] = Float.parseFloat(token.nextToken());
                  //System.out.println(V[s][d]);
              }
          }
          catch(Exception e){
              System.out.println("Error en la entrada de datos");
          }
      }
    }

    /**
    public static void CapturarVentas(float [][]V){
        for(int s=0;s<5;s++){
            for(int d=0;d<7;d++){
                System.out.print("Ventas ("+ s + "," + d +")=");
                V[s][d]=Leer.datoFloat();
            }
        } 
    }
    */
    public static void TotalVentasxSuc(float [][]V){
        for(int s=0;s<5;s++){
            for(int d=0;d<7;d++){
                V[s][7]+=V[s][d];
            }
        }
    }

    public static void TotalVentasxDia(float[][]V){
        for(int d=0;d<7;d++){
            for(int s=0;s<5;s++){
                V[5][d]+=V[s][d];
            }
        }
    }

    public static void TotalVentas(float[][]V){
        int d,s,op;
        System.out.println("Elegir forma de calcular el total de ventas");
        System.out.println("1.-Sumatoria de las ventas por dia por sucursal");
        System.out.println("2.-Sumatoria del total de ventas por sucursal");
        System.out.println("3.-Sumatoria del total de ventas por dia");
        op=Leer.datoInt();
        while(op>3 || op<1){
            System.out.println("Opcion incorrecta, vuelve a intentar");
            op=Leer.datoInt();
        }
        switch(op){
            case 1:for(s=0;s<5;s++){
                    for(d=0;d<7;d++){
                        V[5][7]+=V[s][d];
                    }
                   }
                   break;
            case 2:for(s=0,d=7;s<5;s++){
                    V[5][7]+=V[s][d];
                   }
                   break;
            case 3:for(d=0,s=5;d<7;d++){
                    V[5][7]+=V[s][d];
                   }
                   break;
        }
    }

    public static void DesplegarVentas(float [][]V){
        System.out.println("\t\t\tArreglo de un inventario");
        for(int s=0;s<6;s++){
            for(int d=0;d<8;d++){
                System.out.print(V[s][d] + "\t");
            }
            System.out.println();
        }
    }
}
