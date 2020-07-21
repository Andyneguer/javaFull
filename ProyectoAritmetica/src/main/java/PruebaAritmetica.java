/**
 *
 * @author andres.arboleda
 */
public class PruebaAritmetica 
{
    public static void main(String[] args)
    {
        /*
         *Variables locales son locales 
         *debido a que estamos dentro de un metodo
         *Si estamos dentro de un metodo cualquier 
         *variable que definamos es una variable local
        */
        int operandoA = 6;
        int operandoB = 2;
        
        //Creamos un objeto de la clase Aritmetica Enviando los argumentos respectivos 
        Aritmetica objeto1 = new Aritmetica (operandoA,operandoB);
        
        //Inprimimos los valores de los  operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        //Imprimimos el resultado de la suma
        System.out.println("\nResultado de la suma:" + objeto1.sumar());
        
        //Imprimimos el resultado de la resta
        System.out.println("\nResultado de la resta:" + objeto1.restar());
        
        //Imprimimos el resultado de la multiplicacion
        System.out.println("\nResultado de la multiplicar:" + objeto1.multiplicar());
        
        //Imprimimos el resultado de la divicion
        System.out.println("\nResultado de la dividir:" + objeto1.dividir());
        
        //Imprimimos el resultado de la divicion modulo
        System.out.println("\nResultado de la modulo:" + objeto1.modulo());
    }
}
