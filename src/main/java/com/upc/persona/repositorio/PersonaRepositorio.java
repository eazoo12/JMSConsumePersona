package com.upc.persona.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.upc.persona.entidades.Persona;

public interface PersonaRepositorio extends CrudRepository<Persona, Long>{

}
