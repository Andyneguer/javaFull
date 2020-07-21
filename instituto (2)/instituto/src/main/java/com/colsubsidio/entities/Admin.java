/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

     @Id
    private Integer id_TipoPersona;
    private Integer id_Admin;
    private String Nombres;
    private String Apellidos;
    

    public Admin() {
    }

    public Integer getId_TipoPersona() {
        return id_TipoPersona;
    }

    public void setId_TipoPersona(Integer id_TipoPersona) {
        this.id_TipoPersona = id_TipoPersona;
    }

    public Integer getId_Admin() {
        return id_Admin;
    }

    public void setId_Estudiante(Integer id_Admin) {
        this.id_Admin = id_Admin;
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