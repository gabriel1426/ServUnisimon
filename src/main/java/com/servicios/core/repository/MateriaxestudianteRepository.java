package com.servicios.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.servicios.core.entity.Materiaxestudiante;

@Repository("materiaxestudianteRepositorio")
public interface MateriaxestudianteRepository  extends JpaRepository<Materiaxestudiante, Serializable>{
	
	public abstract List<Materiaxestudiante> findByIdmateria (int idmateria);

}
