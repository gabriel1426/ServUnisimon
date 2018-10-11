package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private Boolean asistencia;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="idestudiante")
	private Estudiante estudiante;

	//bi-directional many-to-one association to Materia
	@ManyToOne
	@JoinColumn(name="idmateria")
	private Materia materia;

	public Asistencia() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(Boolean asistencia) {
		this.asistencia = asistencia;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return this.materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}