package com.microservice.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bean.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Integer>{

}
