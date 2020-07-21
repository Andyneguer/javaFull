public class VehiculoTurismo extends Vehiculo {

    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String mostrarDatos() {
        return "Vehiculo de turismo con: " + '\'' +
                "Numero de puertas=" + numeroPuertas + '\'' +
                "Matricula: " + matricula + '\'' +
                "Marca: " + marca + '\'' +
                "Modelo: " + modelo + '\'';
    }
}
