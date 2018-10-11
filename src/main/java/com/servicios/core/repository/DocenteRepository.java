package com.servicios.core.repository;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicios.core.entity.Docente;


@Repository("docenteRepositorio")
public interface DocenteRepository extends JpaRepository<Docente, Serializable>{

	public abstract Docente findByCodigo (int codigo);
	
}
