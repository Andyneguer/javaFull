import java.util.Scanner;
public class Negativo {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int num;

        System.out.println("Ingrese numero");
        num=an.nextInt();

        if (num<0){
            System.out.println("num = " + num);
            System.out.println("El numero es negativo");
        }
        if (num>0){
            System.out.println("num = " + num);
            System.out.println("El numero es positivo");
        }
        if (num==0){
            System.out.println("num = " + num);
            System.out.println("El numero es cero");
        }
    }
}
