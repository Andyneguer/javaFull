import java.util.Scanner;
public class Empleado {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int horaTra,impuesto,sueldoTotal,sueldoNeto;
        System.out.println("Ingrese horas trabajadas por empleado");
        horaTra=an.nextInt();
        System.out.println();

        sueldoTotal=(horaTra*20000);
        impuesto=(sueldoTotal*10/100);
        sueldoNeto=sueldoTotal-impuesto;
        System.out.println("impuesto = " + impuesto);
        System.out.println("sueldoTotal = " + sueldoTotal);
        System.out.println("sueldoNeto = " + sueldoNeto);
    }
}
