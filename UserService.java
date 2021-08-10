package com.vladycode.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vladycode.model.Usuario;
import com.vladycode.repo.IUsuarioRepo;

import java.util.ArrayList;
import java.util.List;



@Service
public class UserService implements UserDetailsService {
//Inyecto la capa de repositorio 	
	@Autowired
	private IUsuarioRepo repo;
	//El objeto llamado userDetail esta esperando un nombre de usuario, su clave y role
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario us = repo.findByNombre(username);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(us.getNombre(), us.getClave(), roles);
		
		return userDet;//userDet retorna la informacion del 
		               //usuario que quiere iniciar sesion 
	}

}
