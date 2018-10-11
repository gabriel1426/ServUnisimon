package com.servicios.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.servicios.core.converter.Convertidor;
import com.servicios.core.entity.Administrativo;
import com.servicios.core.entity.Docente;
import com.servicios.core.model.MAdministrativo;
import com.servicios.core.model.MDocente;
import com.servicios.core.repository.AdministrativoRepository;




@Service("administradorServicio")
public class AdministradorService {
	
	 @Autowired
	 @Qualifier("administradorRepositorio")
	 private AdministrativoRepository aRepo;
	 
	 @Autowired
	 @Qualifier("convertidor")
	 private Convertidor convertidor;
	
	public MAdministrativo listar(int codigo){
		 
		 return  convertidor.convertirAdministrativo(aRepo.findById(codigo).get());
		 
	 }
	public List<MAdministrativo> listarAdmin(){
		 
		 return  convertidor.convertirAdministrativos(aRepo.findAll());
		 
	 }
	public boolean actualizarDatos(MAdministrativo e){
		
		try{
			Administrativo user=aRepo.findById(e.getCodigo()).get();
        	user.setEmailpersonal(e.getEmailpersonal());
        	user.setDireccion(e.getDireccion());
        	user.setTelefono(e.getTelefono());
        	user.setClave(e.getClave());
        	aRepo.save(user);
            return true;
        }catch(Exception x){
        	x.printStackTrace();
            return false;
        }
		
	}

}
