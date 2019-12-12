package com.course.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.learning.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
