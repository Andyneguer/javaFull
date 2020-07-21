import java.util.Scanner;

public class OperadorAsignacion {
    public static void main(String[] args) {
        //operadores de asignacion
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        int a= Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor de b");
        int b= Integer.parseInt(sc.nextLine());

        a+=1;// a es = a + 1
        System.out.println("a = " + a);

        a+=3;// a es = a + 3
        System.out.println("a = " + a);

        b-=1;// b es = b - 1
        System.out.println("b = " + b);

        b-=3;// b es = b - 3
        System.out.println("b = " + b);

        a*=1;// a es = a * 1
        System.out.println("a = " + a);

        a*=3;// a es = a * 3
        System.out.println("a = " + a);

        b/=1;// b es = b / 1
        System.out.println("b = " + b);

        b/=3;// b es = b / 3
        System.out.println("b = " + b);

        a%=1;// a es = a % 1
        System.out.println("a = " + a);

        b%=3;// b es = b %3
        System.out.println("b = " + b);
    }
}
