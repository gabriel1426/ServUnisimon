package com.servicios.core.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.servicios.core.configuracion.JwtUtil;
import com.servicios.core.model.MAdministrativo;
import com.servicios.core.model.MDocente;
import com.servicios.core.model.MEstudiante;
import com.servicios.core.model.MUsuario;
import com.servicios.core.service.AdministradorService;

@EnableAutoConfiguration
@RestController
@RequestMapping(value="/v4",consumes ="application/json", produces = "application/json")
public class AdministrativoController {
	
	@Autowired
	@Qualifier("administradorServicio")
	AdministradorService servicio;
	

	 @GetMapping("/administrador/{id}")
	 public MAdministrativo buscarAdministrador(@PathVariable("id") int codigo){
	 return servicio.listar(codigo);
	 }

	 
	 @GetMapping(value="/admin")
	 public @ResponseBody List<MAdministrativo> listarAdmin(){
	 return servicio.listarAdmin();
	 }
	 
	 @GetMapping("/perfil")
	    public MAdministrativo consultarUsuarioPropio(HttpServletRequest request) {
	    	try { 
	            return servicio.listar(Integer.parseInt(JwtUtil.getAuthentication(request)));
	    	}catch(Exception e) {
	    		return null;
	    	}
	    }
	 @PostMapping("/actualizarperfil")
	  public boolean actualizarPerfil(@RequestBody @Valid MAdministrativo usuario,HttpServletRequest request,HttpServletResponse response) {
	     
		 
		 boolean res = servicio.actualizarDatos(usuario);
	        if (res) {
	        	response.addHeader("Authorization", JwtUtil.addAuthentication(response,res+""));
	        	return true;
	        	
	        }else {
	        	 return false ;
	        }
	           
	  }

}
