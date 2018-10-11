package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the materia database table.
 * 
 */
@Entity
@NamedQuery(name="Materia.findAll", query="SELECT m FROM Materia m")
public class Materia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idmateria;

	private int creditos;

	private String grupo;

	private String nombre;

	private int semestre;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="materia")
	private List<Asistencia> asistencias;

	

	public Materia() {
	}

	public int getIdmateria() {
		return this.idmateria;
	}

	public void setIdmateria(int idmateria) {
		this.idmateria = idmateria;
	}

	public int getCreditos() {
		return this.creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSemestre() {
		return this.semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setMateria(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setMateria(null);

		return asistencia;
	}

	

	
}