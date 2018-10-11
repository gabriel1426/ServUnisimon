package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the materiaxestudiante database table.
 * 
 */
@Entity
@NamedQuery(name="Materiaxestudiante.findAll", query="SELECT m FROM Materiaxestudiante m")
public class Materiaxestudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int idestudiante;

	private int idmateria;

	private String mestudiante;

	public Materiaxestudiante() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdestudiante() {
		return this.idestudiante;
	}

	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}

	public int getIdmateria() {
		return this.idmateria;
	}

	public void setIdmateria(int idmateria) {
		this.idmateria = idmateria;
	}

	public String getMestudiante() {
		return this.mestudiante;
	}

	public void setMestudiante(String mestudiante) {
		this.mestudiante = mestudiante;
	}

}