package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Order;
import com.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/viewAll")
	public List<Order> viewAllOrders(){
		return orderService.viewAllOrders();
	}
	
	@GetMapping("/viewSpecificOrder/{orderId}")
	public Order viewSpecificOrder(@PathVariable String orderId) {
		return orderService.viewSpecificOrder(orderId);
	}
	
	@PostMapping("/placeNewOrder")
	public Order placeNewOrder(@RequestBody Order order) {
		return orderService.placeNewOrder(order);
	}
	
	@DeleteMapping("/deleteSpecificOrder/{orderId}")
	public String deleteSpecificOrder(@PathVariable String orderId) {
		return orderService.deleteSpecificOrder(orderId);
	}
	
	@PutMapping("/updateOrder/{orderId}")
	public Order updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}

}
