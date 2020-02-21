/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colacircular;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class ColaCir {
    
    //Atributos de la clase
    int frente, fin, max;
    private String elem[];
    
    //Constructor de la clase
    public ColaCir(int n){
        max = n;
        frente = -1;
        fin = -1;
        elem = new String [max];
    }
    
    //Comportamientos de la clase
    
    /*
     * Este metodo realiza la insercion de un elemento con informacion 
     * dato en la cola, retorna un true si se realizo correctamente la 
     * insercion y un false en caso contrario
     */
    public boolean Inserta(String dato){
        if(!(fin==max-1 && frente==0 || fin+1==frente)){
            if(fin==max-1)
                fin = 0;
            else
                fin = fin+1;
            elem[fin] = dato;
            if(frente==-1)
                frente = 0;
            return true;
        }
        return false;
    }
    
    /*
     * Este metodo realiza la eliminacion del 1° elemento 
     * en la cola,retorna un true si se realizo correctamente 
     * la insercion y un false en caso contrario
     */
    public boolean Eliminar(){
        if(!(frente==-1)){
            if(frente==fin){
                frente = -1;
                fin = -1;
            }
            else{
                if(frente==max-1)
                    frente = 0;
                else
                    frente = frente+1;
            }
            return true;
        }
        return false;
    }
    
    /*
     * Este metodo realiza la accion de imprimir en la terminal 
     * los elementos de una cola, indica que se realizo esta 
     * accion retornando un true y retornando un false en caso 
     * de que la cola este vacia
     */
    public void Imprime(){
        if(frente!=-1){
            int aux = frente;
            while(aux<=fin){
                if(aux==max-1)
                    aux = 0;
                System.out.println("\t" + elem[aux]);
                aux++;
            }
        }
    }
    
    /*
     * Este metodo realiza la busqueda de un elemento con informacion
     * dato en la cola, regresando un true si lo encontro y un false 
     * sino existe en la cola
     */
    public boolean Busca(String dato){
        boolean R = false;
        if(frente!=-1){
            int aux = frente;
            while(aux<=fin && R!=true){
                if(aux==max-1)
                    aux = 0;
                if(dato.equals(elem[aux]))
                    R = true;
                else
                    aux++;
            }
        }
        return R;
    }
    
}
