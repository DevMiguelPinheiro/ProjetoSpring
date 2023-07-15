package com.DevMiguelPinheiro.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DevMiguelPinheiro.curso.entities.User;
import com.DevMiguelPinheiro.curso.repositories.UserRepository;



@Component
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> object = repository.findById(id);
		return object.get();
	}
}
