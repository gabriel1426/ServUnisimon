package com.servicios.core.model;

import javax.persistence.Id;

import com.servicios.core.entity.Horariodocente;

public class MHorariodocente {

	
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

	public MHorariodocente() {
		
	}
	
	public MHorariodocente(Horariodocente h) {
		
		this.id = h.getId();
		this.asignatura = h.getAsignatura();
		this.codasignatura = h.getCodasignatura();
		this.dia = h.getDia();
		this.fin = h.getFin();
		this.grupo = h.getGrupo();
		this.inicio = h.getInicio();
		this.programa = h.getPrograma();
		this.salon = h.getSalon();
		this.semestre = h.getSemestre();
		
	}

	public MHorariodocente(int id, String asignatura, String codasignatura, String dia, String fin, String grupo,
			String inicio, String programa, String salon, int semestre) {
		
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

	public String getCodasignatura() {
		return codasignatura;
	}

	public void setCodasignatura(String codasignatura) {
		this.codasignatura = codasignatura;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
	
	
	
}
