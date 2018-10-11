package com.servicios.core.model;

import javax.persistence.Id;

import com.servicios.core.entity.Materia;

public class MMateria {
	
	
	private int idmateria;

	private int creditos;

	private String grupo;

	private String nombre;

	private int semestre;
	
	public MMateria(Materia m){
		
		this.idmateria = m.getIdmateria();
		this.creditos = m.getCreditos();
		this.grupo = m.getGrupo();
		this.nombre = m.getNombre();
		this.semestre = m.getSemestre();
		
		
	}
	
	public MMateria(int idmateria, int creditos, String grupo, String nombre, int semestre) {
		
		this.idmateria = idmateria;
		this.creditos = creditos;
		this.grupo = grupo;
		this.nombre = nombre;
		this.semestre = semestre;
	}

public int getIdmateria() {
	return idmateria;
}

public void setIdmateria(int idmateria) {
	this.idmateria = idmateria;
}

public int getCreditos() {
	return creditos;
}

public void setCreditos(int creditos) {
	this.creditos = creditos;
}

public String getGrupo() {
	return grupo;
}

public void setGrupo(String grupo) {
	this.grupo = grupo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getSemestre() {
	return semestre;
}

public void setSemestre(int semestre) {
	this.semestre = semestre;
}



}
