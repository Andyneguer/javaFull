import java.util.Scanner;
public class DatosInforme {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int sueldo,antiguedad;
        double aumento,totalsueldo;
        System.out.println("Ingrese sueldo de empleado");
        sueldo=an.nextInt();
        System.out.println("sueldo = " + sueldo);
        System.out.println("Años laborados en la empresa");
        antiguedad=an.nextInt();
        System.out.println("antiguedad = " + antiguedad);

        if (sueldo<499999 && antiguedad>=10){
            aumento=sueldo*(0.20);
            System.out.println("aumento = " + aumento);

            totalsueldo=(sueldo+aumento);
            System.out.println("totalsueldo = " + totalsueldo);
            System.out.println("El sueldo total es: " + totalsueldo);
        }
        if (sueldo<499999 && antiguedad<10){
            aumento=sueldo*(0.05);
            System.out.println("aumento = " + aumento);

            totalsueldo=(sueldo+aumento);
            System.out.println("totalsueldo = " + totalsueldo);
            System.out.println("El sueldo total es: " + totalsueldo) ;
        }
        if (sueldo>=500000){
            totalsueldo=sueldo;
            System.out.println("totalsueldo = " + totalsueldo);
            System.out.println("Su sueldo es de: " + totalsueldo);
        }
    }
}
