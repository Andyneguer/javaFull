/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalabraReturnObject;

/**
 *
 * @author jaime.arboleda
 */
public class palabraReturnClases 
{
    public static void main(String[] args)
    {
        Suma s = creaObjetoSuma();
        System.out.println("Resultado de llamar el metodo sumar: " + s.sumar());
    }
    
    private static Suma creaObjetoSuma()
    {
        Suma suma = new Suma(4,6);//Se crea un nuevo objeto 
        return suma;//Referencia de un objeto 
    }
}

class Suma
{
    int a;
    int b;
    
    public Suma(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    public int sumar()
    {
        return this.a + this.b;
    }
}