package com.upc.persona.negocio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.upc.persona.entidades.Persona;
import com.upc.persona.repositorio.PersonaRepositorio;

@Service
public class Negocio {

	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	@Transactional
	public Persona grabar(Persona persona) 
	{
		if(!personaRepositorio.existsById(persona.getCodigo())) 
		{
			return personaRepositorio.save(persona);
			
			
		}else 
		{
			return null;
			
			
		}
		
		
		
	}
	
	
}
