package com.DevMiguelPinheiro.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevMiguelPinheiro.curso.entities.User;

// controladores REST


@RestController
@RequestMapping(value ="/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		
	User u = new User();
	return ResponseEntity.ok().body(u);
		
	}
	
	
}
