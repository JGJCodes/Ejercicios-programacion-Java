/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package areasgeometricas;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    public static void main(String[] args) {
        byte opcion = 0;
        while(opcion!=5){
             System.out.println("*********************************");
             System.out.println("Áreas de las figuras geométricas");
             System.out.println("*********************************");
             System.out.println("******1.-Circulo*****************");
             System.out.println("******2.-Triángulo***************");
             System.out.println("***3.-Rectángulo*****************");
             System.out.println("******4.-Cuadrado****************");
             System.out.println("******5.-Salir*******************");
             System.out.println("***Elige una opción**************");
             opcion = Leer.datoByte();
             switch(opcion){
                  case 1:FigurasGeometricas.Circulo();
                         System.out.print("Pulse <enter> para continuar");
                         Leer.dato();
                         break;
                  case 2:FigurasGeometricas.Triángulo();
                         System.out.print("Pulse <enter> para continuar");
                         Leer.dato();
                         break;
                  case 3:FigurasGeometricas.Rectángulo();
                         System.out.print("Pulse <enter> para continuar");
                         Leer.dato();
                         break;
                  case 4:FigurasGeometricas.Cuadrado();
                         System.out.print("Pulse <enter> para continuar");
                         Leer.dato();
                         break;
                  case 5:System.out.println("***Fin del programa****");
                         break;
                  default:System.out.println("Opcion incorrecta... pulse <enter> para continuar");
                          Leer.dato();
               }
          }
    }

}
