/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;

/**
 *
 * @author jorge
 */
public class Cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variabeles
        float Monto_pagar, Cantidad_entregada, Cambio;
        int B1000, B500, B200,B100, B50, B20, M10, M5, M2, M1, C50, C20, C10, C5;
        
        //Lectura de datos
        System.out.print("Monto a pagar");
        Monto_pagar = Leer.datoFloat();
        System.out.print("Cantidad entregada");
        Cantidad_entregada = Leer.datoFloat();
        
        //Procesos
        Cambio = Cantidad_entregada - Monto_pagar;
        System.out.println("El cambio es: $" + Cambio);
        if(Cambio>=1000){
            B1000 = (int) Cambio / 1000;
            Cambio %= 1000;
            System.out.println("Billetes de $1000.00: " + B1000);
        }
        if(Cambio>=500){
            B500 = (int) Cambio / 500;
            Cambio %= 500;
            System.out.println("Billetes de $500.00: " + B500);
        }
        if(Cambio>=200){
            B200 = (int) Cambio / 200;
            Cambio %= 200;
            System.out.println("Billetes de $200.00: " + B200);
        }
        if(Cambio>=100){
            B100 = (int) Cambio / 100;
            Cambio %= 100;
            System.out.println("Billetes de $100.00: " + B100);
        }
        if(Cambio>=50){
            B50 = (int) Cambio / 50;
            Cambio %= 50;
            System.out.println("Billetes de $50.00: " + B50);
        }
        if(Cambio>=20){
            B20 = (int) Cambio / 20;
            Cambio %= 20;
            System.out.println("Billetes de $20.00: " + B20);
        }
        if(Cambio>=10){
            M10 = (int) Cambio / 10;
            Cambio %= 10;
            System.out.println("Monedas de $10.00: " + M10);
        }
        if(Cambio>=5){
            M5 = (int) Cambio / 5;
            Cambio %= 5;
            System.out.println("Monedas de $5.00: " + M5);
        }
        if(Cambio>=2){
            M2 = (int) Cambio / 2;
            Cambio %= 2;
            System.out.println("Monedas de $2.00: " + M2);
        }
        if(Cambio>=1){
            M1 = (int) Cambio / 1;
            Cambio %= 1;
            System.out.println("Monedas de $1.00: " + M1);
        }
        if(Cambio>=0.5){
            C50 = (int) (Cambio / 0.5);
            Cambio %= 0.5;
            System.out.println("Monedas de €50.00: " + C50);
        }
        if(Cambio>=0.2){
            C20 = (int) (Cambio / 0.2);
            Cambio %= 0.2;
            System.out.println("Monedas de €20.00: " + C20);
        }
        if(Cambio>=0.1){
            C10 = (int) (Cambio / 0.1);
            Cambio %= 0.1;
            System.out.println("Monedas de €10.00: " + C10);
        }
        if(Cambio>=0.05){
            C50 = (int) (Cambio / 0.5);
            Cambio %= 0.5;
            System.out.println("Monedas de €50.00: " + C50);
        }
    }
}
