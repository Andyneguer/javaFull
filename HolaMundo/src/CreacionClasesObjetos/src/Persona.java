public class Persona 
{
    //Atributos de una Clase
    //No es necesario asignar valores
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    // Metodos de la Clase
    // Estos metodos los usaran los objetos de esta clase
    //void no regresa ningun tipo de informacion;

    public void desplegarNombre()
    {//metodo
        System.out.println("nombre = " + nombre);
        System.out.println("apellidoPaterno = " + apellidoPaterno);
        System.out.println("apellidoMaterno = " + apellidoMaterno);
    }
}
