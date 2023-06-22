package com.example.restservice;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document("dspnotes")
public record DSPNote (@Id ObjectId id, String name, String description, @DocumentReference DSPSystem system){

}
