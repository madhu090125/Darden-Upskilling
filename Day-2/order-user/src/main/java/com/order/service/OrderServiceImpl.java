package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.model.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> viewAllOrders() {
		return orderRepository.findAll();	
	}

	@Override
	public Order viewSpecificOrder(String orderId) {
		if(orderRepository.existsById(orderId)) {
		return orderRepository.findById(orderId).get();
		}
		else {
			return null;
		}
	}

	@Override
	public Order placeNewOrder(Order order) {
		if(!orderRepository.existsById(order.getOrderId())) {
			return orderRepository.insert(order);
		}
		else {
		return null;
		}
	}

	@Override
	public String deleteSpecificOrder(String orderId) {
		if(orderRepository.existsById(orderId)) {
			orderRepository.deleteById(orderId);
			return "Order Deleted Successfull";
		}
		else {
		return "Order id does not exist";
		}
	}

	@Override
	public Order updateOrder(Order order) {
		if(orderRepository.existsById(order.getOrderId())) {
			return orderRepository.save(order);    
		}
		else {
		return null;
		}
	}

}
