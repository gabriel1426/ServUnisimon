package com.servicios.core.model;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.servicios.core.entity.Estudiante;

public class MEstudiante {

	
	
	private int codigo;
	private String carrera;
	private String clave;
	private String direccion;
	private String emailinstitucional;
	private String emailpersonal;
	private Date fechanacimiento;
	private String foto;
	private String genero;
	private String nivelcarrera;
	private String nombre;
	private int numdocumento;
	private float promedio;
	private int semestre;
	private int telefono;
	private String tipodocumento;
	
	
	public MEstudiante() {
		super();
	}
	
	public MEstudiante(Estudiante estudiante) {
		
		this.codigo = estudiante.getCodigo();
		this.carrera = estudiante.getCarrera();
		this.clave = estudiante.getClave();
		this.direccion = estudiante.getDireccion();
		this.emailinstitucional = estudiante.getEmailinstitucional();
		this.emailpersonal = estudiante.getEmailpersonal();
		this.fechanacimiento = estudiante.getFechanacimiento();
		this.foto = estudiante.getFoto();
		this.genero = estudiante.getGenero();
		this.nivelcarrera = estudiante.getNivelcarrera();
		this.nombre = estudiante.getNombre();
		this.numdocumento = estudiante.getNumdocumento();
		this.promedio = estudiante.getPromedio();
		this.semestre = estudiante.getSemestre();
		this.telefono = estudiante.getTelefono();
		this.tipodocumento = estudiante.getTipodocumento();
		
	}
	

	public MEstudiante(int codigo, String carrera, String clave, String direccion, String emailinstitucional, String emailpersonal,
			Date fechanacimiento, String foto, String genero, String nivelcarrera, String nombre, int numdocumento,
			float promedio, int semestre, int telefono, String tipodocumento) {
		
		this.codigo = codigo;
		this.carrera = carrera;
		this.clave = clave;
		this.direccion = direccion;
		this.emailinstitucional = emailinstitucional;
		this.emailpersonal = emailpersonal;
		this.fechanacimiento = fechanacimiento;
		this.foto = foto;
		this.genero = genero;
		this.nivelcarrera = nivelcarrera;
		this.nombre = nombre;
		this.numdocumento = numdocumento;
		this.promedio = promedio;
		this.semestre = semestre;
		this.telefono = telefono;
		this.tipodocumento = tipodocumento;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmailinstitucional() {
		return emailinstitucional;
	}

	public void setEmailinstitucional(String emailinstitucional) {
		this.emailinstitucional = emailinstitucional;
	}

	public String getEmailpersonal() {
		return emailpersonal;
	}

	public void setEmailpersonal(String emailpersonal) {
		this.emailpersonal = emailpersonal;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNivelcarrera() {
		return nivelcarrera;
	}

	public void setNivelcarrera(String nivelcarrera) {
		this.nivelcarrera = nivelcarrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	
	
	
	
	
}
