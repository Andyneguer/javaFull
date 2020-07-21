/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.entities;

//import java.time.LocalDate;//libreria de fecha 

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Calificaciones {

    private Integer id_Clificaciones;
    private Integer id_Persona;
    private Integer id_Grado;
    private Integer id_Materia;
    private String nota;
    private String descripcion;
   


    public Calificaciones() {
    }

    public Calificaciones(Integer id_Clificaciones, Integer id_Persona, Integer id_Grado, Integer id_Materia, String nota, String descripcion) {
        this.id_Clificaciones = id_Clificaciones;
        this.id_Persona = id_Persona;
        this.id_Grado = id_Grado;
        this.id_Materia = id_Materia;
        this.nota = nota;
        this.descripcion = descripcion;
    }


    @Id
    public Integer getId_Clificaciones() {
        return id_Clificaciones;
    }

    public void setId_Clificaciones(Integer id_Clificaciones) {
        this.id_Clificaciones = id_Clificaciones;
    }

    public Integer getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(Integer id_Persona) {
        this.id_Persona = id_Persona;
    }

    public Integer getId_Grado() {
        return id_Grado;
    }

    public void setId_Grado(Integer id_Grado) {
        this.id_Grado = id_Grado;
    }

    public Integer getId_Materia() {
        return id_Materia;
    }

    public void setId_Materia(Integer id_Materia) {
        this.id_Materia = id_Materia;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
