package com.DevMiguelPinheiro.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DevMiguelPinheiro.curso.entities.Product;
import com.DevMiguelPinheiro.curso.repositories.ProductRepository;

@Component
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> object = repository.findById(id);
		return object.get();
	}
}
