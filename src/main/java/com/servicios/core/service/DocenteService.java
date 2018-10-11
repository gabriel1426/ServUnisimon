package com.servicios.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.servicios.core.converter.Convertidor;
import com.servicios.core.entity.Docente;
import com.servicios.core.entity.Estudiante;
import com.servicios.core.model.MDocente;
import com.servicios.core.model.MEstudiante;
import com.servicios.core.model.MHorario;
import com.servicios.core.model.MHorariodocente;
import com.servicios.core.repository.DocenteRepository;


@Service("docenteServicio")
public class DocenteService {

	

	 @Autowired
	 @Qualifier("docenteRepositorio")
	 private DocenteRepository dRepo;
	 
	 @Autowired
	 @Qualifier("convertidor")
	 private Convertidor convertidor;
	
	public MDocente listar(int codigo){
		 
		 return  convertidor.convertirDocente(dRepo.findById(codigo).get());
		 
	 }
	public boolean actualizarDatos(MDocente e){
		
		try{
			Docente user=dRepo.findById(e.getCodigo()).get();
        	user.setEmailpersonal(e.getEmailpersonal());
        	user.setDireccion(e.getDireccion());
        	user.setTelefono(e.getTelefono());
        	user.setClave(e.getClave());
        	dRepo.save(user);
            return true;
        }catch(Exception x){
        	x.printStackTrace();
            return false;
        }
		
	}
	public List<MDocente> listarAdmin(){
		 
		 return  convertidor.convertirDocentes(dRepo.findAll());
		 
	 }
	public List<MHorariodocente> listarhorario(int codigo){
		 
		 return  convertidor.convertirHorariodocente(dRepo.findById(codigo).get().getHorariodocentes());
		 
	 }
}
