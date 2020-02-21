package algoritmos_procesador;

public class Algoritmos {

    int numeroprocesos, auxtiemposervicio, auxtimpollegada, auxprioridad, contador, auxfinalizacion;
    int[][] matriz = new int[numeroprocesos][8];
    String arreglo[] = new String[numeroprocesos], aux2;
    float promedioturnaround = 0f, promediotiempoespera = 0f;
    float arregloM[] = new float[3];
    String auxarreglo[] = new String[numeroprocesos];
    int auxmatriz[] = new int[7], auxprimero, nosolucion;

    public Algoritmos(int numeroprocesos, int matriz[][], String arreglo[], String auxarreglo[], int auxprimero) {
        this.matriz = matriz;
        this.numeroprocesos = numeroprocesos;
        this.arreglo = arreglo;
        this.auxarreglo = auxarreglo;
        this.auxprimero = auxprimero;
    }

    public void Operaciones() {
        auxfinalizacion = 0;
        promedioturnaround = 0f;
        promediotiempoespera = 0f;

        for (int i = 0; i < numeroprocesos; i++) {
            matriz[i][7] = 0;
            if (matriz[i][0] == auxprimero) {
                matriz[i][3] = matriz[i][0];
                matriz[i][4] = matriz[i][2] + matriz[i][3];
                matriz[i][5] = matriz[i][4] - matriz[i][0];
                matriz[i][6] = matriz[i][3] - matriz[i][0];
                matriz[i][7] = 1;
                promedioturnaround += matriz[i][5];
                promediotiempoespera += matriz[i][6];
                auxfinalizacion = matriz[i][4];
            }
        }

        for (int i = 0; i < numeroprocesos; i++) {
            for (int j = 0; j < numeroprocesos; j++) {
                if (auxfinalizacion >= matriz[j][0] && matriz[j][7] != 1) {
                    matriz[j][3] = auxfinalizacion;
                    matriz[j][4] = matriz[j][2] + matriz[j][3];
                    matriz[j][5] = matriz[j][4] - matriz[j][0];
                    matriz[j][6] = matriz[j][3] - matriz[j][0];
                    promedioturnaround += matriz[j][5];
                    promediotiempoespera += matriz[j][6];
                    matriz[j][7] = 1;
                    auxfinalizacion = matriz[j][4];
                    break;
                }
            }
        }
        IMPRIME();
    }

    public void FCFS() {
        for (int i = 0; i < numeroprocesos; i++) {
            for (int j = 0; j < numeroprocesos - 1; j++) {
                if (matriz[j][0] > matriz[j + 1][0]) {
                    auxtiemposervicio = matriz[j][2];
                    matriz[j][2] = matriz[j + 1][2];
                    matriz[j + 1][2] = auxtiemposervicio;
                    aux2 = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux2;
                    auxtimpollegada = matriz[j][0];
                    matriz[j][0] = matriz[j + 1][0];
                    matriz[j + 1][0] = auxtimpollegada;
                    auxprioridad = matriz[j][1];
                    matriz[j][1] = matriz[j + 1][1];
                    matriz[j + 1][1] = auxprioridad;
                }
            }
        }
        Operaciones();
    }

    public void SJF() {
        for (int i = 0; i < numeroprocesos; i++) {
            for (int j = 0; j < numeroprocesos - 1; j++) {
                if (matriz[j][2] > matriz[j + 1][2]) {
                    auxtiemposervicio = matriz[j][2];
                    matriz[j][2] = matriz[j + 1][2];
                    matriz[j + 1][2] = auxtiemposervicio;
                    aux2 = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux2;
                    auxtimpollegada = matriz[j][0];
                    matriz[j][0] = matriz[j + 1][0];
                    matriz[j + 1][0] = auxtimpollegada;
                    auxprioridad = matriz[j][1];
                    matriz[j][1] = matriz[j + 1][1];
                    matriz[j + 1][1] = auxprioridad;
                }
            }
        }
        Operaciones();
    }

