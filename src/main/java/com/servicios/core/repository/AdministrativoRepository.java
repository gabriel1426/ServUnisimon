package com.servicios.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicios.core.entity.Administrativo;




@Repository("administradorRepositorio")
public interface AdministrativoRepository extends JpaRepository<Administrativo, Serializable>{
	
	public abstract Administrativo findByCodigo (int codigo);

}
