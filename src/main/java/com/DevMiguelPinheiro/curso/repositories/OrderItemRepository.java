package com.DevMiguelPinheiro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevMiguelPinheiro.curso.entities.OrderItem;
import com.DevMiguelPinheiro.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
