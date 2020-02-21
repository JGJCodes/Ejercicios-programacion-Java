/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serializacion;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File FileDat =new File("Libros.dat");
        BufferedReader Br =null;
        FileReader Fr =null;
        ObjectOutputStream OOSLibro =null;
        Libro ObjLibro =new Libro();
        String titulo ="";
        try{
            Br =new BufferedReader(new FileReader(new File("Libros.txt")));
            OOSLibro =new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FileDat)));
            titulo =Br.readLine();
            while(titulo!=null){
                System.out.println(titulo);
                ObjLibro.setTitulo(titulo);
                ObjLibro.setSubtitulo(Br.readLine());
                ObjLibro.setAutor(Br.readLine());
                ObjLibro.setNumEdicion(Br.readLine());
                ObjLibro.setAñoEdicion(Short.parseShort(Br.readLine()));
                ObjLibro.setEditorial(Br.readLine());
                ObjLibro.setNumClasificacion(Br.readLine());
                ObjLibro.setNumInventario(Integer.parseInt(Br.readLine()));
                OOSLibro.writeObject(ObjLibro);
                OOSLibro.flush();
                titulo =Br.readLine();
            }
            OOSLibro.close();
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
    }
}
