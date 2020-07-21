 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoPersona {

     
    private Integer id_TipoPersona;
    private String TipoPersona;
    
    
    public TipoPersona() {
    }

    public TipoPersona(Integer id_TipoPersona, String TipoPersona) {
        this.id_TipoPersona = id_TipoPersona;
        this.TipoPersona = TipoPersona;
    }
    @Id
    public Integer getId_TipoPersona() {
        return id_TipoPersona;
    }

    public void setId_TipoPersona(Integer id_TipoPersona) {
        this.id_TipoPersona = id_TipoPersona;
    }

    public String getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(String TipoPersona) {
        this.TipoPersona = TipoPersona;
    }
}
