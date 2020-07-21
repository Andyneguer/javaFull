import java.util.Scanner;
public class Operadores {
    public static void main(String[] args) {
        // operadores aritmeticos
        Scanner sc= new Scanner(System.in);
        int a, b, c ;
        float d,e,f;
        System.out.println("suma");
        System.out.println("Ingrese el valor de A para la suma: ");
        a=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de B para la suma: ");
        b=Integer.parseInt(sc.nextLine());
        c=a+b;
        System.out.println("El Resultado de la Suma es de: ");
        System.out.println("c = " + c);
        System.out.println("************************************");
        System.out.println("Resta");
        System.out.println("Ingrese el valor de A para la resta: ");
        a=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de B para la resta: ");
        b=Integer.parseInt(sc.nextLine());
        c=a-b;
        System.out.println("El Resultado de la Resta es de: ");
        System.out.println("c = " + c);
        System.out.println("*************************************");
        System.out.println("Multiplicacion");
        System.out.println("Ingrese el valor de A para la multiplicacion: ");
        a=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de B para la multiplicacion: ");
        b=Integer.parseInt(sc.nextLine());
        c=a*b;
        System.out.println("El Resultado de la Multiplicacion es de: ");
        System.out.println("c = " + c);
        System.out.println("***********************************************");
        System.out.println("Division");
        System.out.println("Ingrese el valor de D para la Division: ");
        d=Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese el valor de E para la division: ");
        e=Float.parseFloat(sc.nextLine());
        f=d/e;
        System.out.println("El Resultado de la Division es de: ");
        System.out.println("f = " + f);
        if(f == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
        System.out.println("**********************************************");
        System.out.println("Division Modulo");
        System.out.println("Ingrese el valor de D para el modulo : ");
        d=Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese el valor de E para el modulo: ");
        e=Float.parseFloat(sc.nextLine());
        f=d%e;
        System.out.println("El Resultado de la Division es de: ");
        System.out.println("f = " + f);
        if(f == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }

        /*
        int alto, ancho, area, perimetro;
        System.out.println("Area y Perimetro del rectangulo \n");
        System.out.println("Ingrese la altura del rectangulo");
        alto=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el ancho del rectangulo");
        ancho=Integer.parseInt(sc.nextLine());
        System.out.println("El area del rectangulo es: ");
        area= alto*ancho;
        System.out.println("area = " + area);
        System.out.println("El perimetro del rectangulo es:");
        perimetro=(alto + ancho)*2;
        System.out.println("perimetro = " + perimetro);
        System.out.println();
        //

        // Escribe tu solucion aqui
        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(sc.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(sc.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        */
    }
}
