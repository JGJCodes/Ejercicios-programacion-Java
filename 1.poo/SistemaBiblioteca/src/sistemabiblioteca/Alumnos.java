/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemabiblioteca;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Alumnos {

    private String Nombre=null;
    private String Carrera=null;
    private short Semestre=0;
    private String NumControl=null;
    private short NumFolio=0;
    private String Vigencia=null;
    private String Estado=null;

    public Alumnos(){
    }

    void setNombre(String nombre){
        Nombre=nombre;
    }

    void setCarrera(String carrera){
        Carrera=carrera;
    }

    void setSemestre(short semestre){
        Semestre=semestre;
    }

    void setNumControl(String numControl){
        NumControl=numControl;
    }

    void setNumFolio(short numFolio){
        NumFolio=numFolio;
    }

    void setVigencia(String vigencia){
        Vigencia=vigencia;
    }

    void setEstado(String estado){
        Estado=estado;
    }

    String getNombre(){
        return Nombre;
    }

    String getCarrera(){
        return Carrera;
    }

    short getSemestre(){
        return Semestre;
    }

    String getNumControl(){
        return NumControl;
    }

    short getNumFolio(){
        return NumFolio;
    }

    String getVigencia(){
        return Vigencia;
    }

    String getEstado(){
        return Estado;
    }

}
