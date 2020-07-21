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
public class Materia {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Materia;
    private String nombre;
    private String descripcion;

    public Materia() {
    }

    public Materia(Integer id_Materia, String nombre, String descripcion) {
        this.id_Materia = id_Materia;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

     public Materia( String nombre, String descripcion) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(Integer id_Materia) {
        this.id_Materia = id_Materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}