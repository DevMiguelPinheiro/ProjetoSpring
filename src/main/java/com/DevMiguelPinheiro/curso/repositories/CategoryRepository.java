package com.DevMiguelPinheiro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevMiguelPinheiro.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
