/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_semana;

/**
 *
 * @author jorge
 */
public class Dia_letra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
         char Dialetra;
        
        //Lectura de datos
        System.out.println("Letra correspondiente al dia (L,M,I,J,V,S,D)");
        Dialetra = Leer.datoChar();
        
        switch(Dialetra)
        {
            case "L": 
            case "l": System.out.println("Lunes");    
            break;
            case "M": 
            case "m": System.out.println("Martes");    
            break;
            case "I": ;
            case "i": System.out.println("Miercoles");    
            break;
            case "J": ;
            case "j": System.out.println("Jueves");    
            break;
            case "V": ;
            case "v": System.out.println("Viernes");    
            break;
            case "S": ;
            case "s": System.out.println("Sabado");    
            break;
            case "D": ;
            case "d": System.out.println("Domingo");    
            break;
        }
    }
}
