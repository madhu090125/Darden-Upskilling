package com.student.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@WebMvcTest
@ContextConfiguration(classes = {StudentController.class})
public class StudentControllerTest {
		
	@MockBean
	private StudentService studentService;
	
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper mapper;
	
	public static Student student = new Student();
	
	@BeforeAll
	static void beforeAll() {
		student.setName("Madhusree");
		student.setAge(12);
		student.setSalary(12000);
		student.setStudentId(100);
	}
	
	@Test
	void viewAll() throws Exception {
		List<Student> listOfStudent = new ArrayList<>();
		Mockito.when(studentService.viewAll()).thenReturn(listOfStudent);
		mockMvc.perform(MockMvcRequestBuilders.get("/student/viewAll")
				       .contentType(MediaType.APPLICATION_JSON));	
	}
	
	@Test
	void addNewStudent() throws Exception {
		Mockito.when(studentService.addNewStudent(Mockito.any())).thenReturn(student);
		mockMvc.perform(MockMvcRequestBuilders.post("/student/addNewStudent")
				        .contentType(MediaType.APPLICATION_JSON)
				        .content(mapper.writeValueAsString(student)));
	}
	
	@Test
	void updateStudentDetail() throws Exception {
		Mockito.when(studentService.updateStudentDetail(Mockito.any())).thenReturn(student);
		mockMvc.perform(MockMvcRequestBuilders.put("/student/update").contentType(MediaType.APPLICATION_JSON)
		        .content(mapper.writeValueAsString(student)));
	}
	
	@Test
	void deleteStudentDetail() throws Exception {
		Mockito.when(studentService.deleteStudentDetails(student.getStudentId())).thenReturn("Success");
		mockMvc.perform(MockMvcRequestBuilders.delete("/student/delete/{id}",student.getStudentId())
				.param("Success", "Y"));
	}

}
