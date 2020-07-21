import java.util.Scanner;

public class OperadoresCondicionales {
    // Exercise # 18 ----
    public static void main(String[] args) {
        // operadores condicionales
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        int a =Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor minimo del numero: ");
        int valorMin=Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el valor maximo del numero: ");
        int valorMax=Integer.parseInt(sc.nextLine());

        if(a>=valorMin && a<=valorMax) {
            System.out.println("Dentro del Rango");
        }else {
            System.out.println("Fuera del rango");
        }

        boolean vacaciones=Boolean.parseBoolean(sc.nextLine());
        boolean diaDescanso=Boolean.parseBoolean(sc.nextLine());

            if(vacaciones || diaDescanso) {
                System.out.println("Puede ir al juego");
            }else {
                System.out.println("No puede asistir");
            }
    }
}
