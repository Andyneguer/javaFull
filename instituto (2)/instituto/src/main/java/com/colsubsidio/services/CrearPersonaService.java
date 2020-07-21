/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.CrearPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.colsubsidio.repositories.CrearPersonaRepository;

/**
 *
 * @author Andres Arboleda
 */
@Service
public class CrearPersonaService {
   @Autowired
    CrearPersonaRepository personaRepository;
    
   public  Iterable<CrearPersona> findAll() {
        return personaRepository.findAll();
    }

     public List<CrearPersona> findAll1() {
        Iterable<CrearPersona> it = personaRepository.findAll();
        ArrayList<CrearPersona> personas = new ArrayList<CrearPersona>();
        it.forEach(e -> personas.add(e));
        return personas;
    }
    public Optional<CrearPersona>  findById(Integer id_Persona) {
        return personaRepository.findById(id_Persona);
    }
    public void save(CrearPersona persona) {
        personaRepository.save(persona);
        
    }
     public void borrarPorId(Integer id_Persona){
        personaRepository.deleteById(id_Persona);
     }
}
