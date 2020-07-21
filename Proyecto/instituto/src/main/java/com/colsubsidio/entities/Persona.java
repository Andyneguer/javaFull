/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona extends TipoPersona {

     
    private Integer id_TipoPersona;
    private Integer id_Persona;
    private String Nombres;
    private String Apellidos;

    public Persona() {
    }

    public Persona(Integer id_TipoPersona, Integer id_Persona, String Nombres, String Apellidos, String TipoPersona) {
        super(id_TipoPersona, TipoPersona);
        this.id_TipoPersona = id_TipoPersona;
        this.id_Persona = id_Persona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }
    
    @Id
    public Integer getId_TipoPersona() {
        return id_TipoPersona;
    }

    public void setId_TipoPersona(Integer id_TipoPersona) {
        this.id_TipoPersona = id_TipoPersona;
    }
    @Id
    public Integer getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(Integer id_Persona) {
        this.id_Persona = id_Persona;
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
