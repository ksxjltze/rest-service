package com.example.restservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200, https://angularing.vercel.app")
@RepositoryRestResource(collectionResourceRel = "locations", path = "locations")
public interface HousingLocationRepository extends MongoRepository<HousingLocation, Integer> {
    @Query("{name:'?0'}")
    HousingLocation findItemByName(String name);

    @Query(value="{city:'?0'}", fields="{'name' : 1}")
    List<HousingLocation> findAll(String city);

    public long count();
}
