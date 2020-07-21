/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Calificaciones;
import com.colsubsidio.repositories.CalificacionesRepository;

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
public class CalificacionesService {
   @Autowired
    CalificacionesRepository calificacionesRepository;
    
    public  Iterable<Calificaciones> findAll() {
        return calificacionesRepository.findAll();
    }

    public List<Calificaciones> findAll1() {
       Iterable<Calificaciones> it = calificacionesRepository.findAll();
       ArrayList<Calificaciones> notas = new ArrayList<Calificaciones>();
       it.forEach(e -> notas.add(e));
       return notas;
    }
    
    public Optional<Calificaciones>  findById(Integer id) {
       return calificacionesRepository.findById(id);
    }
    
    public void save(Calificaciones calificacion) {
        calificacionesRepository.save(calificacion);        
    }
    
   public void borrarPorId(Integer id_Calificaciones){
        calificacionesRepository.deleteById(id_Calificaciones);
     }
}
