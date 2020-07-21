/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturntiposprimitivos;
/**
 *
 * @author AndresArboleda
 */
public class PalabraReturnTiposPrimitivos 
{
    public static void main(String[] args) 
    {
        //Metodo
        sumarSinRetornarValor(3,6);
        
        int resultado = sumarRetornandoValor(4, 3);
        System.out.println("El resultado retomando el valor es: " + resultado);
    }
    //Este metodo no regresa ningun valor
    //este metodo lo unico que va a hacer es enviar a consola el resultado de realizar la suma de a + b
    private static void sumarSinRetornarValor(int a, int b) 
    {
        System.out.println("El resultar sumar sin retornar valor: " + (a + b));
    }
    //Este metodo va a regresar un valor de tipo entero por eso no se usa la palabra void
    private static int sumarRetornandoValor(int a, int b)
    {
        if (a == 0 && b == 0) 
        {
            System.out.println("Debes proporcionar valores distintos a cero");
            return 0;
        }
        System.out.println("Los valores proporcionados son distintos a cero");
        return a + b;
    }
}
