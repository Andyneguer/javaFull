/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudiante {

     @Id
    private Integer id_TipoPersona;
    private Integer id_Estudiante;
    private String Nombres;
    private String Apellidos;
    

    public Estudiante() {
    }

    public Integer getId_TipoPersona() {
        return id_TipoPersona;
    }

    public void setId_TipoPersona(Integer id_TipoPersona) {
        this.id_TipoPersona = id_TipoPersona;
    }

    public Integer getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(Integer id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

}