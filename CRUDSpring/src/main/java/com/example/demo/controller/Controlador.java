package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceServices.IAlumnoService;
import com.example.demo.modelo.Alumno;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IAlumnoService objAlumnoService;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Alumno> lstAlumno = objAlumnoService.listar();
		model.addAttribute("alumnos", lstAlumno);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "addAlumno";
	}
	
	@PostMapping("/save")
	public String save(@Valid Alumno objAlumno, Model model) {
		objAlumnoService.save(objAlumno);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{codigoEst}")
	public String edit(@PathVariable int codigoEst, Model model) {
		Optional<Alumno> objAlumno = objAlumnoService.listarPorCodigo(codigoEst);
		model.addAttribute("alumno", objAlumno);
		return "addAlumno";
	}
	
	@GetMapping("/eliminar/{codigoEst}")
	public String eliminar(Model model, @PathVariable int codigoEst) {
		objAlumnoService.delete(codigoEst);
		return "redirect:/listar";
	}

}
