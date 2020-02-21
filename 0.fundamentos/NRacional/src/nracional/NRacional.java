/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nracional;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class NRacional {
    private int Numerador;
    private int Denominador;

    public void setNumerador(int Num)
    {
        this.Numerador = Num;
    }

    public void setDenominador(int Den)
    {
        this.Denominador = Den;
    }

    public NRacional Suma (NRacional B)
    {
        NRacional Resultado = new NRacional();
        int N=0, D=0;
        D = this.Denominador * B.Denominador;
        N = this.Numerador * B.Denominador + this.Denominador * B.Numerador;
        Resultado.setNumerador(N);
        Resultado.setDenominador(D);
        Resultado.Reducir();
        return Resultado;
    }

    public NRacional Resta (NRacional B)
    {
        NRacional Resultado = new NRacional();
        int N=0, D=0;
        D = this.Denominador * B.Denominador;
        N = this.Numerador * B.Denominador - this.Denominador * B.Numerador;
        Resultado.setNumerador(N);
        Resultado.setDenominador(D);
        Resultado.Reducir();
        return Resultado;
    }

    public NRacional Multiplicacion (NRacional B)
    {
        NRacional Resultado = new NRacional();
        int N=0, D=0;
        D = this.Denominador * B.Denominador;
        N = this.Numerador * B.Numerador;
        Resultado.setNumerador(N);
        Resultado.setDenominador(D);
        Resultado.Reducir();
        return Resultado;
    }

    public NRacional Division (NRacional B)
    {
        NRacional Resultado = new NRacional();
        int N=0, D=0;
        D = this.Denominador * B.Numerador;
        N = this.Numerador * B.Denominador;
        Resultado.setNumerador(N);
        Resultado.setDenominador(D);
        Resultado.Reducir();
        return Resultado;
    }

    public void Reducir()
    {
        int m=0, n=0, aux=0;
        m = this.Numerador;
        n = this.Denominador;
        if(m>n)
        {
            aux = n;
            n = m;
            m = aux;
        }
        while(m%n!=0)
        {
            aux = m%n;
            m = n;
            n = aux;
        }
       
        this.Numerador /= n;
        this.Denominador/= n;
    }

    public String ToString()
    {
        return this.Numerador+"/"+this.Denominador;
    }
}
