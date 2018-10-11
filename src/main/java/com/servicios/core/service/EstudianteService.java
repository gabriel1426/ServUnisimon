package com.servicios.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.servicios.core.converter.Convertidor;
import com.servicios.core.entity.Administrativo;
import com.servicios.core.entity.Docente;
import com.servicios.core.entity.Estudiante;
import com.servicios.core.model.MDocente;
import com.servicios.core.model.MEstudiante;
import com.servicios.core.model.MHorario;
import com.servicios.core.model.MMateriaxestudiante;
import com.servicios.core.model.MNota;
import com.servicios.core.model.MUsuario;
import com.servicios.core.repository.AdministrativoRepository;
import com.servicios.core.repository.DocenteRepository;
import com.servicios.core.repository.EstudianteRepository;
import com.servicios.core.repository.MateriaxestudianteRepository;


@Service("estudianteServicio")
public class EstudianteService {
	
	 @Autowired
	 @Qualifier("estudianteRepositorio")
	 private EstudianteRepository eRepo;
	 
	 @Autowired
	 @Qualifier("docenteRepositorio")
	 private DocenteRepository dRepo;
	 
	 @Autowired
	 @Qualifier("administradorRepositorio")
	 private AdministrativoRepository aRepo;
	 
	
	 
	 @Autowired
	 @Qualifier("materiaxestudianteRepositorio")
	 private MateriaxestudianteRepository mRepo;
	 
	 
	 @Autowired
	 @Qualifier("convertidor")
	 private Convertidor convertidor;
	
	public MEstudiante consultarUsuario(int codigo){
		 
		 return  convertidor.convertirEstudiante(eRepo.findById(codigo).get());
		 
	 }
	
	public boolean actualizarDatos(MEstudiante e){
		
		try{
			Estudiante user=eRepo.findById(e.getCodigo()).get();
        	System.out.println(user.getCodigo());
        	user.setEmailpersonal(e.getEmailpersonal());
        	user.setDireccion(e.getDireccion());
        	user.setTelefono(e.getTelefono());
        	user.setClave(e.getClave());
        	eRepo.save(user);
            return true;
        }catch(Exception x){
        	x.printStackTrace();
            return false;
        }
		
	}
	public List<MEstudiante> listarAdmin(){
		 
		 return  convertidor.convertirEstudiantes(eRepo.findAll());
		 
	 }
	
	public List<MHorario> listarHorario(int codigo){
		 
		 return  convertidor.convertirHorario(eRepo.findById(codigo).get().getHorarios());
		 
	 }
	
	public List<MNota> listarNotas(int codigo){
		 
		 return  convertidor.convertirNota(eRepo.findById(codigo).get().getNotas());
		 
	 }
	
	public int login(MUsuario usuario){
	       try{
	    	   
	    	   if (usuario.getTipo().equalsIgnoreCase("estudiante")){
	    		  
	    		   Estudiante user=eRepo.findByCodigo(usuario.getCodigo());
		    	   
		           
		           if(user.getClave().equals(usuario.getClave())){
		        	   System.out.println("------------estudiante"+user.getCodigo()+"------------------");
		               return user.getCodigo();
		           }else{
		               return -1;
		           }
	    		   
	    	   }else if (usuario.getTipo().equalsIgnoreCase("docente")){
	    		  
	    		   Docente user=dRepo.findByCodigo(usuario.getCodigo());
		    	   System.out.println("------------"+usuario.getCodigo());
		           
		           if(user.getClave().equals(usuario.getClave())){
		        	   System.out.println("------------Docente"+user.getCodigo()+"------------------");
		               return user.getCodigo();
		           }else{
		               return -1;
		           }
	    		   
	    	   }else {
	    		   
	    		   Administrativo user= aRepo.findByCodigo(usuario.getCodigo());
		    	   System.out.println("------------"+usuario.getCodigo());
		           
		           if(user.getClave().equals(usuario.getClave())){
		        	   System.out.println("------------Administrativo"+user.getCodigo()+"------------------");
		               return user.getCodigo();
		           }else{
		               return -1;
		           }
	    	   }
	    	   
	    	   
	       }catch(Exception e){
	           return -1;
	       }
	    }
	
	public List<MMateriaxestudiante> listarEstudiantesMateria(int materia){
		
		return convertidor.convertirMateriaxEstudiante(mRepo.findByIdmateria(materia)) ;
		
		
		
	}
	
	

}
