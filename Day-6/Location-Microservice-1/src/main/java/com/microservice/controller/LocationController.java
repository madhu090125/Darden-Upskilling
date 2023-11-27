package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.Location;
import com.microservice.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	LocationService locationservice;
	
	@GetMapping("/locs")
	public List<Location> showAlldata(){
		return locationservice.showAlldata();
	}
	
	@GetMapping("/{id}")
	public Location showLocationById(@PathVariable int id) {
		return locationservice.showLocationById(id);
	}

}
