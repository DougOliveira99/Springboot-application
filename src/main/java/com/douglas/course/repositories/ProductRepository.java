package com.douglas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}