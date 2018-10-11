package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the docente database table.
 * 
 */
@Entity
@NamedQuery(name="Docente.findAll", query="SELECT d FROM Docente d")
public class Docente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private String clave;

	private String direccion;

	private String emailinstitucional;

	private String emailpersonal;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String foto;

	private String genero;

	private String nombre;

	private int numdocumento;

	private String programa;

	private int telefono;

	private String tipodocumento;

	private String vinculacion;

	//bi-directional many-to-one association to Horariodocente
	@OneToMany(mappedBy="docente")
	private List<Horariodocente> horariodocentes;

	public Docente() {
	}
	
	

	public Docente(int codigo, String clave, String direccion, String emailinstitucional, String emailpersonal,
			Date fechanacimiento, String foto, String genero, String nombre, int numdocumento, String programa,
			int telefono, String tipodocumento, String vinculacion) {
		
		this.codigo = codigo;
		this.clave = clave;
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
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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

	public String getPrograma() {
		return this.programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
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

	public String getVinculacion() {
		return this.vinculacion;
	}

	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}

	public List<Horariodocente> getHorariodocentes() {
		return this.horariodocentes;
	}

	public void setHorariodocentes(List<Horariodocente> horariodocentes) {
		this.horariodocentes = horariodocentes;
	}

	public Horariodocente addHorariodocente(Horariodocente horariodocente) {
		getHorariodocentes().add(horariodocente);
		horariodocente.setDocente(this);

		return horariodocente;
	}

	public Horariodocente removeHorariodocente(Horariodocente horariodocente) {
		getHorariodocentes().remove(horariodocente);
		horariodocente.setDocente(null);

		return horariodocente;
	}

}