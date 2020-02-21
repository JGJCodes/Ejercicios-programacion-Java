/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda;

import java.util.Date;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Contacto {

    private int ID;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private String Email;
    private Date Fecha_de_nacimiento;
    private String Direccion_Trabajo;
    private String Telefono_trabajo;

    public void SetID(int id){
        ID=id;
    }
    
    public void SetNombre(String nombre){
        Nombre=nombre;
    }
    
    public void SetTelefono(String telefono){
        Telefono=telefono;
    }
    
    public void SetDireccion(String direccion){
        Direccion=direccion;
    }
    
    public void SetEmail(String email){
        Email=email;
    }
    
    public void SetFecha_de_nacimiento(Date fecha_de_nacimiento){
        Fecha_de_nacimiento=fecha_de_nacimiento;
    }
    
    public void SetDireccion_Trabajo(String direccion_Trabajo){
        Direccion_Trabajo=direccion_Trabajo;
    }
    
    public void SetTelefono_trabajo(String telefono_trabajo){
        Telefono_trabajo=telefono_trabajo;
    }

    public int GetID(){
        return ID;
    }

    public String GetNombre(){
        return Nombre;
    }

    public String GetTelefono(){
        return Telefono;
    }

    public String GetDireccion(){
        return Direccion;
    }

    public String GetEmail(){
        return Email;
    }

    public Date GetFecha_de_nacimiento(){
        return Fecha_de_nacimiento;
    }

    public String GetDireccion_Trabajo(){
        return Direccion_Trabajo;
    }

    public String GetTelefono_trabajo(){
        return Telefono_trabajo;
    }

    Contacto(String nombre,String telefono,String direccion,String email,Date fecha_de_nacimiento,String direccion_Trabajo,String telefono_trabajo){
        SetNombre(nombre);
        SetTelefono(telefono);
        SetDireccion(direccion);
        SetEmail(email);
        SetFecha_de_nacimiento(fecha_de_nacimiento);
        SetDireccion_Trabajo(direccion_Trabajo);
        SetTelefono_trabajo(telefono_trabajo);
    }

    public void DesplegarContacto(){
        System.out.println("ID:                   " + ID);
        System.out.println("Nombre:               " + Nombre);
        System.out.println("Direccion:            " + Direccion);
        System.out.println("Telefono:             " + Telefono);
        System.out.println("Fecha de nacimiento:  " + Fecha_de_nacimiento);
        System.out.println("Email:                " + Email);
        System.out.println("Direccion de trabajo: " + Direccion_Trabajo);
        System.out.println("Telefono de trabajo:  " + Telefono_trabajo);
    }

}
