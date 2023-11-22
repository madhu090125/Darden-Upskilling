package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.model.Student;

@Service
public interface StudentService {

	List<Student> viewAll();

	Student addNewStudent(Student student);

	Student updateStudentDetail(Student student);

	String deleteStudentDetails(int id);

}
