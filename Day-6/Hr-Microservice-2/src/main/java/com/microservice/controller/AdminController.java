package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.Department;
import com.microservice.bean.Employee;
import com.microservice.bean.Location;
import com.microservice.client.DepartmentFeign;
import com.microservice.client.EmployeeFeign;
import com.microservice.client.LocationFeign;

@RestController
@RequestMapping("/sts")
public class AdminController {
	
	@Autowired
	DepartmentFeign departmentfeign;
	
	@Autowired
	EmployeeFeign employeefeign;
	
	@Autowired
	LocationFeign locationfeign;
	
	@GetMapping("/emp")
	public List<Employee> getAllEmployee(){
		List<Employee> emp = employeefeign.getAllEmployee();
		return emp;
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee employeeById = employeefeign.getEmployeeById(id);
		return employeeById;
	}
	
	@GetMapping("/dep")
	public List<Department> showAllDepartment(){
		List<Department> dep = departmentfeign.showAllDepartment();
		return dep;
	}
	

	@GetMapping("/dep/{id}")
	public Department getDepartmentById(@PathVariable int id) {
		Department departmentById = departmentfeign.getDepartmentById(id);
		return departmentById;
	}
	
	  @GetMapping("/loc") public List<Location> showAlldata()
	  { 
		  List<Location> loc = locationfeign.showAlldata(); 
		  return loc; 
	 }
	 
	  @GetMapping("/loc/{id}")
	 public Location showLocationById(@PathVariable int id) {
		 Location showLocById = locationfeign.showLocationById(id);
		 return showLocById;
		 
	 }
	 
	
	

}
