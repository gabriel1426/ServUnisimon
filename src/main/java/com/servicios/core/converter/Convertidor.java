package com.servicios.core.converter;

import static org.assertj.core.api.Assertions.useDefaultDateFormatsOnly;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.servicios.core.entity.Administrativo;
import com.servicios.core.entity.Docente;
import com.servicios.core.entity.Estudiante;
import com.servicios.core.entity.Horario;
import com.servicios.core.entity.Horariodocente;
import com.servicios.core.entity.Materiaxestudiante;
import com.servicios.core.entity.Nota;
import com.servicios.core.entity.Noticia;
import com.servicios.core.entity.Usuario;
import com.servicios.core.model.MAdministrativo;
import com.servicios.core.model.MDocente;
import com.servicios.core.model.MEstudiante;
import com.servicios.core.model.MHorario;
import com.servicios.core.model.MHorariodocente;
import com.servicios.core.model.MMateriaxestudiante;
import com.servicios.core.model.MNota;
import com.servicios.core.model.MNoticia;
import com.servicios.core.model.MUsuario;

@Component("convertidor")
public class Convertidor {

	
	public List<MUsuario> convertirLista (List<Usuario> usuario){
		
		
		List<MUsuario> user=new ArrayList<>();
		
		for	(Usuario us : usuario){
			System.out.println(us.getNombre());
			user.add(new MUsuario(us));
		}
		
		return user;
		
	}
	
	public List<MNoticia> convertirNoticia (List<Noticia> noticia){
			
			
			List<MNoticia> not=new ArrayList<>();
			
			for	(Noticia nt : noticia){
				
				not.add(new MNoticia(nt));
				
			}
			
			return not;
			
		}
	
	public MEstudiante convertirEstudiante (Estudiante estudiante){
		
		return new MEstudiante(estudiante);
		
	}
	
	public List<MEstudiante> convertirEstudiantes(List<Estudiante> estudiante){
			
			
			List<MEstudiante> not=new ArrayList<>();
			
			for	(Estudiante nt : estudiante){
				
				not.add(new MEstudiante(nt));
				
			}
			
			return not;
			
		}
	

	
	public MAdministrativo convertirAdministrativo (Administrativo administrativo){
	
			
		return new MAdministrativo(administrativo);
			
	}
	public List<MAdministrativo> convertirAdministrativos(List<Administrativo> admin){
			

		List<MAdministrativo> not=new ArrayList<>();
		
		for	(Administrativo nt : admin){
			
			not.add(new MAdministrativo(nt));
			System.out.println(nt.toString());
			
		}
		
		return not;
			
		}
	
	public List<MDocente> convertirDocentes (List<Docente> docente){
			
			
			List<MDocente> not=new ArrayList<>();
			
			for	(Docente nt : docente){
				
				not.add(new MDocente(nt));
				
			}
			
			return not;
			
		}
	public MDocente convertirDocente (Docente docente){
		
		return new MDocente(docente);
		
	}
	
	public List<MHorario> convertirHorario (List<Horario> horario){
		
		
		List<MHorario> not=new ArrayList<>();
		
		for	(Horario nt : horario){
			
			not.add(new MHorario(nt));
			
		}
		
		return not;
		
	}
	
	public List<MHorariodocente> convertirHorariodocente (List<Horariodocente> horario){
			
			
			List<MHorariodocente> not=new ArrayList<>();
			
			for	(Horariodocente nt : horario){
				
				not.add(new MHorariodocente(nt));
				
			}
			
			return not;
			
		}

	public List<MNota> convertirNota (List<Nota> nota){
			
			
			List<MNota> not=new ArrayList<>();
			
			for	(Nota nt : nota){
				
				not.add(new MNota(nt));
				
			}
			
			return not;
			
		}
	
	
	
	public List<MMateriaxestudiante> convertirMateriaxEstudiante (List<Materiaxestudiante> materia){
	

		List<MMateriaxestudiante> not=new ArrayList<>();
		
		for	(Materiaxestudiante nt : materia){
			
			not.add(new MMateriaxestudiante(nt));
			
		}
		
		return not;
		
	}
	
	
}
