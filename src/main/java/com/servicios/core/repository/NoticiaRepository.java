package com.servicios.core.repository;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.servicios.core.entity.Noticia;


@Repository("nRepositorio")
public interface NoticiaRepository extends JpaRepository<Noticia, Serializable>, PagingAndSortingRepository<Noticia, Serializable>{
	
	public abstract Noticia findById (int id);
	public abstract List<Noticia> findByFecha (Date fecha);
	
	public abstract Page<Noticia> findAll(Pageable pageable);
	

}
