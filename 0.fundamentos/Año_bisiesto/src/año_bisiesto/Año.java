/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package año_bisiesto;

/**
 *
 * @author jorge
 */
public class Año {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion de variabeles
        boolean Bisiesto = false;
        int Dia, Mes, Año, Dm=0;
        
        //Lectura de datos
        System.out.print("Dia");
        Dia = Leer.datoInt();
        System.out.print("Mes");
        Mes = Leer.datoInt();
        System.out.print("Año");
        Año = Leer.datoInt();
        
        //Procesos
        switch(Mes)
        {
            case 2:
                if(Año%4==0){
                    if(Año%100==0){
                        if(Año%400==0){
                            if(Año%4000==0){
                                Bisiesto = false;
                            }
                            else{
                                Bisiesto = true;
                            }
                        }
                        else{
                            Bisiesto = false;
                        }
                    }
                    else{
                        Bisiesto = true;
                    }
                }
                else{
                    Bisiesto = false;
                }
                if(Bisiesto==true){
                    Dm = 29;
                }
                else{
                    Dm = 28;
                }
                break; 
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Dm = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Dm = 30;
                break;
        }
        
        //Impresion de resultados
        if(Dia>=1 && Dia<=Dm && Mes>=1 && Mes<=12){
            System.out.println("La fecha " + Dia + "/" + Mes + "/" + Año + " es correcta");
            if(Bisiesto==true){
                System.out.println("Es año bisiesto");
            }   
        }
        else{
            System.out.println("La fecha no es correcta");
        }
    }
}
