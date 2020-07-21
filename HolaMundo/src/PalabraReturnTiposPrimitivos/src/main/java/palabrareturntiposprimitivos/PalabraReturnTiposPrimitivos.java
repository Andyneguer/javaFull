/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrareturntiposprimitivos;
/**
 *
 * @author jaime.arboleda
 */
public class PalabraReturnTiposPrimitivos 
{
    public static void main(String[] args) 
    {
        sumarSinRetornarValor(3,6);
        
        int resultado = sumarRetornandoValor(4, 3);
        System.out.println("El resultado retomando el valor es: " + resultado);
    }

    private static void sumarSinRetornarValor(int a, int b) 
    {
        System.out.println("El resultar sumar sin retornar valor: " + (a + b));
    }
    
    private static int sumarRetornandoValor(int a, int b)
    {
        if (a == 0 && b == 0) {
            System.out.println("Debes proporcionar valores distintos a cero");
            return 0;
        }
        System.out.println("Los valores proporcionados son distintos a cero");
        return a + b;
    }
}
