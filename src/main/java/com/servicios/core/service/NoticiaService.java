package com.servicios.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.servicios.core.converter.Convertidor;
import com.servicios.core.model.MNoticia;

import com.servicios.core.repository.NoticiaRepository;


@Service("nServicio")
public class NoticiaService {
	
	@Autowired
	 @Qualifier("nRepositorio")
	 private NoticiaRepository nRepo;
	 
	 @Autowired
	 @Qualifier("convertidor")
	 private Convertidor convertidor;
	 
	 public List<MNoticia> listarNoticias(){
		 
		 return  convertidor.convertirNoticia(nRepo.findAll());
	 }
	 
public List<MNoticia> listarNoticiasPaginas(){
		 
		 return  convertidor.convertirNoticia(nRepo.findAll());
	 }
	 
	

}
