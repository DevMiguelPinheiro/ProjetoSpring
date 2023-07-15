package com.DevMiguelPinheiro.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevMiguelPinheiro.curso.entities.User;
import com.DevMiguelPinheiro.curso.services.UserService;


@RestController
@RequestMapping(value ="/users")
public class UserResources {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
	List<User> list = service.findAll();
	
	return ResponseEntity.ok().body(list);
		
	}
	
	
}
