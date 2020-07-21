public class VehiculoDeportivo extends Vehiculo {

    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String mostarDatos() {
        return "Vehiculo deportivo con {" +
                "Cilindrada de: " + cilindrada +
                "Matricula: " + matricula + '\'' +
                "Marca: " + marca + '\'' +
                "Modelo: " + modelo + '\'';
    }
}
