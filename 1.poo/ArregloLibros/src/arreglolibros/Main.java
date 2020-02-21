/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglolibros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader Br =null;
        Libro ArregloLibros[] =new Libro[100];
        int TotalLibros =-1;
        try{
            Br =new BufferedReader(new FileReader(new File("Libros.txt")));
            String linea =Br.readLine();
            for(;linea!=null;){
                System.out.println(linea);
                ArregloLibros[++TotalLibros] =new Libro();
                ArregloLibros[TotalLibros].setTitulo(linea);
                ArregloLibros[TotalLibros].setSubtitulo(Br.readLine());
                ArregloLibros[TotalLibros].setAutor(Br.readLine());
                ArregloLibros[TotalLibros].setEditorial(Br.readLine());
                ArregloLibros[TotalLibros].setAñoEdicion(Short.parseShort(Br.readLine()));
                ArregloLibros[TotalLibros].setNumEdicion(Br.readLine());
                ArregloLibros[TotalLibros].setNumClasificacion(Br.readLine());
                ArregloLibros[TotalLibros].setNumInventario(Integer.parseInt(Br.readLine()));
                linea =Br.readLine();
            }
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
    }

}
