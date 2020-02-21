/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_basicas;


/**
 *
 * @author jorge
 */
public class Operaciones {
     
     public static void Suma()
     {
          int op1,op2,respuesta,resultado;
          op1 = (int) (Math.random()*100);
          op2 = (int) (Math.random()*100);
          System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " + " + op2 + " = ");
          respuesta = Leer.datoInt();
          resultado = op1+op2;
          while(resultado!=respuesta){
               System.out.println("Incorrecto...Vuelvelo a intentar");
               System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " + " + op2 + " = ");
               respuesta = Leer.datoInt();
               resultado = op1+op2;
          }
          System.out.println("Correcto");
     }
     
     public static void Resta()
     {
          int op1,op2,respuesta,resultado;
          op1 = (int) (Math.random()*100);
          op2 = (int) (Math.random()*100);
          System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " - " + op2 + " = ");
          respuesta = Leer.datoInt();
          resultado = op1-op2;
          while(resultado!=respuesta){
               System.out.println("Incorrecto...Vuelvelo a intentar");
               System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " - " + op2 + " = ");
               respuesta = Leer.datoInt();
               resultado = op1-op2;
          }
          System.out.println("Correcto");
     }
     
     public static void Multiplicacion()
     {
          int op1,op2,respuesta,resultado;
          op1 = (int) (Math.random()*100);
          op2 = (int) (Math.random()*100);
          System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " * " + op2 + " = ");
          respuesta = Leer.datoInt();
          resultado = op1*op2;
          while(resultado!=respuesta){
               System.out.println("Incorrecto...Vuelvelo a intentar");
               System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " * " + op2 + " = ");
               respuesta = Leer.datoInt();
               resultado = op1*op2;
          }
          System.out.println("Correcto");
     }
     
     public static void Division()
     {
          int op1,op2,respuesta,resultado;
          op1 = (int) (Math.random()*100);
          op2 = (int) (Math.random()*100);
          System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " / " + op2 + " = ");
          respuesta = Leer.datoInt();
          resultado = op1/op2;
          while(resultado!=respuesta){
               System.out.println("Incorrecto...Vuelvelo a intentar");
               System.out.print("Cuál es el resultado de la siguiente operacion? " + op1 + " / " + op2 + " = ");
               respuesta = Leer.datoInt();
               resultado = op1/op2;
          }
          System.out.println("Correcto");
     }
}
