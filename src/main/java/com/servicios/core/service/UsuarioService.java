package com.servicios.core.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.servicios.core.repository.UserRepository;
import com.servicios.core.converter.*;
import com.servicios.core.entity.Usuario;
import com.servicios.core.model.MUsuario;

@Service("servicio")
public class UsuarioService {
	
	 @Autowired
	 @Qualifier("repositorio")
	 private UserRepository uRepo;
	 
	 @Autowired
	 @Qualifier("convertidor")
	 private Convertidor convertidor;
	 
	 public boolean registrar(Usuario u){
		 
		 try {
			 
			 uRepo.save(u);
			return true;
		} catch (Exception e) {
			return false;
		}
		 
	 }
	 
	 public boolean actualizar(Usuario u){
		 
		 try {
			 uRepo.save(u);
			return true;
		} catch (Exception e) {
			return false;
		}
		 
	 }

	 public boolean eliminar(int codigo){
	 
	 try {
		 
		 Usuario u = uRepo.findByCodigo(codigo);
		 uRepo.delete(u);
		 
		return true;
	} catch (Exception e) {
		return false;
	}
	 
	 }

	 public List<MUsuario> listar(){
		 
		 return  convertidor.convertirLista(uRepo.findAll());
		 
	 }
	 
	 public boolean login(MUsuario usuario){
	       try{
	           Usuario user=uRepo.findByCodigo(usuario.getCodigo());
	           
	           
	           if(user.getClave().equals(usuario.getClave())){
	               return true;
	           }else{
	               return false;
	           }
	       }catch(Exception e){
	           return false;
	       }
	    }

	
	 
	 
	 

}
