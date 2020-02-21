/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nota_numerica;

/**
 *
 * @author jorge
 */
public class Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        int Nota;
        
        //Lectura de datos
        System.out.println("Ingresar nota numerica");
        Nota = Leer.datoInt();
        
        //Procesos
        switch (Nota)
        {
              //Imprecion de resultados
            case 5: System.out.println("Suficiente");
            break; 
            case 6: System.out.println("Bien");
            break;
            case 7: System.out.println("Notable");
            break;
            default : System.out.println("Nota numerica incorrecta");
            break; 
        }        
    }
}
