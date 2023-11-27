package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.Employee;
import com.microservice.client.EmployeeFeign;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	EmployeeFeign employeefeign;

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee employeeById = employeefeign.getEmployeeById(id);
		return employeeById;
	}

	
}
