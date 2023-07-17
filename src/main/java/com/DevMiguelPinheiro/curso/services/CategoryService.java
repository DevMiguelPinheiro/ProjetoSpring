package com.DevMiguelPinheiro.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DevMiguelPinheiro.curso.entities.Category;
import com.DevMiguelPinheiro.curso.repositories.CategoryRepository;

@Component
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> object = repository.findById(id);
		return object.get();
	}
}
