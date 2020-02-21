/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package formulageneral;

/**
 *
 * @author Jorge Guzmán Juárez
 */
class FormulaGral {
    private float A;
    private float B;
    private float C;
    public void setA(float a)
    {
        this.A = a;
    }
    public void setB(float b)
    {
        this.B = b;
    }
    public void setC(float c)
    {
        this.C = c;
    }
    public float getA()
    {
        return A;
    }
    public float getB()
    {
        return B;
    }
    public float getC()
    {
        return C;
    }
    public float x1()
    {
        if(A==0)
        {
            System.out.println("Error de division por 0");
        }
        else
        {
            if(Math.pow(B, 2)-4*A*C<0)
            {
                System.out.println("Las raices son imaginarias");
            }
            else
            {
                return (float) (-B + Math.sqrt(Math.pow(B, 2)- 4*A*C)/(2*A));
            }
        }
        return 0;
    }
    public float x2()
    {
        if(A==0)
        {
            System.out.println("Error de division por 0");
        }
        else
        {
            if(Math.pow(B, 2)<4*A*C)
            {
                System.out.println("Las raices son imaginarias");
            }
            else
            {
                return (float) (-B - Math.sqrt(Math.pow(B, 2)- 4*A*C)/(2*A));
            }
        }
        return 0;
    }

}
