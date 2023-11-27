package com.microservice.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="department")
public class Department {
	
	@Id
	private int deptid;
	private String dname;
	private int locid;
	
	public Department(int deptid, String dname, int locid) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.locid = locid;
	}
	public Department() {
		
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getLocid() {
		return locid;
	}
	public void setLocid(int locid) {
		this.locid = locid;
	}
	
	
	

}
