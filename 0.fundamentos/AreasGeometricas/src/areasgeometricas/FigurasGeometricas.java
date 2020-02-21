/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package areasgeometricas;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class FigurasGeometricas {

    public static void Circulo() {
        double Pi=3.1416,area;
        int radio;
        System.out.println("Área del CIRCULO");
        System.out.print("Ingresar el radio: ");
        radio=Leer.datoInt();
        area=Pi*(Math.pow(radio,2));
        System.out.println("\nEl área del circulo es: " + area);
    }

    public static void Triángulo() {
        double area;
        int base,altura;
        System.out.println("Área del TRIÁNGULO");
        System.out.print("Ingresar la base: ");
        base=Leer.datoInt();
        System.out.print("Ingresar la altura: ");
        altura=Leer.datoInt();
        area=(altura*base)/2;
        System.out.println("\nEl área del triángulo es: " + area);
    }

    public static void Cuadrado() {
        int lado,area;
        System.out.println("Área del CUADRADO");
        System.out.print("Ingresar el lado: ");
        lado=Leer.datoInt();
        area=(int)(Math.pow(lado,2));
        System.out.println("\nEl área del cuadrado es: " + area);
    }

    public static void Rectángulo() {
        int base,altura,area;
        System.out.println("Área del RECTÁNGULO");
        System.out.print("Ingresar la base: ");
        base=Leer.datoInt();
        System.out.print("Ingresar la altura: ");
        altura=Leer.datoInt();
        area=altura*base;
        System.out.println("\nEl área del rectángulo es: " + area);
    }

}
