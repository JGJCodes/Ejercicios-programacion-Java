/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nota_media;

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
        int Asignatura1, Asignatura2,Asignatura3,Nota_media, Nota_media1 = 0, Nota_media2 = 0, Nota_media3 = 0, Nota_media4 = 0, Nota_media5 = 0, Alumno=1;
        
        //Ciclo While 
        while(Alumno<=5) {
            //Lectura de datos
            System.out.print("Proporcionar la nota de la asignatura");
            Asignatura1 = Leer.datoInt();
            System.out.print("Proporcionar la nota de la asignatura");
            Asignatura2 = Leer.datoInt();
            System.out.print("Proporcionar la nota de la asignatura");
            Asignatura3 = Leer.datoInt();
            //Procesos
            Nota_media = (Asignatura1 + Asignatura2 + Asignatura3)/3;
            if(Alumno==1) {
                Nota_media1 = Nota_media;
            }
            if(Alumno==2) {
                Nota_media2 = Nota_media;
            }
            if(Alumno==3) {
                Nota_media3 = Nota_media;
            }
            if(Alumno==4) {
                Nota_media4 = Nota_media;
            }
            if(Alumno==5) {
                Nota_media5 = Nota_media;
            }
            Alumno +=1;
        }
        System.out.println("La nota media de las tres asignaturas del primer alumno es:" + Nota_media1);
        System.out.println("La nota media de las tres asignaturas del segundo alumno es:" + Nota_media2);
        System.out.println("La nota media de las tres asignaturas del tercer alumno es:" + Nota_media3);
        System.out.println("La nota media de las tres asignaturas del cuarto alumno es:" + Nota_media4);
        System.out.println("La nota media de las tres asignaturas del quinto alumno es:" + Nota_media5);
    }
}
