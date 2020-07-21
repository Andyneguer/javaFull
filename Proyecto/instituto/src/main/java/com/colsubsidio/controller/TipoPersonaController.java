package com.colsubsidio.controller;

import com.colsubsidio.entities.TipoPersona;
import com.colsubsidio.services.TipoPersonaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoPersonaController {

    @Autowired
    private TipoPersonaService tipoPersonaService;

    @RequestMapping("/personas")
    public @ResponseBody
    Iterable<TipoPersona> finddAll() {
        return tipoPersonaService.findAll1();
    }

    @PostMapping("/personas")
    public void save(@RequestBody TipoPersona persona) {
        tipoPersonaService.save(persona);
    }
    @RequestMapping("/personas/{id_Persona}")
    public Optional<TipoPersona> findById(@PathVariable Integer id_TipoPersona){
        System.out.println(id_TipoPersona);
        return tipoPersonaService.findById(id_TipoPersona);
    }
}
