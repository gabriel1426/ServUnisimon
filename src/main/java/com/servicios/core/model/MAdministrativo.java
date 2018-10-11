package com.servicios.core.model;

import java.util.Date;
import com.servicios.core.entity.Administrativo;

public class MAdministrativo {
	
	private int codigo;

	private String cargo;
	
	private String clave;

	private String dependencia;

	private String direccion;

	private String emailinstitucional;

	private String emailpersonal;

	private Date fechanacimiento;

	private String foto;

	private String genero;

	private String nombre;

	private int numdocumento;

	private int telefono;

	private String tipodocumento;
	
	public MAdministrativo() {
		
	}

	public MAdministrativo(Administrativo admin) {
		this.codigo = admin.getCodigo();
		this.cargo = admin.getCargo();
		this.clave=admin.getClave();
		this.dependencia = admin.getDependencia();
		this.direccion = admin.getDireccion();
		this.emailinstitucional = admin.getEmailinstitucional();
		this.emailpersonal = admin.getEmailpersonal();
		this.fechanacimiento = admin.getFechanacimiento();
		this.foto = admin.getFoto();
		this.genero = admin.getGenero();
		this.nombre = admin.getNombre();
		this.numdocumento = admin.getNumdocumento();
		this.telefono = admin.getTelefono();
		this.tipodocumento = admin.getTipodocumento();
		
	}

	public MAdministrativo(int codigo, String cargo, String clave,String dependencia, String direccion, String emailinstitucional,
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
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCargo() {
		return cargo;
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
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
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

	@Override
	public String toString() {
		return "MAdministrativo [codigo=" + codigo + ", cargo=" + cargo + ", dependencia=" + dependencia
				+ ", direccion=" + direccion + ", emailinstitucional=" + emailinstitucional + ", emailpersonal="
				+ emailpersonal + ", fechanacimiento=" + fechanacimiento + ", foto=" + foto + ", genero=" + genero
				+ ", nombre=" + nombre + ", numdocumento=" + numdocumento + ", telefono=" + telefono
				+ ", tipodocumento=" + tipodocumento + "]";
	}
	
	

}
