package com.servicios.core.model;



import com.servicios.core.entity.Horario;

public class MHorario {
	
	
	private int id;
	private String asignatura;
	private int codasignatura;
	private String dia;
	private String docente;
	private String fin;
	private String grupo;
	private String inicio;
	private int programa;
	private String salon;
	private int semestre;
	
	
	public MHorario() {
		
	}

	public MHorario(Horario horario) {
		
		
		this.id = horario.getId();
		this.asignatura = horario.getAsignatura();
		this.codasignatura = horario.getCodasignatura();
		this.dia = horario.getDia();
		this.docente = horario.getDocente();
		this.fin = horario.getFin();
		this.grupo = horario.getGrupo();
		this.inicio = horario.getInicio();
		this.programa = horario.getPrograma();
		this.salon = horario.getSalon();
		this.semestre = horario.getSemestre();
		
		
	}


	public MHorario(int id, String asignatura, int codasignatura, String dia, String docente, String fin, String grupo,
			String inicio, int programa, String salon, int semestre) {
		
		this.id = id;
		this.asignatura = asignatura;
		this.codasignatura = codasignatura;
		this.dia = dia;
		this.docente = docente;
		this.fin = fin;
		this.grupo = grupo;
		this.inicio = inicio;
		this.programa = programa;
		this.salon = salon;
		this.semestre = semestre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getCodasignatura() {
		return codasignatura;
	}

	public void setCodasignatura(int codasignatura) {
		this.codasignatura = codasignatura;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public int getPrograma() {
		return programa;
	}

	public void setPrograma(int programa) {
		this.programa = programa;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
	
	

}
