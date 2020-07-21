/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Docente;
import com.colsubsidio.repositories.DocenteRepository;

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
public class DocenteService {
   @Autowired
    DocenteRepository docenteRepository;
    
   public  Iterable<Docente> findAll() {
        return docenteRepository.findAll();
    }

     public List<Docente> findAll1() {
        Iterable<Docente> it = docenteRepository.findAll();
        ArrayList<Docente> docente = new ArrayList<Docente>();
        it.forEach(e -> docente.add(e));
        return docente;
    }
    public Optional<Docente>  findById(Integer id_Docente) {
        return docenteRepository.findById(id_Docente);
    }
    public void save(Docente docente) {
        docenteRepository.save(docente);
    }
    
     public void borrarPorId(Integer id_Docente){
        docenteRepository.deleteById(id_Docente);
     }
}


