package com.servicios.core.model;

import javax.persistence.Id;

import com.servicios.core.entity.Nota;

public class MNota {
	
	
	private int id;
	private String asignatura;
	private int codasignatura;
	private int creditos;
	private float definitiva;
	private float exafinal;
	private float habilitacion;
	private float primerprevio;
	private float segundoprevio;
	private int semestre;
	private float vacacional;
	
	
	public MNota() {
		
	}
	
	
	public MNota(Nota n) {
		
		this.id = n.getId();
		this.asignatura = n.getAsignatura();
		this.codasignatura = n.getCodasignatura();
		this.creditos = n.getCreditos();
		this.definitiva = n.getDefinitiva();
		this.exafinal = n.getExafinal();
		this.habilitacion = n.getHabilitacion();
		this.primerprevio = n.getPrimerprevio();
		this.segundoprevio = n.getSegundoprevio();
		this.semestre = n.getSemestre();
		this.vacacional = n.getVacacional();
		
	}

	public MNota(int id, String asignatura, int codasignatura, int creditos, float definitiva, float exafinal,
			float habilitacion, float primerprevio, float segundoprevio, int semestre, float vacacional) {
		
		this.id = id;
		this.asignatura = asignatura;
		this.codasignatura = codasignatura;
		this.creditos = creditos;
		this.definitiva = definitiva;
		this.exafinal = exafinal;
		this.habilitacion = habilitacion;
		this.primerprevio = primerprevio;
		this.segundoprevio = segundoprevio;
		this.semestre = semestre;
		this.vacacional = vacacional;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	public int getCodasignatura() {
		return codasignatura;
	}


	public void setCodasignatura(int codasignatura) {
		this.codasignatura = codasignatura;
	}


	public int getCreditos() {
		return creditos;
	}


	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}


	public float getDefinitiva() {
		return definitiva;
	}


	public void setDefinitiva(float definitiva) {
		this.definitiva = definitiva;
	}


	public float getExafinal() {
		return exafinal;
	}


	public void setExafinal(float exafinal) {
		this.exafinal = exafinal;
	}


	public float getHabilitacion() {
		return habilitacion;
	}


	public void setHabilitacion(float habilitacion) {
		this.habilitacion = habilitacion;
	}


	public float getPrimerprevio() {
		return primerprevio;
	}


	public void setPrimerprevio(float primerprevio) {
		this.primerprevio = primerprevio;
	}


	public float getSegundoprevio() {
		return segundoprevio;
	}


	public void setSegundoprevio(float segundoprevio) {
		this.segundoprevio = segundoprevio;
	}


	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	public float getVacacional() {
		return vacacional;
	}


	public void setVacacional(float vacacional) {
		this.vacacional = vacacional;
	}
	
	
	
	
	
	

}
