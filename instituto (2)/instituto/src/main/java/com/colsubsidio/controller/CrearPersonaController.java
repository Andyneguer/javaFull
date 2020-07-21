package com.colsubsidio.controller;

import com.colsubsidio.entities.CrearPersona;
import com.colsubsidio.services.CrearPersonaService;
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
public class CrearPersonaController {

    @Autowired
    private CrearPersonaService personaService;

    @RequestMapping("/personas")
    public @ResponseBody
    Iterable<CrearPersona> finddAll() {
        return personaService.findAll1();
    }

    @PostMapping("/personas")
    public void save(@RequestBody CrearPersona persona) {
        personaService.save(persona);
    }
 @RequestMapping("/personas/{id_Persona}")
    public Optional<CrearPersona> findById(@PathVariable Integer id_Persona){
        System.out.println(id_Persona);
        return personaService.findById(id_Persona);
    }
    
        @DeleteMapping("/tipoPersona/{id_Persona}")
    public Integer delete(@PathVariable Integer id_Persona){
        System.out.println(id_Persona);
        personaService.borrarPorId(id_Persona);
        return 1;
    }
    
}
