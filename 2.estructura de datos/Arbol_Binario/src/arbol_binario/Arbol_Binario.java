package arbol_binario;

import java.util.Scanner;

public class Arbol_Binario {

    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);

        int dato;
        byte var;

        ArbolBinario ab = new ArbolBinario();

        do {
            System.out.println("\n== ARBOL BINARIO ==\n1)Insertar Nodo\n2)"
                    + "Eliminar Nodo\n3)Buscar Nodo\n4)Sumar Nodos\n5)Profundidad "
                    + "del Arbol\n6)Contar Nodos\n7)Contar Hojas\n8)Imprimir"
                    + " Preorden\n9)Imprimir Inorden\n10)Imprimir Postorden\n"
                    + "11)Finalizar Aplicacion\n\nEliga una opcion");
            var = leo.nextByte();

            switch (var) {
                case 1:
                    System.out.println("Ingresa un numero");
                    dato = leo.nextInt();
                    System.out.println("");
                    ab.Insertar(dato);
                    break;
                case 2:
                    System.out.println("Ingresa el numero a eliminar");
                    dato = leo.nextInt();
                    System.out.println("");
                    ab.EliminarNodo(dato);
                    break;
                case 3:
                    System.out.println("Ingresa el numero a buscar");
                    dato = leo.nextInt();
                    System.out.println("");
                    ab.BuscarNodo(dato);
                    break;
                case 4:
                    System.out.println("\nSuma de todos los nodos: " + ab.SumarNodos());
                    break;
                case 5:
                    System.out.println("\nProfundidad del arbol: " + ab.ProfundidadArbol());
                    break;
                case 6:
                    System.out.println("\nCantidad de nodos del árbol: " + ab.CantidadNodos());
                    break;
                case 7:
                    System.out.println("\nCantidad de nodos hoja: " + ab.CantidadNodosHoja());
                    break;
                case 8:
                    System.out.println("");
                    ab.ImprimePreorden();
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("");
                    ab.ImprimirInorden();
                    System.out.println("");
                    break;
                case 10:
                    System.out.println("");
                    ab.ImprimirPostorden();
                    System.out.println("");
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR, No existe esa opcion");
            }
        } while (true);
    }
}