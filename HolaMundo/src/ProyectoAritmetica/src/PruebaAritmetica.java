import java.util.Scanner;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        //Variables locales
        byte operandoA=an.nextByte();
        byte operandoB=an.nextByte();

        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1= new Aritmetica(operandoA,operandoB);

        //Imprimimos los valores de los operadores
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos el resultado de la suma
        System.out.println("\nResultado suma: "+ objeto1.sumar());

        //Imprimimos el resultado de la resta
        System.out.println("\nResultado resta: "+ objeto1.restar());

        //Imprimimos el resultado de la multiplicacion
        System.out.println("\nResultado multiplicacion: "+ objeto1.multiplicar());

        //Imprimimos el resultado de la divicion
        System.out.println("\nResultado divicion: "+ objeto1.dividir());
    }
}
