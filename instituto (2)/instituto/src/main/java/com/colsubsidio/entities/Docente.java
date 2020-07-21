/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Docente {

     @Id
    private Integer id_TipoPersona;
    private Integer id_Docente;
    private String Nombres;
    private String Apellidos;
    

    public Docente() {
    }

    public Integer getId_TipoPersona() {
        return id_TipoPersona;
    }

    public void setId_TipoPersona(Integer id_TipoPersona) {
        this.id_TipoPersona = id_TipoPersona;
    }

    public Integer getId_Docente() {
        return id_Docente;
    }

    public void setId_Docente(Integer id_Docente) {
        this.id_Docente = id_Docente;
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