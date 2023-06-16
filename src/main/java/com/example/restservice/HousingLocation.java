package com.example.restservice;

public record HousingLocation(
    int id, 
    String name, 
    String city, 
    String state, 
    String photo, 
    int availableUnits, 
    boolean wifi, 
    boolean laundry
 ) {}
