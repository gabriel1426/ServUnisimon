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
import com.servicios.core.model.MMateriaxestudiante;
import com.servicios.core.model.MNota;
import com.servicios.core.model.MUsuario;
import com.servicios.core.model.Respuesta;
import com.servicios.core.service.DocenteService;
import com.servicios.core.service.EstudianteService;




@EnableAutoConfiguration
@RestController
@RequestMapping(value="/v2",consumes ="application/json", produces = "application/json")
public class EstudianteController {
	
	
	@Autowired
	@Qualifier("estudianteServicio")
	EstudianteService servicio;
	

	 @GetMapping("/estudiante/horario/{id}")
	 public List<MHorario> buscarHorario(@PathVariable("id") int codigo){
	 return  servicio.listarHorario(codigo);
	 }
	 
	 @GetMapping("/estudiante/notas/{id}")
	 public List<MNota> buscarNotas(@PathVariable("id") int codigo){
	 return  servicio.listarNotas(codigo);
	 }
	 
	 @GetMapping(value="/estudiante")
	 public @ResponseBody List<MEstudiante> listarEstudiante(){
	 return servicio.listarAdmin();
	 }
	 
	 

	 @PostMapping("/login")
	  public Respuesta login2(@RequestBody @Valid MUsuario usuario,HttpServletRequest request,HttpServletResponse response) {
	     
		 Respuesta res1 = new Respuesta();
		 String res = servicio.login(usuario)+"";
	        if (!res.equalsIgnoreCase("-1")) {
	        	response.addHeader("Authorization", JwtUtil.addAuthentication(response,res+""));
	        	res1.setRespuesta(true);
	        	res1.setToken(JwtUtil.addAuthentication(response,res+""));
	        	
	        }
	        
	        return res1;
	        
	      
	  }
	 
	 @GetMapping("/perfil")
	    public MEstudiante consultarUsuarioPropio(HttpServletRequest request) {
		 
		 String token = request.getHeader("Authorization");
		 System.out.println(token);
	    	try { 
	    		
	    		System.out.println(Integer.parseInt(JwtUtil.getAuthentication(request))+"ësto es lo que esta mal");
	            return servicio.consultarUsuario(Integer.parseInt(JwtUtil.getAuthentication(request)));
	    	}catch(Exception e) {
	    		System.out.println("esta no sirvio");
	    		return null;
	    	}
	    }
	 
	 @PostMapping("/actualizarperfil")
	  public boolean actualizarPerfil(@RequestBody @Valid MEstudiante usuario,HttpServletRequest request,HttpServletResponse response) {
	     
		 
		 boolean res = servicio.actualizarDatos(usuario);
	        if (res) {
	        	response.addHeader("Authorization", JwtUtil.addAuthentication(response,res+""));
	        	return true;
	        	
	        }else {
	        	 return false ;
	        }
	           
	  }
	 @GetMapping("/notas")
	    public 	List<MNota> consultarNotas(HttpServletRequest request) {
		 
		 String token = request.getHeader("Authorization");
		 System.out.println(token);
	    	try { 
	    		
	    		System.out.println(Integer.parseInt(JwtUtil.getAuthentication(request)));
	            return servicio.listarNotas(Integer.parseInt(JwtUtil.getAuthentication(request)));
	    	}catch(Exception e) {
	    		System.out.println("esta no sirvio");
	    		return null;
	    	}
	    }
	 
	 @GetMapping("/horario")
	    public 	List<MHorario> consultarHorario(HttpServletRequest request) {
		 
		 String token = request.getHeader("Authorization");
		 System.out.println(token);
	    	try { 
	    		
	    		System.out.println(Integer.parseInt(JwtUtil.getAuthentication(request)));
	            return servicio.listarHorario(Integer.parseInt(JwtUtil.getAuthentication(request)));
	    	}catch(Exception e) {
	    		System.out.println("esta no sirvio");
	    		return null;
	    	}
	    }
	 

	 @GetMapping("/lista/{id}")
	    public 	List<MMateriaxestudiante> ListarEstudiantesMateria(@PathVariable("id") int idMateria) {
		 
		
	    	try { 
	    		 return servicio.listarEstudiantesMateria(idMateria);
	    		 
	    	}catch(Exception e) {
	    		System.out.println("esta no sirvio");
	    		return null;
	    	}
	    }
	 
	 
	 
	 
	 
}
