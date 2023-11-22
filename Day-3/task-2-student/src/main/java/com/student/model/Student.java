package com.student.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private Integer studentId;
	private String name;
	private int age;
	private double salary;

}
