package com.douglas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}