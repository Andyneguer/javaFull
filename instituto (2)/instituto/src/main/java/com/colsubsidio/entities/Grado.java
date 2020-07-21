/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grado {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Grado;
    private String Grado;
    

    public Grado() {
    }

    public Grado(Integer id_Grado, String Grado) {
        this.id_Grado = id_Grado;
        this.Grado = Grado;
    }

     public Grado( String Grado) {
        this.Grado = Grado;
    }

    public Integer getId_Grado() {
        return id_Grado;
    }

    public void setId_Grado(Integer id_Grado) {
        this.id_Grado = id_Grado;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

}