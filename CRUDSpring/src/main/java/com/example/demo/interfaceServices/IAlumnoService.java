package com.example.demo.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Alumno;

public interface IAlumnoService {
	
	public List<Alumno> listar();
	public Optional<Alumno> listarPorCodigo(int codigoEst);
	public int save(Alumno objAlumno);
	public void delete(int codigoEst);

}
