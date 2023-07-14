package com.DevMiguelPinheiro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevMiguelPinheiro.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
