package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the horariodocente database table.
 * 
 */
@Entity
@NamedQuery(name="Horariodocente.findAll", query="SELECT h FROM Horariodocente h")
public class Horariodocente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String asignatura;

	private String codasignatura;

	private String dia;

	private String fin;

	private String grupo;

	private String inicio;

	private String programa;

	private String salon;

	private int semestre;

	//bi-directional many-to-one association to Docente
	@ManyToOne
	@JoinColumn(name="iddocente")
	private Docente docente;

	public Horariodocente() {
	}
	
	

	public Horariodocente(int id, String asignatura, String codasignatura, String dia, String fin, String grupo,
			String inicio, String programa, String salon, int semestre) {
		super();
		this.id = id;
		this.asignatura = asignatura;
		this.codasignatura = codasignatura;
		this.dia = dia;
		this.fin = fin;
		this.grupo = grupo;
		this.inicio = inicio;
		this.programa = programa;
		this.salon = salon;
		this.semestre = semestre;
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

	public String getCodasignatura() {
		return this.codasignatura;
	}

	public void setCodasignatura(String codasignatura) {
		this.codasignatura = codasignatura;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
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

	public String getPrograma() {
		return this.programa;
	}

	public void setPrograma(String programa) {
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

	public Docente getDocente() {
		return this.docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

}