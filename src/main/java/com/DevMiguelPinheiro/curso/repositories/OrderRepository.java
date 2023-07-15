package com.DevMiguelPinheiro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevMiguelPinheiro.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
