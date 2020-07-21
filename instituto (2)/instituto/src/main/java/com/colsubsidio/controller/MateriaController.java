package com.colsubsidio.controller;

import com.colsubsidio.entities.Materia;

import com.colsubsidio.services.MateriaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @RequestMapping("/materias")
    public @ResponseBody
    Iterable<Materia> finddAll() {
        return materiaService.findAll1();
    }

    @PostMapping("/materias")
    public void save(@RequestBody Materia materia) {
        materiaService.save(materia);
    }
    
    @RequestMapping("/materias/{id_Materia}")
    public Optional<Materia> findById(@PathVariable int id_Materia){
        System.out.println(id_Materia);
        return materiaService.findById(id_Materia);
    }
    
    @DeleteMapping("/tipoPersona/{id_TipoPersona}")
    public Integer delete(@PathVariable Integer id_Materia){
        System.out.println(id_Materia);
        materiaService.borrarPorId(id_Materia);
        return 1;
    }
}
