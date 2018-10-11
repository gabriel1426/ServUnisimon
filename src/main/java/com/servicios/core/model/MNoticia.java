package com.servicios.core.model;

import java.util.Date;


import com.servicios.core.entity.Noticia;

public class MNoticia {

	
	private int id;
	private String cuerpo;
	private String enlace;
	private Date fecha;
	private String imagen;
	private String titulo;
	
	
	
	
	public MNoticia() {
		
	}
	public MNoticia(Noticia noticia) {
		
		this.id = noticia.getId();
		this.cuerpo = noticia.getCuerpo();
		this.enlace = noticia.getEnlace();
		this.fecha = noticia.getFecha();
		this.imagen = noticia.getImagen();
		this.titulo = noticia.getTitulo();
		
	}
	
	public MNoticia(int idNoticia, String cuerpo, String enlace, Date fecha, String imagen, String titulo) {
		
		this.id = idNoticia;
		this.cuerpo = cuerpo;
		this.enlace = enlace;
		this.fecha = fecha;
		this.imagen = imagen;
		this.titulo = titulo;
	}
	public int getIdNoticia() {
		return id;
	}
	public void setIdNoticia(int idNoticia) {
		this.id = idNoticia;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "MNoticia [id=" + id + ", cuerpo=" + cuerpo + ", enlace=" + enlace + ", fecha=" + fecha + ", imagen="
				+ imagen + ", titulo=" + titulo + "]";
	}
	
	
	
	
}
