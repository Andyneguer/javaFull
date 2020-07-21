import java.util.Scanner;
public class TipoBoolean {
    // Exercise # 10 ----
    public static void main(String[] args) {
        //boolean
        //System.out.println("bits tipo boolean: " + Boolean.SIZE);
        //System.out.println("bytes tipo boolean: " + Boolean.BYTES);
        System.out.println("valor minimo tipo boolean: " + Boolean.TRUE);
        System.out.println("******************************************");
        System.out.println("valor maximo tipo boolean: " + Boolean.FALSE);
        System.out.println("******************************************");

        Scanner sc = new Scanner(System.in);

        boolean booleanVar = true;

        if (booleanVar){ //booleanVar true
            System.out.println("La variable contiene un valor Verdadero");
            System.out.println("***************************************");
        }else {
            System.out.println("La variable contiene un valor false");
            System.out.println("***************************************");
        }

        int edad;
        System.out.println("Ingrese la edad: ");
        edad=sc.nextInt();
        boolean adulto = edad >=18;
        if(adulto) {
            System.out.println("Eres mayor de edad, puedes pasar");
            System.out.println("***************************************");
        }else {
            System.out.println("Eres menor de edad, no puedes pasar");
            System.out.println("***************************************");
        }
    }
}
