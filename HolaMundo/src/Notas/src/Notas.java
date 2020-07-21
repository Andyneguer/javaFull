import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int nota1,nota2,nota3,promedio;
        System.out.println("Ingrese nota1");
        nota1=an.nextInt();
        System.out.println();
        System.out.println("Ingrese nota2");
        nota2=an.nextInt();
        System.out.println();
        System.out.println("Ingrese nota3");
        nota3=an.nextInt();

        promedio=(nota1+nota2+nota3)/3;
        System.out.println("promedio = " + promedio);
    }
}
