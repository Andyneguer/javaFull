import java.util.Scanner;
public class Sueldo {
    public static void main(String[] args) {
        Scanner an=new Scanner (System.in);
        int sueldo,horEx,sueldototal;

        System.out.println("Ingrese el sueldo de la persona");
        sueldo=an.nextInt();
        System.out.println("Ingrese Horas extras");
        horEx=an.nextInt();
        System.out.println();

        sueldototal=(sueldo + horEx*3000);

        System.out.println("sueldototal = " + sueldototal);
    }
}
