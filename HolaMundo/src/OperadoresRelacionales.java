import java.util.Scanner;

public class OperadoresRelacionales {
    // Exercise # 17 ----
    public static void main(String[] args) {
        // operadores relacionales y de igualdad

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        int a =Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de b: ");
        int b =Integer.parseInt(sc.nextLine());
        boolean c = (a == b);
        System.out.println("c = " + c);

        String d = "Hola", e = "Hola";
        boolean f= d.equals(e);
        System.out.println("f = " + f);

        boolean g = (a > b);
        System.out.println("g = " + g);

        if(a % 2 != 0)
            System.out.println("Numero par");
        else
            System.out.println("Numero impar");

        int edad = Integer.parseInt(sc.nextLine());


        if(edad >= 18)
            System.out.println("Eres adulto");
        else
            System.out.println("Eres menor de edad");
    }
}
/*
*
* */
