/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Materia;
import com.colsubsidio.repositories.MateriaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Andres Arboleda
 */
@Service
public class MateriaService {
   @Autowired
    MateriaRepository materiaRepository;
    
   public  Iterable<Materia> findAll() {
        return materiaRepository.findAll();
    }

     public List<Materia> findAll1() {
        Iterable<Materia> it = materiaRepository.findAll();
        ArrayList<Materia> materia = new ArrayList<Materia>();
        it.forEach(e -> materia.add(e));
        return materia;
    }
    public Optional<Materia> findById(Integer id_Materia) {
        return materiaRepository.findById(id_Materia);
    }
    public void save(Materia materia) {
        materiaRepository.save(materia);
        
    }
}