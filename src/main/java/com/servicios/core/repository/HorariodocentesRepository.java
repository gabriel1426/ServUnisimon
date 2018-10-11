package com.servicios.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.servicios.core.entity.Horariodocente;
;

@Repository("horariodocentesRepositorio")
public interface HorariodocentesRepository extends JpaRepository<Horariodocente, Serializable> {
	
	public abstract Horariodocente findByDocente (int docente);

}
