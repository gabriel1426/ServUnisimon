package com.servicios.core.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicios.core.entity.Horario;
import com.servicios.core.entity.Materia;

@Repository("materiaRepositorio")
public interface MateriaRepositorio  extends JpaRepository<Materia, Serializable> {

	public abstract Materia findByIdmateria (int idmateria);
}
