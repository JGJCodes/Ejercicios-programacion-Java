/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilerias;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor
    public Persona (String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Metodos
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

}
