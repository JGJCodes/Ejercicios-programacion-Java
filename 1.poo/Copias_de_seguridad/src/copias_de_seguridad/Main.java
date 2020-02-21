/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package copias_de_seguridad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
        String NAE ="";
        String NAS ="";
        String linea ="";
        File AE =null;
        File AS =null;
        FileReader Fr =null;
        FileWriter Fw =null;
        BufferedReader Br =null;
        BufferedWriter Bw =null;
        System.out.print("Nombre del archivo de entrada: ");
        NAE =Leer.dato();
        System.out.print("\nNombre del archivo de salida: ");
        NAS =Leer.dato();
        try{
            AE =new File(NAE);
            AS =new File(NAS);
            Fr =new FileReader(AE);
            Fw =new FileWriter(AS);
            Br =new BufferedReader(Fr);
            Bw =new BufferedWriter(Fw);
            linea = Br.readLine();
            while(linea!=null){
                System.out.println("\n"+linea);
                Bw.write(linea+"\n");
                linea =Br.readLine();
            }
            Bw.flush();
            Fr.close();
            Fw.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
    }

    

}
