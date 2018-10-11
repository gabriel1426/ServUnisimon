package com.servicios.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicios.core.model.MNoticia;
import com.servicios.core.service.NoticiaService;


@RestController
@RequestMapping("/v1")
public class NoticiaController {
	
	@Autowired
	 @Qualifier("nServicio")
	NoticiaService servicio;

	 @GetMapping(value="/noticia",produces = "application/json")
	 public List<MNoticia> listarNoticias(){
	 return servicio.listarNoticias();
 
 }
	
	 @GetMapping(value="/noticias",consumes ="application/json",produces = "application/json")
	 public List<MNoticia> listarNoticiasP(){
		 System.out.println("-----------------"+servicio.listarNoticiasPaginas().toString());
	 return servicio.listarNoticiasPaginas();
	  }
	
}
