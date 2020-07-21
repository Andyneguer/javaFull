import java.util.Scanner;

public class OperadorTernario {
    // Exercise # 19 ----
    public static void main(String[] args) {
        // Operador ternario
        Scanner sc=new Scanner(System.in);
        /*int numero = 10;
        var resultado = (numero % 2 == 0)  ? "Es Numero par": "Es numero Impar";
        System.out.println("resultado = " + resultado);

        boolean par=(numero % 2 == 0) ? true : false;
        if(par) {
            System.out.println("Numero par");
        }else {
            System.out.println("numero impar");
        }*/
        System.out.println("Ingrese el numero 1:");
        int num1=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el numero 2");
        int num2=Integer.parseInt(sc.nextLine());

        var resultado=(num1>num2) ? num1 :num2;
        System.out.println("El numero mayor es: "+resultado);

        /*
         int numero1= Integer.parseInt(scanner.nextLine());
        int numero2= Integer.parseInt(scanner.nextLine());

        System.out.println(numero1 > numero2 ? numero1 : numero2);
        // este ? operador ternario ? lo que esta entre el signo de interrogacion
        // y los dos puntos : se conoce como la parte verdadera
        // lo que esta despues de los dos puntos seria la parte del valor falso

        */

    }
}
