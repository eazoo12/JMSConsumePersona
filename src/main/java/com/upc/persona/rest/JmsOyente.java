package com.upc.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.upc.persona.entidades.Persona;
import com.upc.persona.negocio.Negocio;


@Component
public class JmsOyente {
	
	@Autowired
	private Negocio negocio;
	
	
	@JmsListener(destination="${jms.queue.destination}")
	public void miMensaje(String mensajeJson) 
	{
		System.out.println("Recibido:" + mensajeJson);
		
		//mensaje
		ObjectMapper mapper = new ObjectMapper();
		
		try 
		{
			Persona persona = mapper.readValue(mensajeJson, Persona.class);
			persona.setRespuesta("Registrar a Tabla");
			System.out.println(mensajeJson);
			Persona respuesta = negocio.grabar(persona);
			
			if(respuesta == null) 
			{
				System.out.println("No se pudo registar");
				
			}
			else
			{
				System.out.println("Registrado OK!");
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("No se pudo registrar");
			
		
		}
		
		
	}
	
	

}
