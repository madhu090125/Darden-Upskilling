package com.microservice.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.Department;
import com.microservice.service.DepartmentService;
import com.netflix.discovery.converters.Auto;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentservice;
	
	@GetMapping("/depts")
	public List<Department> showAllDepartment(){
		return departmentservice.showAllDepartment();	
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable int id) {
		return departmentservice.getDepartmentById(id);
	}

}
