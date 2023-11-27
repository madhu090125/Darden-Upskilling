package com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservice.client.AuthFeign;
import com.microservice.model.AuthResponse;

@Service
@EnableFeignClients(basePackages = "com.microservice.client")
public class UserService {
	
	@Autowired
	AuthFeign authfeign;
	
	@Autowired
	AuthResponse authresponse;
	
	public boolean isSessionValid(String token) {
		
		
	     ResponseEntity<?> authResponse = authfeign.getValidity(token);
			if(authResponse==null) {
				throw new RuntimeException("Auth reponse returned as  NULL");
			}
			String role = authresponse.getRole().substring(5);
			if(role.equals("USER")) {
				return true;
			}
			else {
				return false;
			}
			
			
		}

}