    public void Prioridad() {
        for (int i = 0; i < numeroprocesos; i++) {
            for (int j = 0; j < numeroprocesos - 1; j++) {
                if (matriz[j][1] < matriz[j + 1][1]) {
                    auxtiemposervicio = matriz[j + 1][2];
                    matriz[j + 1][2] = matriz[j][2];
                    matriz[j][2] = auxtiemposervicio;
                    aux2 = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux2;
                    auxtimpollegada = matriz[j + 1][0];
                    matriz[j + 1][0] = matriz[j][0];
                    matriz[j][0] = auxtimpollegada;
                    auxprioridad = matriz[j][1];
                    matriz[j][1] = matriz[j + 1][1];
                    matriz[j + 1][1] = auxprioridad;
                }
            }
        }
        Operaciones();
    }

    public void IMPRIME() {
        nosolucion = 0;
        for (int i = 0; i < numeroprocesos; i++) {
            if (matriz[i][7] == 0) {
                nosolucion = -1;
            }
        }

        if (nosolucion == -1) {
            System.out.println("\nERROR, NO HAY SOLUCION COMPLETA AL ALGORITMO");
        } else {
            for (int i = 0; i < numeroprocesos; i++) {
                for (int j = 0; j < numeroprocesos - 1; j++) {
                    if (auxarreglo[i].equals(arreglo[j])) {
                        aux2 = arreglo[i];
                        arreglo[i] = auxarreglo[i];
                        arreglo[j] = aux2;
                        System.arraycopy(matriz[i], 0, auxmatriz, 0, 7);
                        System.arraycopy(matriz[j], 0, matriz[i], 0, 7);
                        System.arraycopy(auxmatriz, 0, matriz[j], 0, 7);
                    }
                }
            }

            System.out.println("\nProceso| |tiempo de llegada| |Prioridad| "
                    + "|tiempo de servicio| |tiempo de comienzo| "
                    + "|tiempo de finalizacion| |turnaround| |tiempo espera|");
            for (int i = 0; i < numeroprocesos; i++) {
                System.out.print(arreglo[i] + "                ");
                for (int j = 0; j < 7; j++) {
                    System.out.print(matriz[i][j] + "                  ");
                    if (j == 6) {
                        System.out.println("");
                    }
                }
            }
            System.out.println("Promedio                                           "
                    + "                                                            "
                    + promedioturnaround / numeroprocesos + "                  "
                    + promediotiempoespera / numeroprocesos);
            arregloM[contador] = promedioturnaround / numeroprocesos;
            contador += 1;
        }
    }

    public void Mejor() {

        if (arregloM[0] < arregloM[1] && arregloM[0] < arregloM[2]) {
            System.out.println("FCFS ES EL MEJOR");
        }
        if (arregloM[1] < arregloM[0] && arregloM[1] < arregloM[2]) {
            System.out.println("SJF ES EL MEJOR");
        }
        if (arregloM[2] < arregloM[1] && arregloM[2] < arregloM[0]) {
            System.out.println("PRIORIDAD ES EL MEJOR");
        }
        if (arregloM[0] == arregloM[1] && arregloM[0] < arregloM[2]) {
            System.out.println("FCFS y SJF SON LOS MEJORES");
        }
        if (arregloM[0] == arregloM[2] && arregloM[0] < arregloM[1]) {
            System.out.println("FCFS y PRIORIDAD SON LOS MEJORES");
        }
        if (arregloM[1] == arregloM[2] && arregloM[1] < arregloM[0]) {
            System.out.println("PRIORIDAD y SJF SON LOS MEJORES");
        }
        if (arregloM[0] == arregloM[1] && arregloM[0] == arregloM[2]) {
            System.out.println("FCSF, SJF Y PRIORIDAD SON IGUALES");
        }
    }
}