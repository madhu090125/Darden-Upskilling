package com.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}
