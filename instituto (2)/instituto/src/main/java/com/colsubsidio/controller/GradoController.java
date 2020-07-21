package com.colsubsidio.controller;

import com.colsubsidio.entities.Grado;

import com.colsubsidio.services.GradoService;
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
public class GradoController {

    @Autowired
    private GradoService gradoService;

    @RequestMapping("/grado")
    public @ResponseBody
    Iterable<Grado> finddAll() {
        return gradoService.findAll1();
    }

    @PostMapping("/grado")
    public void save(@RequestBody Grado grado) {
        gradoService.save(grado);
    }
    
    @RequestMapping("/grado/{id_Grado}")
    public Optional<Grado> findById(@PathVariable int id_Grado){
        System.out.println(id_Grado);
        return gradoService.findById(id_Grado);
    }
    
    @DeleteMapping("/tipoPersona/{id_Grado}")
    public Integer delete(@PathVariable Integer id_Grado){
        System.out.println(id_Grado);
        gradoService.borrarPorId(id_Grado);
        return 1;
    }
    
}
