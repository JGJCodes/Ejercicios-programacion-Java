/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package numero_texto;

/**
 *
 * @author Usuario
 */
public class Numero_Letra {

    private static int ntercia = 0;

    public static String SUnidad(int u, int d)
    {
        String Texto="";
        switch(u){
            case 1:
                if(d!=1){
                    if(ntercia==0){
                        Texto = "uno";
                    }
                    else{
                        if(ntercia%2==1){
                            Texto = "un";
                        }
                    }
                }
                break;
            case 2:
                if(d!=1){
                    Texto = "dos";
                }
                break;
            case 3:
                if(d!=1){
                    Texto = "tres";
                }
                break;
            case 4:
                if(d!=1){
                    Texto = "cuatro";
                }
                break;
            case 5:
                if(d!=1){
                    Texto = "cinco";
                }
                break;
            case 6:
                Texto = "seis";
                break;
            case 7:
                Texto = "siete";
                break;
            case 8:
                Texto = "ocho";
                break;
            case 9:
                Texto = "nueve";
                break;
        }
        return Texto;
    }

    public static String SDecena(int u, int d)
    {
        String Texto = "";
        switch(d){
            case 1:
                switch(u){
                    case 0:
                        Texto = "diez";
                        break;
                    case 1:
                        Texto = "once";
                        break;
                    case 2:
                        Texto = "doce";
                        break;
                    case 3:
                        Texto = "trece";
                        break;
                    case 4:
                        Texto = "catorce";
                        break;
                    case 5:
                        Texto = "quince";
                        break;
                    default:
                        Texto = "dieci";
                        break;
                }
                break;
            case 2:
                if(u==0){
                    Texto = "veinte";
                }
                else{
                    Texto = "veinti";
                }
                break;
            case 3:
                if(u==0){
                    Texto = "treinta";
                }
                else{
                    Texto = "treinta y";
                }
                break;
            case 4:
                if(u==0){
                    Texto = "cuarenta";
                }
                else{
                    Texto = "cuarenta y";
                }
                break;
            case 5:
                if(u==0){
                    Texto = "cincuenta";
                }
                else{
                    Texto = "cincuenta y";
                }
                break;
            case 6:
                if(u==0){
                    Texto = "sesenta";
                }
                else{
                    Texto = "sesenta y";
                }
                break;
            case 7:
                if(u==0){
                    Texto = "setenta";
                }
                else{
                    Texto = "setenta y";
                }
                break;
             case 8:
                if(u==0){
                    Texto = "ochenta";
                }
                else{
                    Texto = "ochenta y";
                }
                break;
             case 9:
                if(u==0){
                    Texto = "noventa";
                }
                else{
                    Texto = "noventa y";
                }
                break;
        }
        return Texto;
    }

    public static String SCentena(int u, int d, int c)
    {
       String Texto="";
       switch(c)
       {
           case 1:
               if(u==0 && d==0)
               {
                   Texto = "cien";
               }
               else
               {
                   Texto = "ciento";
               }
               break;
           case 2:
               Texto = "doscientos";
               break;
           case 3:
               Texto = "trescientos";
               break;
           case 4:
               Texto = "cuatrocientos";
               break;
           case 5:
               Texto = "quimientos";
               break;
           case 6:
               Texto = "seiscientos";
               break;
           case 7:
               Texto = "setecientos";
               break;
           case 8:
               Texto = "ochocientos";
               break;
           case 9:
               Texto = "novecientos";
               break;
       }
       return Texto;

    }

    public static String Transformar(int num)
    {
        int aux = num;
        int unidades,decenas,centenas;
        String Texto="";
        ntercia = 0;
        while(aux!=0){
            unidades=aux%10;
            decenas=aux/10%10;
            centenas=aux/100%10;
            Texto = SCentena(unidades,decenas,centenas) + " " + SDecena(unidades,decenas) + " " + SUnidad(unidades,decenas) + " " + Complemento(unidades,decenas,centenas) + " " + Texto;
            ntercia++;
            aux/=1000;
        }
        return Texto;
    }

    public static String Complemento(int u, int d, int c)
    {
        String Texto="";
        if (ntercia%2==1){
            Texto = "mil ";
        }
        switch(ntercia){
            case 2:
            case 3:
                if(d==0 && c==0 && u==1){
                    Texto = Texto + "millon";
                }
                else{
                    Texto = Texto + "millones";
                }
                break;
            case 4:
            case 5:
                if(d==0 && c==0 && u==1){
                    Texto = Texto + "billon";
                }
                else{
                    Texto = Texto + "billones";
                }
                break;
            case 6:
            case 7:
                if(d==0 && c==0 && u==1){
                    Texto = Texto + "trillon";
                }
                else{
                    Texto = Texto + "trillones";
                }
                break;
        }
        return Texto;
    }

}
