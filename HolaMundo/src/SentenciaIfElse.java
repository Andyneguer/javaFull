import java.util.Scanner;

public class SentenciaIfElse {
    // Exercise # 21 ----
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la Materia");
        String materia=sc.nextLine();
        System.out.println("*******************");
        System.out.println("Ingrese Nombre estudiante");
        String estudiante=sc.nextLine();
        System.out.println("*******************");
        System.out.println("Ingrese la nota1");
        double nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("*******************");
        System.out.println("Ingrese la nota2");
        double nota2=Double.parseDouble(sc.nextLine());
        System.out.println("*******************");
        System.out.println("Ingrese la nota3");
        double nota3=Double.parseDouble(sc.nextLine());
        System.out.println("*******************");

        double calificacion=(nota1+nota2+nota3)/3;


        if((calificacion >=9.0) && (calificacion <=10)) {
            System.out.println("A "+nota1);
            System.out.println("Eres un@ Estudiante brillante sigue asi");
        }else if (calificacion >=8.0 && calificacion <9) {
            System.out.println("B "+nota1);
            System.out.println("Claificacion sobresaliente");
        }else if (calificacion >=7.0 && calificacion <8) {
            System.out.println("C "+nota1);
            System.out.println("Te falta mas esfuerzo tu puedes");
        }else if (calificacion >=6.0 && calificacion <7) {
            System.out.println("D "+nota1);
            System.out.println("Tu empeño puede salir si te pones las pilas");
        }else if (calificacion >=0 && calificacion <6) {
            System.out.println("F "+nota1);
            System.out.println("Metele ganas tu puedes nos vemos en las sigientes calificaciones");
        }else {
            System.out.println("Materia = " + materia);
        }
        System.out.println("estudiante = " + estudiante);
        System.out.println("Materia = " + materia);
        System.out.println("nota1 = " + nota1);
        System.out.println("nota2 = " + nota2);
        System.out.println("nota3 = " + nota3);
        System.out.println("calificacion = " + calificacion);
    }
}
