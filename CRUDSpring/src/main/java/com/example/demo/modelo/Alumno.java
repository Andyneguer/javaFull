package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "alumno")
public class Alumno {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoEst;
	private String nombre, direccion, telefono;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	

	public Alumno(int codigoEst, String nombre, String direccion, String telefono) {
		super();
		this.codigoEst = codigoEst;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public int getCodigoEst() {
		return codigoEst;
	}

	public void setCodigoEst(int codigoEst) {
		this.codigoEst = codigoEst;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
