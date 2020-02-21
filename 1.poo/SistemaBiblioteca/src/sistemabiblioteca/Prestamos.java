/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemabiblioteca;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Prestamos {

    private String Fecha=null;
    private String FechaEntrega=null;
    private String NumControl=null;
    private String Titulo=null;
    private String NumClasificacion=null;
    private int NumInventario=0;

    public Prestamos(){
    }

    void setFecha(String fecha){
        Fecha=fecha;
    }

    void setFechaEntrega(String fechaEntrega){
        FechaEntrega=fechaEntrega;
    }

    void setNumControl(String numControl){
        NumControl=numControl;
    }

    void setTitulo(String titulo){
        Titulo =titulo;
    }

    void setNumClasificacion(String numClasificacion){
        NumClasificacion=numClasificacion;
    }

    void setNumInventario(int numInventario){
        NumInventario=numInventario;
    }

    String getFecha(){
        return Fecha;
    }

    String getFechaEntrega(){
        return FechaEntrega;
    }

    String getNumControl(){
        return NumControl;
    }

    String getTitulo(){
        return Titulo;
    }

    String getNumClasificacion(){
        return NumClasificacion;
    }

    int getNumInventario(){
        return NumInventario;
    }

}
