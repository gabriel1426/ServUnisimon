package com.servicios.core.model;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.servicios.core.entity.Docente;

public class MDocente {
	
	
	private int codigo;
	private String clave;
	private String direccion;
	private String emailinstitucional;
	private String emailpersonal;
	private Date fechanacimiento;
	private String foto;
	private String genero;
	private String nombre;
	private int numdocumento;
	private String programa;
	private int telefono;
	private String tipodocumento;
	private String vinculacion;
	
	
	public MDocente() {
		super();
	}

	public MDocente(Docente docente) {
		
		this.codigo = docente.getCodigo();
		this.clave=docente.getClave();
		this.direccion = docente.getDireccion();
		this.emailinstitucional = docente.getEmailinstitucional();
		this.emailpersonal = docente.getEmailpersonal();
		this.fechanacimiento = docente.getFechanacimiento();
		this.foto = docente.getFoto();
		this.genero = docente.getGenero();
		this.nombre = docente.getNombre();
		this.numdocumento = docente.getNumdocumento();
		this.programa = docente.getPrograma();
		this.telefono = docente.getTelefono();
		this.tipodocumento = docente.getTipodocumento();
		this.vinculacion = docente.getVinculacion();
		
	}


	public MDocente(int codigo,String clave ,String direccion, String emailinstitucional, String emailpersonal, Date fechanacimiento,
			String foto, String genero, String nombre, int numdocumento, String programa, int telefono,
			String tipodocumento, String vinculacion) {
		
		this.codigo = codigo;
		this.clave=clave;
		this.direccion = direccion;
		this.emailinstitucional = emailinstitucional;
		this.emailpersonal = emailpersonal;
		this.fechanacimiento = fechanacimiento;
		this.foto = foto;
		this.genero = genero;
		this.nombre = nombre;
		this.numdocumento = numdocumento;
		this.programa = programa;
		this.telefono = telefono;
		this.tipodocumento = tipodocumento;
		this.vinculacion = vinculacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmailinstitucional() {
		return emailinstitucional;
	}

	public void setEmailinstitucional(String emailinstitucional) {
		this.emailinstitucional = emailinstitucional;
	}

	public String getEmailpersonal() {
		return emailpersonal;
	}

	public void setEmailpersonal(String emailpersonal) {
		this.emailpersonal = emailpersonal;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getVinculacion() {
		return vinculacion;
	}

	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}
	
	
	

}
