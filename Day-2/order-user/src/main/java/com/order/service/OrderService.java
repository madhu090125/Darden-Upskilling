package com.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.order.model.Order;

@Service
public interface OrderService {

	List<Order> viewAllOrders();

	Order viewSpecificOrder(String orderId);

	Order placeNewOrder(Order order);

	String deleteSpecificOrder(String orderId);

	Order updateOrder(Order order);

}
