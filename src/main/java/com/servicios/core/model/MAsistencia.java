package com.servicios.core.model;

import java.util.Date;

import com.servicios.core.entity.Asistencia;



public class MAsistencia {
	
	
	
	private int id;

	private Boolean asistencia;
	
	private Date fecha;
	
	public MAsistencia (Asistencia a){
		
		this.id = a.getId();
		this.asistencia = a.getAsistencia();
		this.fecha = a.getFecha();
		
	}
	
	public MAsistencia(int id, Boolean asistencia, Date fecha) {
		
		this.id = id;
		this.asistencia = asistencia;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(Boolean asistencia) {
		this.asistencia = asistencia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
