package com.colsubsidio.controller;

import com.colsubsidio.entities.Docente;
import com.colsubsidio.services.DocenteService;
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
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @RequestMapping("/docente")
    public @ResponseBody
    Iterable<Docente> finddAll() {
        return docenteService.findAll1();
    }

    @PostMapping("/docente")
    public void save(@RequestBody Docente Docente) {
        docenteService.save(Docente);
    }
    
    @RequestMapping("/docente/{id_Docente}")
    public Optional<Docente> findById(@PathVariable Integer id_Docente){
        System.out.println(id_Docente);
        return docenteService.findById(id_Docente);
    }
    
        @DeleteMapping("/tipoPersona/{id_TipoPersona}")
    public Integer delete(@PathVariable Integer id_Docente){
        System.out.println(id_Docente);
        docenteService.borrarPorId(id_Docente);
        return 1;
    }
    
}
