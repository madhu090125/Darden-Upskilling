package com.microservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.bean.Department;
import com.microservice.bean.Location;

@FeignClient(url = "http://localhost:7777/location",name = "location-microservice")
public interface LocationFeign {

	@GetMapping("/locs")
	public List<Location> showAlldata();
	
	@GetMapping("/{id}")
	public Location showLocationById(@PathVariable int id);
}
