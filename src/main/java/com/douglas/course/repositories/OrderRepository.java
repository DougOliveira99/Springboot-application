package com.douglas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}