
public class Automovil122 {

    static private String color, marca, modelo;
    static private int caballosMotor;
    
    public Automovil122 (String color, String marca, String modelo){
    
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        
        System.out.println ("Se creo u nobjeto de Automovil y tiene " + this.color + " marca: " + this.marca + " y modelo: " + this.modelo);
    }
    
    public Automovil122 (int caballosMotor){
    
        this.caballosMotor = caballosMotor;
        System.out.println ("Se creo un objeto con caballos motor de: " + this.caballosMotor);
    }
    
    void arrancar (){
    
        System.out.println("Arrancó");
  
    }
    
    void frenar (){
    
        System.out.println("Stop");
    }
    
    void acelerar (int km){
    
        System.out.println("Vamos a " + km + " KM/H");
    }
}
