/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package estatura;

/**
 *
 * @author android
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float Alumno;
        int Cantidad120 = 0, Cantidad150 = 0, Cantidad160 = 0, Cantidad = 0;
        do{
         System.out.print("Ingresar la estatura del alumno");
         Alumno = Leer.datoFloat();
         if(Alumno>0 && Alumno<=1.20)
                Cantidad120 += 1;
         if(Alumno>1.20 && Alumno<=1.50)
                Cantidad150 += 1;
         if(Alumno>1.50 && Alumno<=1.60)
                Cantidad160 += 1;
         if(Alumno>1.60)
                Cantidad += 1;
       }while(Alumno!=0);
       System.out.println("Los alumnos que miden menor o igual que 1.20m de estatura son:" + Cantidad120);
       System.out.println("Los alumnos que miden menor o igual que 1.50m de estatura son:" + Cantidad150);
       System.out.println("Los alumnos que miden menor o igual que 1.60m de estatura son:" + Cantidad160);
       System.out.println("Los alumnos que miden mayor que 1.60m de estatura son:" + Cantidad);
    }

}
