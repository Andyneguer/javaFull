import java.util.Scanner;
public class Mis_Zapatos {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int compras,descuento,totalprecio;

        System.out.println("Ingrese el monto de la compra");
        compras=an.nextInt();

        if (compras>=100000){
            System.out.println("compras = " + compras);
            System.out.println("Usted tiene derecho al 50% de su compra");

            descuento=(compras*50)/100;
            System.out.println("descuento = " + descuento);

            totalprecio=compras-descuento;
            System.out.println("totalprecio = " + totalprecio);
        }
        if (compras<=99000){
            descuento=(compras*10/100);
            System.out.println("descuento = " + descuento);
            System.out.println("descuento del 10% en su compra");

            totalprecio=compras-descuento;
            System.out.println("totalprecio = " + totalprecio);
            System.out.println("El total de su compra es: "+ totalprecio);
        }
    }
}
