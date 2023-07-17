package com.DevMiguelPinheiro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevMiguelPinheiro.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
