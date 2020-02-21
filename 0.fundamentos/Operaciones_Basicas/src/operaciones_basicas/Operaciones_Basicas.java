/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_basicas;


/**
 *
 * @author jorge
 */
public class Operaciones_Basicas {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {

          short opcion = 0;
          while(opcion!=5){
               System.out.println("***********************");
               System.out.println("OPERACIONES BASICAS");
               System.out.println("***********************");
               System.out.println("******1.-Suma**********");
               System.out.println("******2.-Resta*********");
               System.out.println("***3.-Multiplicación***");
               System.out.println("******4.-División******");
               System.out.println("******5.-Salir*********");
               System.out.println("***Elige una opción****");
               opcion = Leer.datoShort();
               switch(opcion){
                    case 1:Operaciones.Suma();
                                   break;
                    case 2:Operaciones.Resta();
                                   break;
                    case 3:Operaciones.Multiplicacion();
                                   break;
                    case 4:Operaciones.Division();
                                   break;
                    case 5:System.out.println("***Fin del programa****");
                                   Leer.dato();
                                   break;
                    default:System.out.println("Opcion incorrecta... pulse <enter> para continuar");
                                       Leer.dato();
               }
          }
     }
}
