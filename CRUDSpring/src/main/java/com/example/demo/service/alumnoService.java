package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceServices.IAlumnoService;
import com.example.demo.interfaces.IAlumno;
import com.example.demo.modelo.Alumno;

@Service
public class alumnoService implements IAlumnoService {

	@Autowired
	private IAlumno objIAlumno;
	
	@Override
	public List<Alumno> listar() {
		
		return (List<Alumno>) objIAlumno.findAll();
	}

	@Override
	public Optional<Alumno> listarPorCodigo(int codigoEst) {
		return objIAlumno.findById(codigoEst);
	}

	@Override
	public int save(Alumno objAlumno) {
		int  res = 0;
		Alumno objAlum = objIAlumno.save(objAlumno);
		if(!objAlum.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int codigoEst) {
		objIAlumno.deleteById(codigoEst);
		
	}

}
