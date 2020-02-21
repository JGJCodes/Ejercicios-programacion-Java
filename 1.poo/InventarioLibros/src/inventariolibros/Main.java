/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inventariolibros;

import leer.Leer;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro ObjLibros =new Libro();
        String Lectura = null;
        short opc=0;
        while(opc!=2){
            System.out.println("Inventario de Libros");
            System.out.println(" 1.-Agregar libro");
            System.out.println("    2.-Salir");
            opc =Leer.datoShort();
            if(opc==1){
                Main.AgregarLibro(Lectura, ObjLibros);
            }
        }
        System.out.println("Gracias por entrar");
        
    }

    public static void AgregarLibro(String l,Libro Objl){
        System.out.print("Ingresar Titulo: ");
        Objl.setTitulo(l =Leer.dato());
        System.out.print("\nIngresar Subtitulo: ");
        Objl.setSubtitulo(l =Leer.dato());
        System.out.print("\nIngresar Autor: ");
        Objl.setAutor(l =Leer.dato());
        System.out.print("\nIngresar Editorial: ");
        Objl.setEditorial(l =Leer.dato());
        System.out.print("\nIngresar Año de edición: ");
        Objl.setAñoEdicion(Short.parseShort(l=Leer.dato()));
        System.out.print("\nIngresar Número de edición: ");
        Objl.setNumEdicion(l =Leer.dato());
        System.out.print("\nIngresar Número de clasificación: ");
        Objl.setNumClasificacion(l =Leer.dato());
        System.out.print("\nIngresar Número de inventario: ");
        Objl.setNumInventario(Integer.parseInt(l =Leer.dato()));
    }

}
