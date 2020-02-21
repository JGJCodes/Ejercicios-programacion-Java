/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jorge
 */
public class Leer {
    /**
     *
     * @return
     */
    public static String dato()
    {
        String sdato;
        sdato = "";
        InputStreamReader isr;
        isr = new InputStreamReader(System.in);
        BufferedReader flujoE;
        flujoE = new BufferedReader(isr);
        try
        {
            sdato = flujoE.readLine();
        }
        catch(IOException e)
        {
            System.err.println("Error de lectura " + e.getMessage());
        }
        return sdato; 
    }
    
    /**
     *
     * @return
     */
    public static int datoInt()
    {
        try 
        {
            return Integer.parseInt(dato());   
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error de lectura " + e.getMessage());
            return Integer.MIN_VALUE;
        }    
    }
    
    /**
     *
     * @return
     */
    public static short datoShort()
    {
        try
        {
            return Short.parseShort(dato());
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error de lectura " + e.getMessage());
            return Short.MIN_VALUE;
        }
    }
       
    /**
     *
     * @return
     */
    public static long datoLong()
    {
        try
        {
            return Long.parseLong(dato());
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error de lectura " + e.getMessage());
            return Long.MIN_VALUE;
        }
    }
    
    /**
     *
     * @return
     */
    public static float datoFloat()
    {
        try
        {
            return Float.parseFloat(dato());
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error de lectura " + e.getMessage());
            return Float.MIN_VALUE;
        }
    }
    
    /**
     *
     * @return
     */
    public static double datoDouble()
    {
        try
        {
            return Double.parseDouble(dato());
        }
        catch(NumberFormatException e)
        {
            System.err.println("Error de lectura " + e.getMessage());
            return Double.MIN_VALUE;
        }
    }        
}
