package com.servicios.core.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the estudiante database table.
 * 
 */
@Entity
@NamedQuery(name="Estudiante.findAll", query="SELECT e FROM Estudiante e")
public class Estudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private String carrera;

	private String clave;

	private String direccion;

	private String emailinstitucional;

	private String emailpersonal;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String foto;

	private String genero;

	private String nivelcarrera;

	private String nombre;

	private int numdocumento;

	private float promedio;

	private int semestre;

	private int telefono;

	private String tipodocumento;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="estudiante")
	private List<Asistencia> asistencias;

	//bi-directional many-to-one association to Horario
	@OneToMany(mappedBy="estudiante")
	private List<Horario> horarios;


	//bi-directional many-to-one association to Nota
	@OneToMany(mappedBy="estudiante")
	private List<Nota> notas;

	public Estudiante() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
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

	public String getNivelcarrera() {
		return this.nivelcarrera;
	}

	public void setNivelcarrera(String nivelcarrera) {
		this.nivelcarrera = nivelcarrera;
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

	public float getPromedio() {
		return this.promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public int getSemestre() {
		return this.semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
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

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setEstudiante(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setEstudiante(null);

		return asistencia;
	}

	public List<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Horario addHorario(Horario horario) {
		getHorarios().add(horario);
		horario.setEstudiante(this);

		return horario;
	}

	public Horario removeHorario(Horario horario) {
		getHorarios().remove(horario);
		horario.setEstudiante(null);

		return horario;
	}

	
	public List<Nota> getNotas() {
		return this.notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public Nota addNota(Nota nota) {
		getNotas().add(nota);
		nota.setEstudiante(this);

		return nota;
	}

	public Nota removeNota(Nota nota) {
		getNotas().remove(nota);
		nota.setEstudiante(null);

		return nota;
	}

}