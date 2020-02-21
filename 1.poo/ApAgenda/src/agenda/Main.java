/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto Micontacto;
        int op=0;
        String id = null,nombre = null,telefono = null,direccion = null,email = null,fecha_de_nacimiento = null,direccion_Trabajo = null,telefono_trabajo = null;
        while((op=Menu())!=3){
            switch(op){
                case 1:LeerContacto(id,nombre,telefono,direccion,email,fecha_de_nacimiento,direccion_Trabajo,telefono_trabajo);
                       Micontacto = new Contacto(id,nombre,telefono,direccion,email,fecha_de_nacimiento,direccion_Trabajo,telefono_trabajo);
                       break;
                case 2:Micontacto.DesplegarContacto();
                       break;
            }
        }
    }

    public static void LeerContacto(String id,String nombre,String telefono,String direccion,String email, String fecha_de_nacimiento,String direccion_Trabajo,String telefono_trabajo){
        System.out.print("ID:                   " );
        id=Leer.dato();
        System.out.print("\nNombre:               " );
        nombre=Leer.dato();
        System.out.print("\nDireccion:            " );
        direccion=Leer.dato();
        System.out.print("\nTelefono:             " );
        telefono=Leer.dato();
        System.out.print("\nFecha de nacimiento:  " );
        fecha_de_nacimiento=Leer.dato();
        System.out.print("\nEmail:                " );
        email=Leer.dato();
        System.out.print("\nDireccion de trabajo: " );
        direccion_Trabajo=Leer.dato();
        System.out.print("\nTelefono de trabajo:  " );
        telefono_trabajo=Leer.dato();
    }

    public static int Menu(){
        int op = 0;
        while(!(op>=1 && op<=3)){
            System.out.println("       Agenda telefonica");
            System.out.println("Opciones");
            System.out.println("1.-Agregar contacto");
            System.out.println("2.-Consultar contacto");
            System.out.println("3.-Salir");
            System.out.print("Elige una opcion del 1-3:");
            op=Leer.datoInt();
            if(!(op>=1 && op<=3)){
                System.out.println("Opcion no valida...pulse <enter> para continuar");
            }
        }
        return op;
    }

}
