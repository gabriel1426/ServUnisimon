package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the notas database table.
 * 
 */
@Entity
@Table(name="notas")
@NamedQuery(name="Nota.findAll", query="SELECT n FROM Nota n")
public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
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

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="idestudiante")
	private Estudiante estudiante;

	public Nota() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsignatura() {
		return this.asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getCodasignatura() {
		return this.codasignatura;
	}

	public void setCodasignatura(int codasignatura) {
		this.codasignatura = codasignatura;
	}

	public int getCreditos() {
		return this.creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public float getDefinitiva() {
		return this.definitiva;
	}

	public void setDefinitiva(float definitiva) {
		this.definitiva = definitiva;
	}

	public float getExafinal() {
		return this.exafinal;
	}

	public void setExafinal(float exafinal) {
		this.exafinal = exafinal;
	}

	public float getHabilitacion() {
		return this.habilitacion;
	}

	public void setHabilitacion(float habilitacion) {
		this.habilitacion = habilitacion;
	}

	public float getPrimerprevio() {
		return this.primerprevio;
	}

	public void setPrimerprevio(float primerprevio) {
		this.primerprevio = primerprevio;
	}

	public float getSegundoprevio() {
		return this.segundoprevio;
	}

	public void setSegundoprevio(float segundoprevio) {
		this.segundoprevio = segundoprevio;
	}

	public int getSemestre() {
		return this.semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public float getVacacional() {
		return this.vacacional;
	}

	public void setVacacional(float vacacional) {
		this.vacacional = vacacional;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}