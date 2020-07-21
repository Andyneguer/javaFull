public class Personas{
    String nombre="";
    byte edad;
    byte numPiernas;
    byte numBrazos;
    String colorOjos;

    public Personas(){
        this.nombre=null;
        this.numPiernas=2;
        this.numBrazos=2;
        this.colorOjos=null;
    }
    public class main{
        public static void main(String[]args){

            Personas cami=new Personas();
            System.out.println("El nombre que contiene cami es: "+ cami.nombre + " nombre" + cami.numBrazos + "numBrazos" + cami.numPiernas + "numPiernas" + cami.colorOjos + "colorOjos" );
        }
    }
}