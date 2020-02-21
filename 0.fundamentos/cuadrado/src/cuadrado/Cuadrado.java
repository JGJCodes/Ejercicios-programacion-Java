/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuadrado;

/**
 *
 * @author jorge
 */
public class Cuadrado {
    private float altura;
    private float base;
    public float perimetro()
    {
        return 2*(altura+base);
    }
    public float area()
    {
        return altura*base;
    }
}
