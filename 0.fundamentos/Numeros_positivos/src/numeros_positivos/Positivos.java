/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_positivos;

/**
 *
 * @author jorge
 */
public class Positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        int Positivos = 0;
        float Numero;
        
        //Ciclo do-white
        do{
            //Lectura de datos
            System.out.println("Proporcionar numero");
            Numero = Leer.datoFloat();
            
            //Procesos
            if(Numero>0) {
                Positivos += 1;
            }
        }while(Numero!=0);
        
        //Imprecion de resultados
        System.out.println("La cantidad de numeros positivos es:" + Positivos);
    }
}
