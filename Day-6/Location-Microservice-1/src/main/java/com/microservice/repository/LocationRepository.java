package com.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bean.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location, Integer> {

}
