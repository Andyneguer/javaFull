package com.colsubsidio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/Bienvenido")
    public String sayHi(){
    return "Bienvenido!!";
    }
    
}
