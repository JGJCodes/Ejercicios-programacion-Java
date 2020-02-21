/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilerias;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Profesor extends Persona {

    private String IdProfesor;

    //Constructor
    public Profesor (String nombre, String apellidos, int edad){
        super(nombre, apellidos, edad);
        IdProfesor = "unknown";
    }

    //Metodos especificos
    public void setIdProfesor (String IdProfesor){
        this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor (){
        return IdProfesor;
    }

    public void mostrarNombreApellidosYCarnet(){
        System.out.println("Profesor de nombre: " + getNombre() + " " + getApellidos() + " con Id de profesor: "  + getIdProfesor());
    }

}
