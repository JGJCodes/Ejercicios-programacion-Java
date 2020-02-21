package listas_dobles;

import java.util.Scanner;

public class Listas_Dobles {
    
    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);
        
        int dato, auxdato;
        byte var;
        
        ListasDobles lid = new ListasDobles();
        
        do {
            System.out.println("\n== LISTAS DOBLES == \n1)Insertar Inicio\n2)"
                    + "Insertar Final\n3)Insertar Antes\n4)Insertar Despues"
                    + "\n5)Eliminar Primero\n6)Eliminar Ultimo\n7)Buscar Dato"
                    + "\n8)Imprimir de Izquierda a Derecha\n9)Imprimir de "
                    + "Derecha a Izquierda\n10)Finalizar Programa\n\nElige una "
                    + "opcion");
            var = leo.nextByte();
            
            switch (var) {
                case 1:
                    System.out.println("\nIngresa un numero");
                    dato = leo.nextInt();
                    lid.InsertarInicio(dato);
                    break;
                case 2:
                    System.out.println("\nIngresa un numero");
                    dato = leo.nextInt();
                    lid.InsertarFinal(dato);
                    break;
                case 3:
                    System.out.println("\nIngresa un numero");
                    dato = leo.nextInt();
                    System.out.println("Antes de cual numero?");
                    auxdato = leo.nextInt();
                    lid.InsertarAntes(dato, auxdato);
                    break;
                case 4:
                    System.out.println("\nIngresa un numero");
                    dato = leo.nextInt();
                    System.out.println("Despues de cual numero?");
                    auxdato = leo.nextInt();
                    lid.InsertarDespues(dato, auxdato);
                    break;
                case 5:
                    System.out.println("");
                    lid.EliminarPrimero();        
                    break;
                case 6:
                    System.out.println("");
                    lid.EliminarUltimo();
                    break;
                case 7:
                    System.out.println("\nIngresa el numero a buscar");
                    dato = leo.nextInt();
                    lid.Busca(dato);
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("");
                    lid.ImprimeListaDobleIzqDer();
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("");
                    lid.ImprimeListaDobleDerIzq();
                    System.out.println("");
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR, La opcion no existe");
            }
        } while (true);
    }
}