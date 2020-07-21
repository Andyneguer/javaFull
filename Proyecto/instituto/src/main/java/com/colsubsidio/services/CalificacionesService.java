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
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author DAGOBERTOANDRES
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
        ArrayList<Calificaciones> calificaciones = new ArrayList<Calificaciones>();
        it.forEach(e -> calificaciones.add(e));
        return calificaciones;
    }
    public Optional<Calificaciones>  findById(Integer id_Calificaciones) {
        return calificacionesRepository.findById(id_Calificaciones);
    }
    public void save(Calificaciones calificaciones) {
        calificacionesRepository.save(calificaciones);
        
    }
}