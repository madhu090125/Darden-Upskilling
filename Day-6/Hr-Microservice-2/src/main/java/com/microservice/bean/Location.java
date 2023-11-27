package com.microservice.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Location {

	private int locid;
	private String locname;
	public Location(int locid, String locname) {
		super();
		this.locid = locid;
		this.locname = locname;
	}
	public Location() {
	
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
	
	

}
