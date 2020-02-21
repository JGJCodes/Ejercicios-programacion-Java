/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nota_numerica57;

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

        int Nota;
        System.out.println("Ingresar nota numerica");
        Nota = Leer.datoInt();
        switch (Nota){
                case 5: System.out.println("Suficiente");
                      break;
                case 6: System.out.println("Bien");
                      break;
                case 7: System.out.println("Notable");
                      break;
                default : System.out.println("Nota numerica incorrecta");
                      break;
        }
    }

}
