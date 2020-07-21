/**
 *
 * @author andres.arboleda
 */
public class Aritmetica {
    
    int a;
    int b;

    public Aritmetica() 
    {
        System.out.println("Ejecutando constructor vacio");
    }
          
    public Aritmetica(int a, int b) 
    {
        this.a=a;
        this.b=b;
        System.out.println("Ejecutando constructor con dos argumentos");
    }
        
    //METODO SUMAR
    public int sumar ()//FIRMA DEL METODO 
    {
        return this.a + this.b;
    }
    
    public int restar ()
    {
        return this.a - this.b;
    }
    
    public int multiplicar ()
    {
        return this.a * this.b;
    }
    
    public int dividir () 
    {
        return this.a / this.b;
    }
    
    public int modulo ()
    {
        return this.a % this.b;
    }
}
