package algoritmos_procesador;

import java.util.Scanner;

public class Algoritmos_Procesador {

    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);
        int numeroprocesos, prioridad, auxprimero;

        System.out.println("Ingresa el numero de procesos");
        numeroprocesos = leo.nextInt();

        int matriz[][] = new int[numeroprocesos][8];
        String arreglo[] = new String[numeroprocesos];
        String auxarreglo[] = new String[numeroprocesos];


        for (int i = 0; i < numeroprocesos; i++) {
            System.out.println("\nIngrese el Nombre del procesos " + (i + 1));
            arreglo[i] = leo.next();
            System.out.println("Ingrese el tiempo de llegada");
            matriz[i][0] = leo.nextInt();
            System.out.println("Ingrese la Prioridad");
            matriz[i][1] = leo.nextInt();
            System.out.println("Ingrese su Rafaga CPU (Tiempo de Servicio)");
            matriz[i][2] = leo.nextInt();
        }

        auxprimero = matriz[0][0];

        for (int i = 0; i < numeroprocesos; i++) {
            for (int j = 0; j < numeroprocesos; j++) {
                if (auxprimero > matriz[j][0]) {
                    auxprimero = matriz[j][0];
                }
            }
        }

        System.arraycopy(arreglo, 0, auxarreglo, 0, numeroprocesos);

        Algoritmos al = new Algoritmos(numeroprocesos, matriz, arreglo, auxarreglo, auxprimero);

        System.out.print("\n==FCFS==");
        al.FCFS();
        System.out.print("\n==SJF==");
        al.SJF();
        System.out.print("\n==PRIORIDAD==");
        al.Prioridad();
        System.out.println("");
        al.Mejor();
    }
}