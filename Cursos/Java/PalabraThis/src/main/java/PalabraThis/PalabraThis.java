/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalabraThis;
/**
 *
 * @author AndresArboleda
 */
public class PalabraThis 
{
    public static void main(String[] args)
    {
        Persona p = new Persona("Andres");
        
        // la palabra this se a asocia a objetos mas no a clases
    }
}

class Persona
{
    String nombre;
    
    Persona(String nombre)// Constructor de tipo String
    {
        this.nombre = nombre;//This apunta a un objeto de tipo persona
        System.out.println("Impresion del operarador this dentro de la clase Persona: " + this);//this apunta a un objeto de tipo persona en este momento
        Imprimir imprimir = new Imprimir ();
        imprimir.imprimir(this);// this contiene una referencia al objeto Persona
    }
}

class Imprimir 
{
    public void imprimir(Persona p)
    {
        System.out.println("Impresion argumento persona " + p);// Valor del objeto persona
        System.out.println("Impresion objeto actual (this)" + this);// this apunta a un objeto de tipo imprimir en este momento
    } 
}