package com.microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bean.Employee;
import com.microservice.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeerepository;
	
	public List<Employee> getAllEmployee() {	
		return employeerepository.findAll();
	}

	public Employee getEmployeeById(int id) {

		Optional<Employee> findById = employeerepository.findById(id);
		Employee e = null;
		if(findById.isPresent()) {
			e=findById.get();
		}
		return e;
	}

}
