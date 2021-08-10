package com.vladycode.repo;


import org.springframework.data.jpa.repository.JpaRepository;
 
import com.vladycode.model.Usuario;

//IUsuarioRepo va a heredar una clase llamada JpaRepository que 
//va a trabajar con la entidad usuario y su tipo de 
//llave 1ria Integer
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	Usuario findByNombre(String nombre);

}