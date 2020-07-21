public class VehiculoFurgoneta extends Vehiculo {

    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String mostarDatos() {
        return "Vehiculo de furgoneta con: " +
                "Carga de: " + carga +
                "Matricula: " + matricula + '\'' +
                "Marca: " + marca + '\'' +
                "Modelo: " + modelo + '\'';
    }
}

