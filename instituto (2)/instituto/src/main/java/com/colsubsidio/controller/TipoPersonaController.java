package com.colsubsidio.controller;

import com.colsubsidio.entities.TipoPersona;
import com.colsubsidio.services.TipoPersonaService;
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
public class TipoPersonaController {

    @Autowired
    private TipoPersonaService tipoPersonaService;

    @RequestMapping("/tipoPersonas")
    public @ResponseBody
    Iterable<TipoPersona> finddAll() {
        return tipoPersonaService.findAll1();
    }

    @PostMapping("/tipoPersonas")
    public void save(@RequestBody TipoPersona tpersona) {
        tipoPersonaService.save(tpersona);
    }
    @RequestMapping("/tipoPersonas/{id_TipoPersona}")
    public Optional<TipoPersona> findById(@PathVariable Integer id_TipoPersona){
        System.out.println(id_TipoPersona);
        return tipoPersonaService.findById(id_TipoPersona);
    }
    
    @DeleteMapping("/tipoPersona/{id_TipoPersona}")
    public Integer delete(@PathVariable Integer id_TipoPersona){
        System.out.println(id_TipoPersona);
        tipoPersonaService.borrarPorId(id_TipoPersona);
        return 1;
    }
    
}
