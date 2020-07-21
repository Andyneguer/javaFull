import java.util.Scanner;

public class ConversionesTipos {
    // Exercise # 11 ----
    public static void main(String[] args) {
       /*double valorPi= Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);

        float carro= Float.parseFloat("3212315464564154564F");
        System.out.println("carro = " + carro);

        char ch= "hola".charAt(2);
        System.out.println("ch = " + ch);*/

        Scanner sc=new Scanner(System.in);
        /*//Tipo int.
        int edad=Integer.parseInt(sc.nextLine());
        System.out.println("edad = " + edad);

        //Tipo char.
        char caracter= sc.nextLine().charAt(0);
        System.out.println("caracter: " + caracter);


        String valorPiTexto = String.valueOf(valorPi);
        System.out.println("edadTexto = " + valorPiTexto);

        String valorPiTexto2 ="" + valorPi;
        System.out.println("valorPiTexto2: " + valorPiTexto2);

        byte b = 10;
        short sh = b;

        short s2= 15;
        byte b2= (byte) (s2 + 1);*/

        //
        System.out.println("Ingrese el nombre del libro");
        String nombre=sc.nextLine();
        System.out.println("***************************");
        System.out.println("Ingrese el Id del libro");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("***************************");
        System.out.println("Ingrese el precio del libro");
        double precio=Double.parseDouble(sc.nextLine());
        System.out.println("***************************");
        System.out.println("Proporciona el simbolo");
        char simbolo=sc.nextLine().charAt(0);
        System.out.println("***************************");
        boolean envioGratuito=Boolean.parseBoolean(sc.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        //

    }
}
