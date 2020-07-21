import java.util.Scanner;

public class TestVehiculo {

    public static void main(String[] args) {
        String matricula, marca, modelo;
        int numeroPuertas, cilindrada, carga;

        Vehiculo vehiculo [] = new Vehiculo[4];

        Scanner Teclado = new Scanner(System.in);

        vehiculo[0] = new Vehiculo("AYB 123", "KWID", "2001");
        vehiculo[1] = new Vehiculo("LKS 456", "LOGAN", "2005");
        vehiculo[2] = new Vehiculo("KWR 789", "SANDERO", "2018");
        vehiculo[3] = new Vehiculo("POD 312", "NISSAN", "2019");

        System.out.println("Ingrese la matricula del vehiculo: ");
        matricula = Teclado.nextLine();

        System.out.println("Ingrese la marca del vehiculo: ");
        marca = Teclado.nextLine();

        System.out.println("Ingrese el modelo del vehiculo: ");
        modelo = Teclado.nextLine();

        System.out.println("Indique el numero de puertas del vehiculo: ");
        numeroPuertas = Teclado.nextInt();

        System.out.println("Indique el cilindraje del vehiculo: ");
        cilindrada = Teclado.nextInt();

        System.out.println("Indique la carga del vehiculo: ");
        carga = Teclado.nextInt();

        Vehiculo vehiculo1 [] = new Vehiculo[4];

        vehiculo1[0] = new Vehiculo(matricula, marca, modelo);
        vehiculo1[1] = new VehiculoTurismo(matricula, marca, modelo, numeroPuertas);
        vehiculo1[2] = new VehiculoDeportivo(matricula, marca, modelo, cilindrada);
        vehiculo1[3] = new VehiculoFurgoneta(matricula, marca, modelo, carga);

        System.out.println();
        for (Vehiculo e: vehiculo1){
            System.out.println(e.mostrarDatos());
        }
    }
}
