package com.student.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping("/viewAll")
	public List<Student> viewAll(){
		logger.info("List of students available has started..........");
		return studentService.viewAll();
	}
	
	@PostMapping("/addNewStudent")
	public Student addNewStudent(@RequestBody Student student) {
		logger.info("Adding a new student to database has started..........");
		return studentService.addNewStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateStudentDetail(@RequestBody Student student) {
		logger.info("Updating the existing details of the student has started..........");
		return studentService.updateStudentDetail(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudentDetail(@PathVariable int id) {
		logger.info("Deleting the student details has started..........");
		return studentService.deleteStudentDetails(id);		
	}

}
