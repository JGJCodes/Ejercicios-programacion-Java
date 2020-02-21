package cola;

public class Metodos_Cola {

    int max, frente = -1, Final = -1, cola[];

    public Metodos_Cola(int tamañocola) {
        max = tamañocola -1;
        cola = new int [tamañocola];
    }

    public boolean ColaVacia() {
        if (frente == -1 && Final == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ColaLlena (){
        if (Final == max) {
            return true;
        }else{
            return false;
        }
    }
    
    public void Insertar(int dato){
        if (ColaLlena() == false) {
            Final +=1;
            cola[Final]= dato;
            if (Final == 0) {
                frente = 0;
            }
        }else{
            System.out.println("\nDesbordamiento");
        }
    }
    
    public void Eliminar (){
        if (ColaVacia() == false) {
            if (frente == Final) {
                Final = frente = -1;
            }else{
                frente +=1;
            }
        }else{
            System.out.println("\nSubdesbordamiento");
        }
    }
    
    public void Info(){
        if (ColaVacia() == false) {
            System.out.println("\n"+ cola[frente]);
        }else{
            System.out.println("\nNo hay informacion que mostar");
        }
    }
    
    public void Vaciar(){
        if (ColaVacia() == false) {
            frente = Final = -1;
        }else{
            System.out.println("\nCola Vacia");
        }
    }
    
    public boolean Buscar (int dato){
        if (ColaVacia() == false) {
            for (int i = frente; i <= Final; i++) {
                if (cola[i]==dato) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void Imprime(){
        if (ColaVacia() == false) {
            for (int i = frente; i <= Final; i++) {
                System.out.print(cola[i]);
                if (i < Final) {
                    System.out.print(" , ");
                }
            }
        }else{
            System.out.println("Cola Vacia");
        }
    }
    
    public void Total (){
        if (ColaVacia() == false) {
            System.out.println("\n"+((Final - frente)+1));
        }else{
            System.out.println("\nCola Vacia");
        }
    }
    
}