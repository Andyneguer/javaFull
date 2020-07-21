/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.TipoPersona;
import com.colsubsidio.repositories.TipoPersonaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Arboleda
 */
@Service
public class TipoPersonaService {
    
    @Autowired
    TipoPersonaRepository tipoPersonaRepository;
    
    public  Iterable<TipoPersona> findAll() {
        return tipoPersonaRepository.findAll();
    }

    public List<TipoPersona> findAll1() {
       Iterable<TipoPersona> it = tipoPersonaRepository.findAll();
       ArrayList<TipoPersona> tpersonas = new ArrayList<TipoPersona>();
       it.forEach(e -> tpersonas.add(e));
       return tpersonas;
    }
    public Optional<TipoPersona>  findById(Integer id_TipoPersona) {
        return tipoPersonaRepository.findById(id_TipoPersona);
    }
    public void save(TipoPersona tpersona) {
        tipoPersonaRepository.save(tpersona);
        
    }
   
    public void borrarPorId(Integer id_TipoPersona){
        tipoPersonaRepository.deleteById(id_TipoPersona);
     }

}
