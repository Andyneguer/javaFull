package com.colsubsidio.controller;

import com.colsubsidio.entities.Calificaciones;

import com.colsubsidio.services.CalificacionesService;
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
public class CalificacionesController {

    @Autowired
    private CalificacionesService calificacionesService;

    @RequestMapping("/calificaciones")
    public @ResponseBody
    Iterable<Calificaciones> finddAll() {
        return calificacionesService.findAll1();
    }

    @PostMapping("/Calificaciones")
    public void save(@RequestBody Calificaciones notas) {
        calificacionesService.save(notas);
    }
    
    @RequestMapping("/Calificaciones/{id_Calificaciones}")
    public Optional<Calificaciones> findById(@PathVariable int id_Calificaciones){
        System.out.println(id_Calificaciones);
        return calificacionesService.findById(id_Calificaciones);
    }
    
    @DeleteMapping("/tipoPersona/{id_Calificaciones}")
    public Integer delete(@PathVariable Integer id_Calificaciones){
        System.out.println(id_Calificaciones);
        calificacionesService.borrarPorId(id_Calificaciones);
        return 1;
    }
    
}
