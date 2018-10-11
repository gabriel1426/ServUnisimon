package com.servicios.core.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicios.core.entity.Usuario;
import com.servicios.core.model.MUsuario;
import com.servicios.core.service.UsuarioService;

@RestController
@RequestMapping("/v1")
public class UsuarioController {
	
	 @Autowired
	 @Qualifier("servicio")
	 UsuarioService servicio;
	 
	 
	 @PutMapping("/usuario")
	 public boolean agregarUsuario(@RequestBody @Valid Usuario usuario){
		 return servicio.registrar(usuario);
	 }
	 
	 @PostMapping("/usuario")
	 public boolean actualizarUsuario(@RequestBody @Valid Usuario usuario){
		 
		 return servicio.actualizar(usuario);
		 
	 }
	 
	 @DeleteMapping("/usuario/{id}")
	 public boolean EliminarUsuario(@PathVariable("id") int codigo){
		 
		 return servicio.eliminar(codigo);
		 
	 }
	 
	 @GetMapping(value="/usuario",produces = "application/json")
		 public List<MUsuario> listarUsuarios(){
		 return servicio.listar();
	 
	 }
	 
	 @PostMapping("usuario/login")
	   public boolean login(@RequestBody @Valid MUsuario usuario,HttpServletRequest request,HttpServletResponse response) {
	        boolean res = servicio.login(usuario);
	        //if (!res.equalsIgnoreCase("-1")) {
	        	//res=JwtUtil.addAuthentication(response,res+"");
	       // }
	        return res;
	    }
	 
	 
	 


}