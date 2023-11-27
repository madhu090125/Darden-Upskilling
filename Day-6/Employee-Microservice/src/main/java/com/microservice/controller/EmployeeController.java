package com.microservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.bean.Employee;
import com.microservice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/emps")
	public List<Employee> getAllEmployee(){
		return employeeservice.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeservice.getEmployeeById(id);
	}

}
