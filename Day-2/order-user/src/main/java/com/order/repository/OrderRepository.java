package com.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.order.model.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
