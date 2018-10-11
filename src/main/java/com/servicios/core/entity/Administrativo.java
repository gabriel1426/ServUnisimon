package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the administrativo database table.
 * 
 */
@Entity
@NamedQuery(name="Administrativo.findAll", query="SELECT a FROM Administrativo a")
public class Administrativo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private String cargo;
	
	private String clave;

	private String dependencia;

	private String direccion;

	private String emailinstitucional;

	private String emailpersonal;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String foto;

	private String genero;

	private String nombre;

	private int numdocumento;

	private int telefono;

	private String tipodocumento;

	public Administrativo() {
	}
	
	

	public Administrativo(int codigo, String cargo, String clave,String dependencia, String direccion, String emailinstitucional,
			String emailpersonal, Date fechanacimiento, String foto, String genero, String nombre, int numdocumento,
			int telefono, String tipodocumento) {
		
		this.codigo = codigo;
		this.cargo = cargo;
		this.clave=clave;
		this.dependencia = dependencia;
		this.direccion = direccion;
		this.emailinstitucional = emailinstitucional;
		this.emailpersonal = emailpersonal;
		this.fechanacimiento = fechanacimiento;
		this.foto = foto;
		this.genero = genero;
		this.nombre = nombre;
		this.numdocumento = numdocumento;
		this.telefono = telefono;
		this.tipodocumento = tipodocumento;
	}



	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getDependencia() {
		return this.dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmailinstitucional() {
		return this.emailinstitucional;
	}

	public void setEmailinstitucional(String emailinstitucional) {
		this.emailinstitucional = emailinstitucional;
	}

	public String getEmailpersonal() {
		return this.emailpersonal;
	}

	public void setEmailpersonal(String emailpersonal) {
		this.emailpersonal = emailpersonal;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumdocumento() {
		return this.numdocumento;
	}

	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}



	
	
	

}