/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package copiainputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

        //Paso numero 2
        String NAE ="";
        String NAS ="";
        String linea ="";
        File AE =null;
        File AS =null;
        FileInputStream Fi =null;
        InputStreamReader Ir =null;
        BufferedReader Br =null;
        FileOutputStream Fo =null;
        OutputStreamWriter Or =null;
        BufferedWriter Bw =null;

        //Paso numero 3
        System.out.print("Nombre del archivo de entrada: ");
        NAE =Leer.dato();
        System.out.print("\nNombre del archivo de salida: ");
        NAS =Leer.dato();

        //Paso numero 4 y 5
        try{
            AE =new File(NAE);
            AS =new File(NAS);
            Fi =new FileInputStream(AE);
            Fo =new FileOutputStream(AS);
            Ir =new InputStreamReader(Fi);
            Or =new OutputStreamWriter(Fo);
            Br =new BufferedReader(Ir);
            Bw =new BufferedWriter(Or);
            linea =Br.readLine();
            while(linea!=null){ //Paso 5
                System.out.println("\n"+linea);
                Bw.write(linea + "\n");
                linea =Br.readLine();
            }
            Bw.flush();
            Fi.close();
            Fo.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
    }

}
