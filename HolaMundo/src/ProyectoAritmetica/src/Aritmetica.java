public class Aritmetica 
{
    //Atributos de la clase
    byte a;
    byte b;

    //Constructor vacio
    public Aritmetica()
    {
    }

    //Constructor con 2 argumentos
    public Aritmetica(byte a, byte b)
    {
        this.a=a;
        this.b=b;
    }

    //Este metodo sumar toma los atributos de nuestra clase
    int sumar()
    {
        return a + b;
    }

    //Metodo restar
    int restar()
    {
        return a - b;
    }

    //Metodo Multiplicar
    int multiplicar()
    {
        return a * b;
    }

    //Metodo Dividir
    int dividir()
    {
        return a / b;
    }
}
