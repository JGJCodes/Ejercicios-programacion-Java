package cola;

import java.util.Scanner;

public class COLA {

    public static void main(String[] args) {
        Scanner leo = new Scanner(System.in);
        int dato, tamañocola;
        byte var;

        System.out.println("==COLA==\nIngresa el tamaño de la cola");
        tamañocola = leo.nextInt();

        int cola[] = new int[tamañocola];
        Metodos_Cola mc = new Metodos_Cola(tamañocola);

        do {
            System.out.println("\n1)Insertar valor\n2)Elimina el primer valor "
                    + "insertado\n3)Retorna el primer valor insertado\n4)Verificar"
                    + " si la cola esta vacia\n5)Verificar si la cola esta llena"
                    + "\n6)Eliminar todos los valores\n7)Busca un valor en la cola"
                    + "\n8)Muestra todos los elementos de la cola\n9)Retorna el numero "
                    + "de valores en la cola\n\nElija una opcion");
            var = leo.nextByte();

            switch (var) {

                case 1:
                    System.out.println("Ingresa Valor");
                    dato = leo.nextInt();
                    mc.Insertar(dato);
                    break;

                case 2:
                    mc.Eliminar();
                    break;

                case 3:
                    mc.Info();
                    break;

                case 4:
                    System.out.println("\n" + mc.ColaVacia());
                    break;

                case 5:
                    System.out.println("\n" + mc.ColaLlena());
                    break;

                case 6:
                    mc.Vaciar();
                    break;

                case 7:
                    System.out.println("Ingresa el valor a buscar");
                    dato = leo.nextInt();
                    System.out.println("\n"+mc.Buscar(dato));
                    break;

                case 8:
                    System.out.println("");
                    mc.Imprime();
                    System.out.println("");
                    break;

                case 9:
                    mc.Total();
                    break;

                default:
                    System.out.println("ERROR, ESA OPCION NO EXISTE");
            }

            System.out.println("\nDesea escoger otra opcion? si=1 / no!=1");
            var = leo.nextByte();
            System.out.println("");

        } while (var == 1);
    }
}