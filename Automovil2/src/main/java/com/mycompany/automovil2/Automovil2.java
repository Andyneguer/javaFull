
package com.mycompany.automovil2;

public class Automovil2 {

    //Atributos sean privados o protegidos
    private String marca, modelo;
    
    public Automovil2 (String marca, String modelo){
    
        this.marca = marca;
        this.modelo = modelo;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "se creo el carro de marca "+marca+" y modelo "+modelo;
    }
    
    
}
