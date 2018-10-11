package com.servicios.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.servicios.core.entity.Horario;



@Repository("horarioestudianteRepositorio")
public interface HorarioRepository extends JpaRepository<Horario, Serializable>{
	
	public abstract Horario findByEstudiante (int estudiante);
	public abstract List<Horario> findByCodasignatura (int codasignatura);

}
