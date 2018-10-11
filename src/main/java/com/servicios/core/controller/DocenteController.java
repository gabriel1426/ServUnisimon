package com.servicios.core.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

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
import com.servicios.core.model.MDocente;
import com.servicios.core.model.MEstudiante;
import com.servicios.core.model.MHorario;
import com.servicios.core.model.MHorariodocente;
import com.servicios.core.model.MMateriaxestudiante;
import com.servicios.core.service.DocenteService;
import com.servicios.core.service.EstudianteService;



@EnableAutoConfiguration
@RestController
@RequestMapping(value="/v3",consumes ="application/json", produces = "application/json")
public class DocenteController {

	@Autowired
	@Qualifier("docenteServicio")
	DocenteService servicio;
	
	
	

	 @GetMapping("/docente/{id}")
	 public MDocente buscarDocente(@PathVariable("id") int codigo){
	 return servicio.listar(codigo);
	 }
	 
	 @GetMapping("/docente/horario/{id}")
	 public List<MHorariodocente> buscarHorario(@PathVariable("id") int codigo){
	 return  servicio.listarhorario(codigo);
	 }
	 
	 @GetMapping(value="/docente")
	 public @ResponseBody List<MDocente> listarDocente(){
	 return servicio.listarAdmin();
	 }
	 
	 @GetMapping("/perfil")
	    public MDocente consultarUsuarioPropio(HttpServletRequest request) {
	    	try { 
	            return servicio.listar(Integer.parseInt(JwtUtil.getAuthentication(request)));
	    	}catch(Exception e) {
	    		return null;
	    	}
	    }
	 @GetMapping("/horario")
	    public 	List<MHorariodocente> consultarHorario(HttpServletRequest request) {
		 
		 String token = request.getHeader("Authorization");
		 System.out.println(token);
	    	try { 
	    		
	    		System.out.println(Integer.parseInt(JwtUtil.getAuthentication(request)));
	            return servicio.listarhorario(Integer.parseInt(JwtUtil.getAuthentication(request)));
	    	}catch(Exception e) {
	    		System.out.println("esta no sirvio");
	    		return null;
	    	}
	    }
	 @PostMapping("/actualizarperfil")
	  public boolean actualizarPerfil(@RequestBody @Valid MDocente usuario,HttpServletRequest request,HttpServletResponse response) {
	     
		 
		 boolean res = servicio.actualizarDatos(usuario);
	        if (res) {
	        	response.addHeader("Authorization", JwtUtil.addAuthentication(response,res+""));
	        	return true;
	        	
	        }else {
	        	 return false ;
	        }
	           
	  }
	 
	 
}
