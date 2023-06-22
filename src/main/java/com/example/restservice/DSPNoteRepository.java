package com.example.restservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200, angularing.vercel.app")
@RepositoryRestResource(collectionResourceRel = "dspnotes", path = "dspnotes")
public interface DSPNoteRepository extends MongoRepository<DSPNote, String> {
    @Query("{name:'?0'}")
    DSPNote findItemByName(String name);

    @Query(value="{category:'?0'}", fields="{'name' : 1}")
    List<DSPNote> findAll(String category);

    public long count();
}
