import java.util.Scanner;

public class Capacitacion{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	int t_preguntas, t_correctas;
        System.out.print("Ingrese la cantidad total de preguntas del examen:");
        t_preguntas=brito.nextInt();
        System.out.print("Ingrese la cantidad total de preguntas contestadas correctamente:");
        t_correctas=brito.nextInt();
        int porcentaje=t_correctas * 100 / t_preguntas;
        if (porcentaje>=90) {
            System.out.print("Nivel máximo");
        } else {
            if (porcentaje>=75) {
                System.out.print("Nivel medio");
            } else {
                if (porcentaje>=50) {
                    System.out.print("Nivel regular");
                } else {
                    System.out.print("Fuera de nivel");
                }
            }
        }
    } 
}