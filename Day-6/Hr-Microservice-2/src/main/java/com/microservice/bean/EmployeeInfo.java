package com.microservice.bean;

public class EmployeeInfo {
	
	private int id;
	private String name;
	private int deptid;
	private String dname;
	private int locid;
	private String locname;
	public EmployeeInfo(int id, String name, int deptid, String dname, int locid, String locname) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.dname = dname;
		this.locid = locid;
		this.locname = locname;
	}
	public EmployeeInfo() {
		
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
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", name=" + name + ", deptid=" + deptid + ", dname=" + dname + ", locid="
				+ locid + ", locname=" + locname + "]";
	}
	
	


}
 