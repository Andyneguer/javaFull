/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Estudiante;
import com.colsubsidio.repositories.EstudianteRepository;

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
public class EstudianteService {
   @Autowired
    EstudianteRepository estudianteRepository;
    
   public  Iterable<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

     public List<Estudiante> findAll1() {
        Iterable<Estudiante> it = estudianteRepository.findAll();
        ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
        it.forEach(e -> estudiante.add(e));
        return estudiante;
    }
    public Optional<Estudiante>  findById(Integer id_Estudiante) {
        return estudianteRepository.findById(id_Estudiante);
    }
    public void save(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
        
    }
    
     public void borrarPorId(Integer id_Estudiante){
        estudianteRepository.deleteById(id_Estudiante);
     }
}
