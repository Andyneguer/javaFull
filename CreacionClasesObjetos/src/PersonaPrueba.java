public class PersonaPrueba {
    public static void main(String[] args) {
        // creacion de un objetos
        Persona persona1=new Persona();

        //Llamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto persona");
        persona1.desplegarNombre();

        //Modificar los valores del objeto creado
        persona1.nombre="Andres";
        persona1.apellidoPaterno="Arboleda";
        persona1.apellidoMaterno="Garzon";
        System.out.println("*******************************");

        //Volvemos a llamar al metodo desplegar nombre de la clase persona
        System.out.println("\nNuevos valores del objeto persona");
        persona1.desplegarNombre();
        System.out.println("*******************************");

        //Creacion de un segundo objetos
        Persona persona2=new Persona();

        //Llamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto persona");
        persona2.desplegarNombre();

        //Modificar los valores del objeto creado
        persona2.nombre="Maria Camila";
        persona2.apellidoPaterno="Arboleda";
        persona2.apellidoMaterno="Medina";
        System.out.println("*******************************");

        //Volvemos a llamar al metodo desplegar nombre de la clase persona
        System.out.println("\nNuevos valores del objeto persona");
        persona2.desplegarNombre();
        System.out.println("*******************************");
    }
}
