package com.servicios.core.model;

public class Respuesta {
	
	public Respuesta(){
	}
	
	boolean respuesta=false;
	String token="";
	
	public boolean isRespuesta() {
		return respuesta;
	}
	public void setRespuesta(boolean respuesta) {
		this.respuesta = respuesta;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	

}
