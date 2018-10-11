package com.servicios.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicios.core.entity.Administrativo;
import com.servicios.core.entity.Asistencia;

@Repository("AsistenciaRepositorio")
public interface AsistenciaRepository  extends JpaRepository<Asistencia, Serializable>{
	
	public abstract Asistencia findById (int id);


}
