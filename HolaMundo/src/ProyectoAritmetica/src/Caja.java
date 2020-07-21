public class Caja {

    //Atributos de la clase
    private int alto;
    private int ancho;
    private int profundo;

    //Metodo Contructor vacio
    public Caja(){

    }

    //Metodos Contructor con parametros
    public Caja(int alto,int ancho,int profundo){
        this.alto=alto;
        this.ancho=ancho;
        this.profundo=profundo;
    }

    //Metodo de calcular volumen
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }

    //Metodo
    public int calcularVolumen(int ancho,int alto,int profundo){
        return ancho * alto * profundo;
    }
}
