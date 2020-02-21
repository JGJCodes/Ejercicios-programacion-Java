/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nracional;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int Opcion=0;

        while(Opcion!=5)
        {
            System.out.println("================================================");
            System.out.println("=Operaciones Aritmeticas con Números Racionales=");
            System.out.println("================================================");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("=Elige una opción (1-5)");
            Opcion = Leer.datoInt();

            switch(Opcion)
            {
                case 1: OpcionSuma();
                        break;
                case 2: OpcionResta();
                        break;
                case 3: OpcionMultiplicacion();
                        break;
                case 4: OpcionDivision();
                        break;
                case 5: System.out.println("Fin del programa");
                        Leer.dato();
                        break;
                default: System.out.println("Opcion incorrecta... pulse <enter> para continuar");
                        Leer.dato();
                        break;
            }
        }
    }

    public static void OpcionSuma()
    {
        int an= 0, ad=0, bn=0, bd=0;
        NRacional A = new NRacional();
        NRacional B = new NRacional();
        NRacional C;
        System.out.println("\n\n\n");
        System.out.println("Suma de dos numeros racionales A(num/den) + B(num/den)");
        System.out.println("\nNumerador de A ->");
        an = Leer.datoInt();
        System.out.println("Denominador de A ->");
        ad = Leer.datoInt();
        A.setNumerador(an);
        A.setDenominador(ad);
        System.out.println("\n\nNumerador de B ->");
        bn = Leer.datoInt();
        System.out.println("Denominador de B ->");
        bd = Leer.datoInt();
        B.setNumerador(bn);
        B.setDenominador(bd);
        C = A.Suma(B);
        System.out.println("\n" + A.ToString() + " + " + B.ToString() + " = " + C.ToString());
        System.out.println("Pulse <Enter> para continuar...");
        Leer.dato();
    }

    public static void OpcionResta()
    {
        int an= 0, ad=0, bn=0, bd=0;
        NRacional A = new NRacional();
        NRacional B = new NRacional();
        NRacional C;
        System.out.println("\n\n\n");
        System.out.println("Resta de dos numeros racionales A(num/den) - B(num/den)");
        System.out.println("\nNumerador de A ->");
        an = Leer.datoInt();
        System.out.println("Denominador de A ->");
        ad = Leer.datoInt();
        A.setNumerador(an);
        A.setDenominador(ad);
        System.out.println("\n\nNumerador de B ->");
        bn = Leer.datoInt();
        System.out.println("Denominador de B ->");
        bd = Leer.datoInt();
        B.setNumerador(bn);
        B.setDenominador(bd);
        C = A.Resta(B);
        System.out.println("\n" + A.ToString() + " - " + B.ToString() + " = " + C.ToString());
        System.out.println("Pulse <Enter> para continuar...");
        Leer.dato();
    }

    public static void OpcionMultiplicacion()
    {
        int an= 0, ad=0, bn=0, bd=0;
        NRacional A = new NRacional();
        NRacional B = new NRacional();
        NRacional C;
        System.out.println("\n\n\n");
        System.out.println("Multiplicacion de dos numeros racionales A(num/den) * B(num/den)");
        System.out.println("\nNumerador de A ->");
        an = Leer.datoInt();
        System.out.println("Denominador de A ->");
        ad = Leer.datoInt();
        A.setNumerador(an);
        A.setDenominador(ad);
        System.out.println("\n\nNumerador de B ->");
        bn = Leer.datoInt();
        System.out.println("Denominador de B ->");
        bd = Leer.datoInt();
        B.setNumerador(bn);
        B.setDenominador(bd);
        C = A.Multiplicacion(B);
        System.out.println("\n" + A.ToString() + " * " + B.ToString() + " = " + C.ToString());
        System.out.println("Pulse <Enter> para continuar...");
        Leer.dato();
    }
    
    public static void OpcionDivision()
    {
        int an= 0, ad=0, bn=0, bd=0;
        NRacional A = new NRacional();
        NRacional B = new NRacional();
        NRacional C;
        System.out.println("\n\n\n");
        System.out.println("Division de dos numeros racionales A(num/den) / B(num/den)");
        System.out.println("\nNumerador de A ->");
        an = Leer.datoInt();
        System.out.println("Denominador de A ->");
        ad = Leer.datoInt();
        A.setNumerador(an);
        A.setDenominador(ad);
        System.out.println("\n\nNumerador de B ->");
        bn = Leer.datoInt();
        System.out.println("Denominador de B ->");
        bd = Leer.datoInt();
        B.setNumerador(bn);
        B.setDenominador(bd);
        C = A.Division(B);
        System.out.println("\n" + A.ToString() + " / " + B.ToString() + " = " + C.ToString());
        System.out.println("Pulse <Enter> para continuar...");
        Leer.dato();
    }

}
