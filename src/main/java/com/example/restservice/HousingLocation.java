package com.example.restservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("locations")
public record HousingLocation(@Id int id,
    String name, 
    String city, 
    String state, 
    String photo, 
    int availableUnits, 
    boolean wifi, 
    boolean laundry
 ) {}
