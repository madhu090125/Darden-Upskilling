package com.student.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;


import com.student.model.Student;
import com.student.repository.StudentRepository;

@WebMvcTest
@ContextConfiguration(classes = {StudentServiceImpl.class})
@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {
	
	@MockBean
	private StudentRepository studentRepository;
	
	@MockBean
	private StudentServiceImpl studentServiceImpl;
	
	public static Student student = new Student();
	
	@BeforeAll
	static void beforeAll() {
		student.setName("Madhusree");
		student.setAge(12);
		student.setSalary(12000);
		student.setStudentId(100);
	}
	
	@Test
	void addNewStudent() {
		Mockito.when(studentRepository.save(student)).thenReturn(student);	
	}
	
		

}
