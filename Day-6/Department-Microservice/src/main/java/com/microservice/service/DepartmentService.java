package com.microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import com.microservice.bean.Department;
import com.microservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentrepository;

	public List<Department> showAllDepartment() {
		return departmentrepository.findAll();
	}

	public Department getDepartmentById(int id) {
		Optional<Department> findDepId = departmentrepository.findById(id);
		Department d = null;
		if(findDepId.isPresent()) {
			d = findDepId.get();
		}
		return d;
	}

}
