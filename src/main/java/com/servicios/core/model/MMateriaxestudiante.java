package com.servicios.core.model;

import javax.persistence.Id;

import com.servicios.core.entity.Materiaxestudiante;

public class MMateriaxestudiante {
	
	

	private int id;

	private int idestudiante;

	private int idmateria;

	private String mestudiante;
	
	public MMateriaxestudiante(){
		
		
	}
	public MMateriaxestudiante(Materiaxestudiante m){
		this.id=m.getId();
		this.mestudiante=m.getMestudiante();
		this.idmateria=m.getIdmateria();
		this.idestudiante=m.getIdestudiante();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMestudiante() {
		return mestudiante;
	}
	public void setMestudiante(String mestudiante) {
		this.mestudiante = mestudiante;
	}
	public int getIdestudiante() {
		return idestudiante;
	}
	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}
	public int getIdmateira() {
		return idmateria;
	}
	public void setIdmateira(int idmateira) {
		this.idmateria = idmateira;
	}
	
	
	
	
	

}
