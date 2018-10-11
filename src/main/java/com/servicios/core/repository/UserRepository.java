package com.servicios.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servicios.core.entity.Usuario;


@Repository("repositorio")
public interface UserRepository extends JpaRepository<Usuario, Serializable>{
	
	public abstract Usuario findByCedula (int codigo);
	
	public abstract List<Usuario> findByNombre (String nombre);
	
	public abstract Usuario findByCodigoAndClave (int cedula, String nombre);
	
	public abstract Usuario  findByCodigo(int correo);

}
