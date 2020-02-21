/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formulageneral;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    public static void main(String[] args) {
        FormulaGral P = new FormulaGral();

        //Declaracion de datos
        float a, b, c, X1,X2;

        //Lectura de datos
        System.out.println("Resolución de la Formula General");
        System.out.println("Ingresar los valores de:");
        System.out.print("a =");
        a = Leer.datoFloat();
        System.out.print("\nb =");
        b = Leer.datoFloat();
        System.out.print("\nc =");
        c = Leer.datoFloat();

        //Procesos
        P.setA(a);
        P.setB(b);
        P.setC(c);
        X1 = P.x1();
        X2 = P.x2();

        //Impresion de resultados
        System.out.println("Las raices para la ecuacion " + P.getA() + "X^2 + " + P.getB() + "X + " + P.getC() + " = 0 son X1=" + X1 + " X2=" + X2);
    }

}
