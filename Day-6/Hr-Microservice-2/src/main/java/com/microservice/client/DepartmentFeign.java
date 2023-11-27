package com.microservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.bean.Department;

@FeignClient(url = "http://localhost:9999/department",name = "department-microservice")
public interface DepartmentFeign {
	
	@GetMapping("/depts")
	public List<Department> showAllDepartment();
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable int id);

}
