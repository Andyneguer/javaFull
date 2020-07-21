import java.util.Scanner;

public class EjercicioIfElse {
        // Exercise # 23 ----
        public static void main(String[] args) {
            //Sentencias de control if else
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingrese el mes: ");
            int mes=Integer.parseInt(sc.nextLine());
            String estacion;

            if(mes == 1 || mes== 2 || mes==12)
                estacion = ("Invierno");
            else if(mes ==3 || mes ==4 || mes ==5)
                estacion="Primavera";
            else if(mes ==6 || mes ==7 || mes ==8)
                estacion="Verano";
            else if(mes ==9 || mes ==10 || mes ==11)
                estacion="Otoño";
            else
                estacion="Mes Incorrecto";
            System.out.println("estacion = " + estacion);

        }
}
