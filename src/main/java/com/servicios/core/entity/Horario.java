package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String asignatura;

	private int codasignatura;

	private String dia;

	private String docente;

	private String fin;

	private String grupo;

	private String inicio;

	private int programa;

	private String salon;

	private int semestre;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Estudiante estudiante;

	public Horario() {
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

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getDocente() {
		return this.docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public String getFin() {
		return this.fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getInicio() {
		return this.inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public int getPrograma() {
		return this.programa;
	}

	public void setPrograma(int programa) {
		this.programa = programa;
	}

	public String getSalon() {
		return this.salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public int getSemestre() {
		return this.semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}