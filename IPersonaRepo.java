package com.vladycode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vladycode.model.Persona;

//IPersonaRepo va a heredar una clase llamada JpaRepository que 
//va a trabajar con la entidad persona(Persona) y su tipo de 
//llave 1ria Integer
public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
