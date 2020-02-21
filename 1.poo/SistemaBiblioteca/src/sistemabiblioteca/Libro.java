/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemabiblioteca;

import java.io.Serializable;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Libro implements Serializable{

    private String Titulo =null;
    private String Subtitulo =null;
    private String Autor =null;
    private String NumEdicion =null;
    private short AñoEdicion =0;
    private String Editorial =null;
    private String NumClasificacion =null;
    private int NumInventario =0;
    private String Estado=null;

    public Libro(){
    }
    
    void setTitulo(String titulo){
        Titulo =titulo;
    }
    
    void setSubtitulo(String subtitulo){
        Subtitulo =subtitulo;
    }

    void setAutor(String autor){
        Autor =autor;
    }

    void setNumEdicion(String numEdicion){
        NumEdicion =numEdicion;
    }

    void setAñoEdicion(short añoEdicion){
        AñoEdicion =añoEdicion;
    }

    void setEditorial(String editorial){
        Editorial =editorial;
    }

    void setNumClasificacion(String numClasificacion){
        NumClasificacion =numClasificacion;
    }

    void setNumInventario(int numInventario){
        NumInventario =numInventario;
    }

    void setEstado(String estado){
        Estado=estado;
    }

    String getTitulo(){
        return Titulo;
    }

    String getSubtitulo(){
        return Subtitulo;
    }

    String getAutor(){
        return Autor;
    }

    String getNumEdicion(){
        return NumEdicion;
    }

    Short getAñoEdicion(){
        return AñoEdicion;
    }

    String getEditorial(){
        return Editorial;
    }

    String getNumClasificacion(){
        return NumClasificacion;
    }

    int getNumInventario(){
        return NumInventario;
    }

    String getEstado(){
        return Estado;
    }

}
