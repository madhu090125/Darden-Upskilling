package com.microservice.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private int deptid;
	
	public Employee(int id, String name, int deptid) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
	}
	public Employee() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

}
