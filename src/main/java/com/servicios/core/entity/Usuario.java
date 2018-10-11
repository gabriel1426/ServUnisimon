package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	
	
	

	@Id
	private int codigo;

	private String carrera;

	private int cedula;

	private String clave;

	private String correo;

	private String nombre;

	public Usuario() {
	}
	
	

	public Usuario(int codigo, String carrera, int cedula, String clave, String correo, String nombre) {
		super();
		this.codigo = codigo;
		this.carrera = carrera;
		this.cedula = cedula;
		this.clave = clave;
		this.correo = correo;
		this.nombre = nombre;
	}



	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getCedula() {
		return this.cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}