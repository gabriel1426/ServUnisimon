package com.servicios.core.model;



import com.servicios.core.entity.Usuario;

public class MUsuario {
	
	
	private int codigo;
	private String carrera;
	private int cedula;
	private String clave;
	private String correo;
	private String nombre;
	private String tipo;
	
	
	public MUsuario(){
		
	}
	
	public MUsuario(Usuario user){
		
		this.codigo = user.getCodigo();
		this.carrera = user.getCarrera();
		this.cedula = user.getCedula();
		this.clave = user.getClave();
		this.correo = user.getCorreo();
		this.nombre = user.getNombre();
	
	}
	
	
	public MUsuario(int codigo, String carrera, int cedula, String clave, String correo, String nombre, String tipo) {
		super();
		this.codigo = codigo;
		this.carrera = carrera;
		this.cedula = cedula;
		this.clave = clave;
		this.correo = correo;
		this.nombre = nombre;
		this.tipo=tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	

}
