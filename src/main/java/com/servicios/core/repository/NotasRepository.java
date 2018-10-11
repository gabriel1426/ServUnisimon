package com.servicios.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.servicios.core.entity.Nota;



@Repository("notaRepositorio")
public interface NotasRepository extends JpaRepository<Nota, Serializable>{
	
	
	public abstract List<Nota> findByEstudiante(String idEstudiante);

}
