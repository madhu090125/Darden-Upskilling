package com.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bean.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
