/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colaestatica;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    public static void main(String[] args) {
        char opc = 0;
        Cola A = null;
        while(opc!='\t'){
            opc=Main.Menu(A, opc);
            if(opc=='a')
                A = Main.Crear();
        }
    }
    
    public static char Menu(Cola a, char opcion){
        System.out.println("******************************");
        System.out.println("       Cola Estatica");
        System.out.println("******************************");
        System.out.println("a)Crear cola");
        System.out.println("b)Insertar elemento");
        System.out.println("c)Eliminar elemento");
        System.out.println("d)Contar los elementos");
        System.out.println("e)Mostrar los elementos");
        System.out.println("f)Buscar un elemento");
        System.out.println("g)Limpiar la pila");
        System.out.println("h)Retornar 1° elemento");
        System.out.println("******************************");
        System.out.println("        Elige una opcion");
        System.out.println("Para salir presionar <TAB>");
        System.out.println("******************************");
        opcion = Leer.datoChar();
        switch(opcion){
            case 'h':Main.Retornar(a);
                     break;
                
            case 'a':break;
                
            case 'b':Main.Insertar(a);
                     break;
            
            case 'c':Main.Eliminar(a);
                     break;
            
            case 'd':Main.Contar(a);
                     break;
            
            case 'e':Main.Mostrar(a);
                     break;
            
            case 'f':Main.Buscar(a);
                     break;
            
            case 'g':Main.Limpiar(a);
                     break;
                
            case '\t':System.out.println("Gracias por utilizar cola estatica");
                      break;
            
            default:System.out.println("      opcion incorrecta");
                    System.out.println("******************************");
                    System.out.println("Presionar <enter> para continuar");
                    Leer.dato();
        }
        return opcion;
    }

    public static void Retornar(Cola a) {
        System.out.println("******************************");
        System.out.println(" Retornar el primer elemento");
        System.out.println("******************************");
        System.out.println("\t" + a.Info());
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }

    public static Cola Crear() {
        System.out.println("******************************");
        System.out.println("       Crear Cola");
        System.out.println("******************************");
        System.out.print("Cantidad de elementos: ");
        int dato = Leer.datoInt();
        Cola a = new Cola(dato);
        System.out.println("       Cola creada");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
        return a;
    }

    public static void Insertar(Cola a) {
        System.out.println("******************************");
        System.out.println("      Insertar elementos");
        System.out.println("******************************");
        System.out.print("Ingresar el elemento: ");
        String dato = Leer.dato();
        boolean band = a.Inserta(dato);
        if(band)
            System.out.println("   Elemento insertado");
        else
            System.out.println("     Desbordamiento");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }

    public static void Eliminar(Cola a) {
        System.out.println("******************************");
        System.out.println("      Eliminar elementos");
        System.out.println("******************************");
        boolean band = a.Elimina();
        if(!band)
            System.out.println("     Subdesbordamiento");
        else
            System.out.println("   Principio eliminado");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }

    public static void Contar(Cola a) {
        System.out.println("******************************");
        System.out.println("     Contar los elementos");
        System.out.println("******************************");
        System.out.println("Existen " + a.Total() + " elementos");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }

    public static void Mostrar(Cola a) {
        System.out.println("******************************");
        System.out.println("    Mostrar los elementos");
        System.out.println("******************************");
        System.out.println("Inicio");
        a.Imprime();
        System.out.println("Fin");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }

    public static void Buscar(Cola a) {
        System.out.println("******************************");
        System.out.println("     Busqueda de elementos");
        System.out.println("******************************");
        System.out.print("Elemento a buscar: ");
        String dato = Leer.dato();
        if(a.Busca(dato))
            System.out.println("      Elemento existente");
        else
            System.out.println("     Elemento inexistente");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }
    
    public static void Limpiar(Cola a) {
        System.out.println("******************************");
        System.out.println("      Limpiar la cola");
        System.out.println("******************************");
        a.Vaciar();
        System.out.println("       Cola vaciada");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }

}
