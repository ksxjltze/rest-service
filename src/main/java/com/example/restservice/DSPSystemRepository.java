package com.example.restservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "dspsystems", path = "dspsystems")
public interface DSPSystemRepository extends MongoRepository<DSPSystem, String> {
    @Query("{name:'?0'}")
    DSPSystem findItemByName(String name);

    @Query(value="{name:'?0'}", fields="{'name' : 1}")
    List<DSPSystem> findAll(String name);

    public long count();
}
