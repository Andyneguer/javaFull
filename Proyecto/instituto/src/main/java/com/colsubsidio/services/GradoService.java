/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Grado;
import com.colsubsidio.repositories.GradoRepository;

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
public class GradoService {
   @Autowired
    GradoRepository gradoRepository;
    
   public  Iterable<Grado> findAll() {
        return gradoRepository.findAll();
    }

     public List<Grado> findAll1() {
        Iterable<Grado> it = gradoRepository.findAll();
        ArrayList<Grado> grado = new ArrayList<Grado>();
        it.forEach(e -> grado.add(e));
        return grado;
    }
    public Optional<Grado> findById(Integer id_Grado) {
        return gradoRepository.findById(id_Grado);
    }
    public void save(Grado grado) {
        gradoRepository.save(grado);
        
    }
}