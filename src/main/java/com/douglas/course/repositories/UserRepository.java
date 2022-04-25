package com.douglas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}