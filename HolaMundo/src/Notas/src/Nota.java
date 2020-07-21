import java.util.Scanner;
public class Nota{
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        double nota1,nota2,nota3,promedio;
        String materia="";

        System.out.println("Ingrese nombre de materia");
        materia=an.nextLine();
        System.out.println("materia = " + materia);

        System.out.println("Ingrese nota1");
        nota1=an.nextDouble();
        System.out.println("Ingrese nota2");
        nota2=an.nextDouble();
        System.out.println("Ingrese nota3");
        nota3=an.nextDouble();
        System.out.print("nota1=" +"["+ nota1 +"] ");
        System.out.print("nota2=" +"["+ nota2 +"] ");
        System.out.print("nota3=" +"["+ nota3 +"]");
        System.out.println();

        System.out.println("promedio");
        promedio=(nota1+nota2+nota3)/3;
        System.out.println("promedio= " + promedio);

        if (promedio<=10.0 && promedio>=7.5){
            System.out.println("Excelente trabajo");
        }
        if (promedio<=7.4 && promedio>=6.0){
            System.out.println("Aprobaste Pero esfuerzate mas tu puedes");
        }
        if (promedio<=5.9){
            System.out.println("Perdiste la materia");
        }
    }
}
