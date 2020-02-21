/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;

/**
 *
 * @author jorge
 */
public class Numerocapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variables
        int Numero, Respaldo, Potencia, Exponente = 1, Digito, Contador = 0, Invertido = 0, Sumatoria = 0, Pares = 0, Impares = 0, i;
        
        //Lectura de datos
        System.out.println("Ingresar el numero");
        Numero = Leer.datoInt();
        
        //Procesos
        Respaldo = Numero;
        while(Respaldo>0) {
            Respaldo /= 10;
            Contador += 1;
        }
        Respaldo = Numero;
        for(i=1; i<=Contador;i+=1) {
            Potencia = (int) Math.pow(10, Contador-i);
            Digito =  Respaldo / Potencia;
            Respaldo -= Digito * Potencia;
            Sumatoria += Digito;
            Invertido += Digito * Exponente;
            Exponente *= 10;
            if (Digito % 2 == 0) {
                Pares += 1;
            }
            else {
                Impares += 1;
            }
        }
        
        //Impresion de resultados
        System.out.println("El numero con las cifras invertidas es:" + Invertido);
        System.out.println("El numero de cifras que tiene el numero es:" + Contador);
        System.out.println("La sumatoria de las cifras es:" + Sumatoria);
        System.out.println("El numero de cifras pares es:" + Pares);
        System.out.println("El numero de cifras impares es:" + Impares);
        if(Numero==Invertido) {
            System.out.println("El numero es capicua");
        }  
        else {
            System.out.println("El numero no es capicua");
        }
    }
}
