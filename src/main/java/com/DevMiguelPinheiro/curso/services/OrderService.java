package com.DevMiguelPinheiro.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.DevMiguelPinheiro.curso.entities.Order;
import com.DevMiguelPinheiro.curso.repositories.OrderRepository;

@Component
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> object = repository.findById(id);
		return object.get();
	}
}
