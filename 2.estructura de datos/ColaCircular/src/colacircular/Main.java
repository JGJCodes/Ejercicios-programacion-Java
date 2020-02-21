/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colacircular;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char opc = 0;
        ColaCir A = null;
        while(opc!='\t'){
            opc=Main.Menu(A, opc);
            if(opc=='a')
                A = Main.Crear();
        }
    }
    
    public static char Menu(ColaCir a,char opcion){
        System.out.println("******************************");
        System.out.println("       Cola Circular");
        System.out.println("******************************");
        System.out.println("a)Crear cola");
        System.out.println("b)Insertar elemento");
        System.out.println("c)Eliminar elemento");
        System.out.println("d)Mostrar los elementos");
        System.out.println("e)Buscar un elemento");
        System.out.println("******************************");
        System.out.println("        Elige una opcion");
        System.out.println("Para salir presionar <TAB>");
        System.out.println("******************************");
        opcion = Leer.datoChar();
        switch(opcion){
                
            case 'a':break;
                
            case 'b':Main.Insertar(a);
                     break;
            
            case 'c':Main.Eliminar(a);
                     break;
            
            case 'd':Main.Mostrar(a);
                     break;
            
            case 'e':Main.Buscar(a);
                     break;
                
            case '\t':System.out.println("Gracias por utilizar pila estatica");
                      break;
            
            default:System.out.println("      opcion incorrecta");
                    System.out.println("******************************");
                    System.out.println("Presionar <enter> para continuar");
                    Leer.dato();
        }
        return opcion;
    }

    public static void Buscar(ColaCir a) {
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

    public static void Mostrar(ColaCir a) {
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

    public static void Eliminar(ColaCir a) {
        System.out.println("******************************");
        System.out.println("      Eliminar elementos");
        System.out.println("******************************");
        boolean band = a.Eliminar();
        if(!band)
            System.out.println("     Subdesbordamiento");
        else
            System.out.println("   Principio eliminado");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
    }

    public static void Insertar(ColaCir a) {
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

    public static ColaCir Crear() {
        System.out.println("******************************");
        System.out.println("       Crear Cola");
        System.out.println("******************************");
        System.out.print("Cantidad de elementos: ");
        int dato = Leer.datoInt();
        ColaCir a = new ColaCir(dato);
        System.out.println("       Cola creada");
        System.out.println("******************************");
        System.out.println("Presionar <enter> para continuar");
        Leer.dato();
        return a;
    }
}
