/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colaestatica;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Cola {
    
    //Atributos de la clase
    int frente, fin, max;
    private String elem[];
    
    /*
     * Constructor de la clase
    */
    public Cola(int n){
        max = n;
        elem = new String[max];
        frente = -1;
        fin = -1;
    }
    
    //Comportamientos de la clase
    
    /*
     * Este metodo realiza la accion de analizar si existen
     * elementos en la cola, retorna un true en caso de que 
     * esto se cumpla y un false en caso contrario
     */
    public boolean esVacia(){
        if(frente==-1)
            return true;
        else
            return false;
    }
    
    /*
     * Este metodo realiza la accion de analizar si la cola 
     * se encuentra lena, retorna un true en caso de que 
     * esto se cumpla y un false en caso contrario
     */
    public boolean esLlena(){
        if(fin==max-1)
            return true;
        else
            return false;
    }
    
    /*
     * Este metodo realiza la insercion de un elemento con informacion 
     * dato en la cola, retorna un true si se realizo correctamente la 
     * insercion y un false en caso contrario
     */
    public boolean Inserta(String dato){
        if(!esLlena()){//Verifica si hay espacio en la cola
            fin += 1;
            elem[fin] = dato;
            if(fin==0)//Verifica si se inserto el 1° elemento
                frente = 0;
            return true;//Indica que se inserto el elemento
        }
        else
            return false;//Indica que puede suceder desbordamiento
    }
    
    /*
     * Este metodo realiza la eliminacion del 1° elemento 
     * en la cola,retorna un true si se realizo correctamente 
     * la insercion y un false en caso contrario
     */
    public boolean Elimina(){
        if(!esVacia()){//Verifica si existen elementos 
            if(fin==frente)//Verifica si solo hay un elemento
                frente = -1;
            else
                frente += 1;
            return true;//Indica que se elimino el elemento
        }
        else
            return false;//Indica que puede suceder subdesbordamiento
    }
    
    /*
     * Este metodo realiza la accion de imprimir en la terminal 
     * los elementos de una cola, indica que se realizo esta 
     * accion retornando un true y retornando un false en caso 
     * de que la cola este vacia
     */
    public boolean Imprime(){
        if(!esVacia()){
            for(int aux=frente;aux<=fin;aux++){//Realiza un recorrido de impresion
                System.out.println("\t" + elem[aux]);
            }
            return true;//Indica que se realizo la impresion
        }
        else 
            return false;//Indica que la cola esta vacia
    }
    
    /*
     * Este metodo realiza la accion de retornar el primer 
     * elemento sin eliminarlo o el retorna un valor null 
     * si no hay elementos
     */
    public String Info(){
        String dato = null;
        if(!esVacia())
            dato = elem[frente];
        return dato;
    }
    
    /*
     * Este metodo realiza la accion de limpiar la cola
     */
    public void Vaciar(){
        if(!esVacia()){
            frente = -1;
            fin = -1;
        }
    }
    
    /*
     * Este metodo realiza la accion de retornar la cantidad 
     * total de elementos existentes en la cola
     */
    public int Total(){
        return (fin+1);
    }
    
    /*
     * Este metodo realiza la accion de busqueda de un elemento 
     * en la cola, si lo encontro lo indica rtornando un true
     */
    public boolean Busca(String dato){
        boolean res = false;
        if(!esVacia()){
          for(int i=frente;i<=fin;i++){
              if(dato.equals(elem[i]))
                  res = true;
          }
        }
        return res;
    }
}
