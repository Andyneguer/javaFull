package com.colsubsidio.controller;

import com.colsubsidio.entities.Estudiante;
import com.colsubsidio.services.EstudianteService;
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
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping("/estudiante")
    public @ResponseBody
    Iterable<Estudiante> finddAll() {
        return estudianteService.findAll1();
    }

    @PostMapping("/estudiante")
    public void save(@RequestBody Estudiante estudiante) {
        estudianteService.save(estudiante);
    }
    
    @RequestMapping("/personas/{id_Estudiante}")
    public Optional<Estudiante> findById(@PathVariable Integer id_Estudiante){
        System.out.println(id_Estudiante);
        return estudianteService.findById(id_Estudiante);
    }
    
    @DeleteMapping("/tipoPersona/{id_Estudiante}")
    public Integer delete(@PathVariable Integer id_Estudiante){
        System.out.println(id_Estudiante);
        estudianteService.borrarPorId(id_Estudiante);
        return 1;
    }
    
}
