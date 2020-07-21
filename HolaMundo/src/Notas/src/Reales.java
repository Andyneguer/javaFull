import java.util.Scanner;
public class Reales {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int num1,num2;

        System.out.println("Ingrese los numeros");
        num1=an.nextInt();
        num2=an.nextInt();

        if (num1>num2){
            System.out.println("num1 = " + num1);
            System.out.println("num1 es mayor a num2");
        }
        if (num1<num2){
            System.out.println("num2 = " + num2);
            System.out.println("num2 es mayor a num1");
        }
        if (num1==num2){
            System.out.println("Los numeros son iguales");
        }
    }
}
