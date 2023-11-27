package com.microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bean.Location;
import com.microservice.repository.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	LocationRepository locationrepository;

	public List<Location> showAlldata() {
		return locationrepository.findAll();
	}

	public Location showLocationById(int id) {
		Optional<Location> findLocId = locationrepository.findById(id);
		Location l = null ; 
		if(findLocId.isPresent()) {
			l=findLocId.get();
		}
		return l;
	}

}
