package com.course.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.learning.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
