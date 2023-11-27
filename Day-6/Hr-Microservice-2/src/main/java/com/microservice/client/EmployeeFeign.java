package com.microservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.bean.Employee;

@FeignClient(url = "http://localhost:9000/employee",name = "department-microservice")
public interface EmployeeFeign {

	@GetMapping("/emps")
	public List<Employee> getAllEmployee();
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id);
}
